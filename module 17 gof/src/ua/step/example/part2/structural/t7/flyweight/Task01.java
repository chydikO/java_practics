package ua.step.example.part2.structural.t7.flyweight;

import java.awt.Color;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * Flyweight используется для уменьшения затрат при работе с большим количеством
 * мелких объектов. При проектировании приспособленца необходимо разделить его
 * свойства на внешние и внутренние. Внутренние свойства всегда неизменны, тогда
 * как внешние могут отличаться в зависимости от места и контекста применения и
 * должны быть вынесены за пределы приспособленца.
 * 
 * Flyweight дополняет шаблон Factory Method таким образом, что при обращении
 * клиента к Factory Method для создания нового объекта ищет уже созданный
 * объект с такими же параметрами, что и у требуемого, и возвращает его клиенту.
 * Если такого объекта нет, то фабрика создаст новый.
 */
public class Task01
{
    public static void main(String[] args)
    {
        FontData fontData = FontData.create(10, "Arial", Color.BLACK, FontEffect.BOLD, FontEffect.ITALIC);
        System.out.println(fontData);
    }
}

enum FontEffect
{
    BOLD, ITALIC, SUPERSCRIPT, SUBSCRIPT, STRIKETHROUGH
}

final class FontData
{
    /**
     * A weak hash map will drop unused references to FontData. Values have to
     * be wrapped in WeakReferences, because value objects in weak hash map are
     * held by strong references.
     */
    private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData = new WeakHashMap<FontData, WeakReference<FontData>>();
    private final int pointSize;
    private final String fontFace;
    private final Color color;
    private final Set<FontEffect> effects;

    private FontData(int pointSize, String fontFace, Color color, EnumSet<FontEffect> effects)
    {
        this.pointSize = pointSize;
        this.fontFace = fontFace;
        this.color = color;
        this.effects = Collections.unmodifiableSet(effects);
    }

    public static FontData create(int pointSize, String fontFace, Color color, FontEffect... effects)
    {
        EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
        effectsSet.addAll(Arrays.asList(effects));
        // We are unconcerned with object creation cost, we are reducing overall
        // memory consumption
        FontData data = new FontData(pointSize, fontFace, color, effectsSet);
        if (!flyweightData.containsKey(data))
        {
            flyweightData.put(data, new WeakReference<FontData>(data));
        }
        // return the single immutable copy with the given values
        return flyweightData.get(data).get();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof FontData)
        {
            if (obj == this)
            {
                return true;
            }
            FontData other = (FontData) obj;
            return other.pointSize == pointSize && other.fontFace.equals(fontFace) && other.color.equals(color)
                    && other.effects.equals(effects);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return (pointSize * 37 + effects.hashCode() * 13) * fontFace.hashCode();
    }

    // Getters for the font data, but no setters. FontData is immutable.
}