package workClasses;

import java.util.Scanner;

public class GiveMeKindOfNumbers extends Methods {

	public static void printPrimeNumbers() {

		for (int i = 1; i < 1000; i++)
			if (isPrime(i))
				System.out.print(i + " ");

	}

	public static void printEmirpNumbers() {

		int emirps = 0;
		for (int i = 1; emirps <= 100; i++)
			if (isEmirp(i)) {
				System.out.print(i + " ");
				emirps++;
			}
	}

	public static void printFibonacciNumbers() {
		
		 int n1 = 0, n2 = 1, num;
		 
	        System.out.print("Fibonacci numbers less than 100: " + n1 + " " + n2 + " ");
	
	        for (int i = 0; i < 10; i++) {
	        	num = n2 + n1;
	            System.out.print(num + " ");
	            n1 = n2;
	            n2 = num;
	        }
	}

	public static void printMarsennePrimeNumbers() {
		
		System.out.println("Marsenne primes with p <= 31 are:");
		for (int i = 2; i <= 34; i++) {
	      if (isPrime(i) && isPrime((int) (Math.pow(2, i)-1))) {
	          System.out.print(i + " ");
	      }
	    }

	}

	public static void printArmstrongNumbers() {

		int num, rem, limit = 1000, sum = 0;
		System.out.print("Armstrong numbers from 1 to 1000 are: ");
		for (int i = 1; i <= limit; i++) {
			num = i;
			while (num > 0) {
				rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}

			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}

	}

	public static void contrloMethod() {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter option you want to execute: \n" + " 1 prime numbers \n"
				+ " 2 first 100 emirps \n" + " 3 Fibonacci  numbers \n" + " 4 Marsenne primes\n"
				+ " 5 Armstrong numbers \n" + " 6 Control Method");

		int opcija;
		opcija = input.nextInt();
		System.out.println("Izabrali ste: " + opcija);

		if (opcija == 1) {
			printPrimeNumbers();
		}
		if (opcija == 2) {
			printEmirpNumbers();
		}
		if (opcija == 3) {
			printFibonacciNumbers();
		}
		if (opcija == 4) {
			printMarsennePrimeNumbers();
		}
		if (opcija == 5) {
			printArmstrongNumbers();
		}
		if (opcija == 6) {
			contrloMethod();
		}

		input.close();

	}
}
