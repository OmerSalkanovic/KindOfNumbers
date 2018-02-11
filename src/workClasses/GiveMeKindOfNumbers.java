package workClasses;

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

	}

	public static void printMarsennePrimeNumbers() {

	}

	public static void printArmstrongNumbers() {

	}

	public static void contrloMethod() {	
		printPrimeNumbers();
		printEmirpNumbers();
	}
}
