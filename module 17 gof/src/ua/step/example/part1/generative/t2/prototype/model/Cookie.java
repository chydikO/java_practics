package ua.step.example.part1.generative.t2.prototype.model;

public class Cookie
{
    protected int weight;

    @Override
    public Cookie clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
       
        // При фактической реализации этого шаблона  вы можете изменить ссылки на
        // производство деталей из копий, которые хранятся внутри прототипа.

        return copy;
    }
}
