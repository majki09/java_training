package com.majkisoft.obiektyipakiety;

public class Human implements Mammal
{
    private int age;
    private int weight;
    private int height;
    private int health;
    private String name;
    private boolean sex;

    public Human(int a, int w, int mHeight, int mHealth, String n, boolean s)
    {
        age = a;
        weight = w;
        height = mHeight;
        health = mHealth;
        name = n;
        sex = s;
    }

    @Override
    public void eat(int mKcal)
    {
        weight += mKcal;
    }

    public void sleep()
    {
        if (health < 100)
            health += 1;
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
