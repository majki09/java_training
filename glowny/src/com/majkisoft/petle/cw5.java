package com.majkisoft.petle;

public class cw5
{
    public static void main(String[] args)
    {
//        cw5 cwiczenie = new cw5();  // nie trzeba, bo metoda sum też jest static
        int[] liczby = {1, 5, 7, 3, 7, 8};

        System.out.println(sum(liczby));
    }

    private static int sum(int[] tab)
    {
        int suma = 0;

//        for (int i = 0; i < tab.length; i++) {
//            suma += tab[i];
//        }

        for (int i : tab) {
            suma += i;
        }

        return suma;
    }
}
