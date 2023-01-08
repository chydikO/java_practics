package ua.step.example.part0.wrapper;

/**
 * Классы - обертки примитивных типов.  
 */
public class Task00
{
    @SuppressWarnings("unused")
	public static void main(String[] args)
    {
        Byte byte1 = new Byte((byte)1);
        Byte byte2 = new Byte("1");
        //Byte byte3 = new Byte("128"); // так нельзя
        
        Short short1 = new Short((short) 2);
        Short short2 = new Short("11111");
        
        Integer integer = new Integer(3);
        Integer integer1 = new Integer("1111111");
        
        Long long1 = new Long(4L);
        
        Float float1 = new Float(1.1f); 
        Float float2 = new Float(1.1); // можно double
        Float float3 = new Float(1); // можно int
        Float float4 = new Float(1L); // можно long
        Float float5 = new Float("1.1"); // можно String
        
        Double double1 = new Double(1.1);
        Double double2 = new Double(1.1f); // можно float
        Double double3 = new Double(1); // можно int
        Double double4 = new Double(1L); // можно long
        
        Boolean boolean1 = new Boolean(true);
        Boolean boolean2 = new Boolean(false);
        Boolean boolean3 = new Boolean("TRUE");
        Boolean boolean4 = new Boolean("FALSE");
        Boolean boolean5 = new Boolean("limbo");
        
        Character character = new Character('a'); // только один конструктор
        
        // класс Number является суперклассом для всех классов оберток кроме Boolean и Character  
        Number n1 = new Byte((byte) 3);
        Number n2 = new Short((short) 3);
        //Number n3 = new Character('3');
        Number n4 = new Integer(3);
        Number n5 = new Long(3);
        Number n6 = new Float(3);  
        Number n7 = new Double(3);
        //Number n8 = new Boolean("true");
    }
}
