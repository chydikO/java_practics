package ua.step.homework;

import java.util.Scanner;

/**
 * В языке Java принято первое слово, входящее в название переменной записывать
 * с маленькой латинской буквы, следующее слово идёт с большой буквы (только
 * первая буква слова большая), слова не имеют разделителей и состоят только из
 * латинских букв. Например, правильные записи переменных в Java могут выглядеть
 * следующим образом: javaIdentifier, longAndMnemonicIdentifier, name, nEERC. В
 * языке C++ для описания переменных используются только маленькие латинские
 * символы и символ "_", который отделяет непустые слова друг от друга. Если
 * строка имеет смешанный синтаксис например java_Identifier сообщить об этом.
 * Примеры: java_identifier, long_and_mnemonic_identifier, name, n_e_e_r_c. Вам
 * требуется написать программу, которая преобразует переменную, записанную на
 * одном языке в формат другого языка. Идентификатор (имя) переменной должен
 * вводится с клавиатуры. Программа должна определить, с какого языка взята
 * переменная и переделать её в переменную другого языка. Вывести результат на
 * консоль.
 */
public class Task08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Название переменной");
        String line = scanner.nextLine();
    }
}
