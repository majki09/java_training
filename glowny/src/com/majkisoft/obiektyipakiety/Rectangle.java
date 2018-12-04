package com.majkisoft.obiektyipakiety;

public class Rectangle
{
    private int a;
    private int b;

    public int Pole(int x, int y)
    {
        a = x;
        b = y;
        return a * b;
    }

    public int Obwod(int x, int y)
    {
        a = x;
        b = y;
        return 2 * a + 2 * b;
    }

    public double Przekatna(int x, int y)
    {
        a = x;
        b = y;
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
