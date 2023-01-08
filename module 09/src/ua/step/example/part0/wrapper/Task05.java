package ua.step.example.part0.wrapper;

/**
 * 
 * Константы классов оберток. 
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        System.out.println("0/0f = " + 0/0f);
        System.out.println("1/.0 = " + 1/.0);
        System.out.println("-1/0.0 = " + -1/0.0);
        
        System.out.println(Float.NaN); 
        System.out.println(Float.POSITIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println();
        
        float nan = 0/0f;
        System.out.println("nan == nan is " + (nan == nan));
        System.out.println("NaN " + Float.isNaN(nan));
        System.out.println("Infinity " + Float.isInfinite(1/0f));
        System.out.printf("Max float value %.2f \n", Float.MAX_VALUE);
        System.out.printf("Min float value %.60f \n", Float.MIN_VALUE);
        System.out.printf("Max exponent %d \n", Float.MAX_EXPONENT);
        System.out.printf("Min exponent %d\n", Float.MIN_EXPONENT);
        System.out.printf("Min normal %.54f\n", Float.MIN_NORMAL);
        
        System.out.println();
        System.out.printf("Bit size byte %d \n", Byte.SIZE);
        System.out.printf("Bit size char %d \n", Character.SIZE);
        System.out.printf("Bit size short %d \n", Short.SIZE);
        System.out.printf("Bit size int %d \n", Integer.SIZE);
        System.out.printf("Bit size int %d \n", Integer.SIZE);
        System.out.printf("Bit size float %d \n", Float.SIZE);
        System.out.printf("Bit size double %d \n", Double.SIZE);
        
        System.out.printf("%c", Character.DECIMAL_DIGIT_NUMBER);
    }
}
