package com.majkisoft.obiektyipakiety;

public class MyNumber
{
    private int a;

    public MyNumber(int x)
    {
        a = x;
    }

    public boolean isOdd(int x)
    {
        a = x;
        return (a % 2 != 0) ? true : false;
    }

    public boolean isEven(int x)
    {
        a = x;
        return (a % 2 == 0) ? true : false;
    }

    public double sqrt(int x)
    {
        a=x;
        return Math.sqrt(a);
    }

//    public double pow(MyNumber x)  // do rozwiązania potem
//    {
////        a=x;
//        return (double)Math.pow(a,x);
//    }
}
