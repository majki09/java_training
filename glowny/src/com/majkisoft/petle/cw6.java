package com.majkisoft.petle;

public class cw6
{
    public static void main(String[] args)
    {
//        cw5 cwiczenie = new cw5();  // nie trzeba, bo metoda sum też jest static
        int[][] liczby = {{1, 5, 7, 3, 7, 8}, {2, 4, 6}};

        System.out.println(sum(liczby));
    }

    private static int sum(int[][] tab)
    {
        int suma = 0;

        for (int[] j : tab)
            for (int i : j) {
                suma += i;
            }

            
        return suma;
    }
}
