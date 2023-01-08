package ua.step.example.part1.generative.t2.prototype.model;

/**
 * Клонирующая машина для печения
 */
public class CookieMachine
{
    // Could have been a private Cloneable cookie.
    private Cookie cookie;

    public CookieMachine(Cookie cookie)
    {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException
    {
        return (Cookie) this.cookie.clone();
    }
}