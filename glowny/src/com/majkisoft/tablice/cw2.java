package com.majkisoft.tablice;

public class cw2
{
    int max(int[] numbers)
    {
        int maximum = numbers[0];

        if (numbers[1] > maximum)
            maximum = numbers[1];
        if (numbers[2] > maximum)
            maximum = numbers[2];

        return maximum;
    }

    public static void main(String[] args)
    {
        cw2 cwiczenie = new cw2();
        int[] liczby = {-5, -8, -8};

        System.out.println(cwiczenie.max(liczby));
    }
}
