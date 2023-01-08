package ua.step.example.part7.gof;

import ua.step.example.part7.gof.model.singelton.DclSingleton;
import ua.step.example.part7.gof.model.singelton.EnumSingleton;
import ua.step.example.part7.gof.model.singelton.LazySingleton;
import ua.step.example.part7.gof.model.singelton.SimpleSingleton;

/**
 * 
 * Сингелтон
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        SimpleSingleton singelton = SimpleSingleton.INSTANCE;
        //new SimpleSingleton();
        singelton.test();
        
        LazySingleton lazySingelton = LazySingleton.getInstance();
        lazySingelton.test();
        
        EnumSingleton enumSingelton = EnumSingleton.INSTANCE;
        enumSingelton.test();
        
        DclSingleton dclSingelton = DclSingleton.getInstance();
        dclSingelton.test();
    }
}
