package com.majkisoft.tablice;

public class cw1
{
    public int sum(int[] numbers)
    {
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args)
    {
        int[] liczby = {8, 5};
        System.out.println(oblicz());
        System.out.println();
    }

    public int eval()
    {
        int[] liczby = {2, 8};
        return sum(liczby);
    }

    public static int oblicz()
    {
        cw1 cwiczenie = new cw1();
        int[] liczben = {6, 2};
        return cwiczenie.sum(liczben);
    }
}
