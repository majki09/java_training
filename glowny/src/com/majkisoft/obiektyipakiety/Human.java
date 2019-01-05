package com.majkisoft.obiektyipakiety;

public class Human
{
    private int age;
    private int weight;
    private int height;
    private String name;
    private boolean sex;

    public Human(int a, int w, int h, String n, boolean s)
    {
        age = a;
        weight = w;
        height = h;
        name = n;
        sex = s;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }

    public boolean isMale()
    {
        return sex;
    }
}
