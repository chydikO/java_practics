package ua.step.example.solid;

import ua.step.example.solid.model5.D.SmtpPotocol;

/**
 * D- инверсия контроля, зависеть надо от абстракций
 */
public class Task06
{
    public static void main(String[] args)
    {
        Mailer mailer = new Mailer();
        mailer.sendMessage("test message");
    }
}

/**
 * 
 * Класс для отправки почтовых сообщений
 *
 */
class Mailer
{
    SmtpPotocol smtpPotocol = new SmtpPotocol();

    public void sendMessage(String message)
    {
        smtpPotocol.send(message);
    }
}