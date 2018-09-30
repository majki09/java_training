package com.majkisoft.first;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// zad 1.1
		/*
		System.out.println("Podaj rok urodzenia: ");

		int rokUrodzenia = input.nextInt();

		System.out.println("Masz " + (2018 - rokUrodzenia) + " lat");
		*/

		// zad 1.3
		/*
		System.out.println("Podaj dwie liczby do liczenia:");

		int a = input.nextInt();
		int b = input.nextInt();


//		System.out.format("Suma %d i %d wynosi %d", a, b, Dodawanie(a, b));
//		System.out.format("Różnica %d i %d wynosi %d", a, b, Odejmowanie(a, b));
//		System.out.format("Iloczyn %d i %d wynosi %d", a, b, Iloczyn(a, b));

		System.out.println("Suma " + a + " i " + b + " wynosi " + Dodawanie(a, b));
		System.out.println("Różnica " + a + " i " + b + " wynosi " + Odejmowanie(a, b));
		System.out.println("Iloczyn " + a + " i " + b + " wynosi " + Iloczyn(a, b));
		*/

		// zad 1.4
		/*
		System.out.println("Podaj liczbę do sprawdzenia, czy jest parzysta:");
		int a = input.nextInt();

		if (CzyParzysta(a))
			System.out.println(a + " jest parzysta");
		else
			System.out.println(a + " nie jest parzysta");
		*/

		// zad 1.5
		/*
		System.out.println("Podaj liczbę do sprawdzenia, czy jest podzielna przez 3 i przez 5:");
		int a = input.nextInt();

		if (a % 3 == 0 && a % 5 == 0)
			System.out.println(a + " jest podzielna przez 3 i 5");
		else
			System.out.println(a + " nie jest podzielna przez 3 i 5");
		*/

		// zad 1.6
		/*
		System.out.println("Podaj liczbę do podniesienia do 3 potęgi:");
		int a = input.nextInt();
		System.out.println("3. potęga liczby " + a + " wynosi " + Math.pow(a, 3));
		*/

		// zad 1.7
		/*
		System.out.println("Podaj liczbę do policzenia pierwiastka kwadratowego:");
		int a = input.nextInt();
		System.out.println("Pierwiastek kwadratowy liczby " + a + " wynosi " + Math.sqrt(a));
		*/

		// zad 1.8
		System.out.println("Podaj 3 liczby do sprawdzenia, czy da się znich zbudować trójkąt prostokątny:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int max = a;
		int drugi = b;
		int trzeci = c;

		if (b > a && b > c) {
			max = b;
			drugi = a;
			trzeci = c;
		} else if (c > a && c > b) {
			max = c;
			drugi = a;
			trzeci = b;
		}

		System.out.println(drugi * drugi + trzeci * trzeci == max * max);
	}

	private static int Dodawanie(int a, int b)
	{
		return a + b;
	}

	private static int Odejmowanie(int a, int b)
	{
		return a - b;
	}

	private static int Iloczyn(int a, int b)
	{
		return a * b;
	}

	private static boolean CzyParzysta(int a)
	{
		return a % 2 == 0;
	}
}