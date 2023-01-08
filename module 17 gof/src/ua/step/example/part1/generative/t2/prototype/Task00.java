package ua.step.example.part1.generative.t2.prototype;

import ua.step.example.part1.generative.t2.prototype.model.CoconutCookie;
import ua.step.example.part1.generative.t2.prototype.model.Cookie;
import ua.step.example.part1.generative.t2.prototype.model.CookieMachine;

public class Task00
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cookie tempCookie = null;
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < 100; i++)
        tempCookie = cm.makeCookie();
        System.out.println(tempCookie);
    }
}
