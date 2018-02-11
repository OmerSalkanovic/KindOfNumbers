package workClasses;

public class Methods {

	public static boolean isPrime(int number) {

		for (int j = 2; j < number; j++) {

			if (number % j == 0)
				return false;
		}
		return true;
	}

	public static boolean isEmirp(int number) {

		int copyNumber = number, emirpNumber = 0, e = 1;

		while (copyNumber > 10) {
			e = e * 10;
			copyNumber = copyNumber / 10;
		}

		copyNumber = number;

		while (copyNumber > 0) {

			emirpNumber = ((copyNumber % 10) * e) + emirpNumber;
			copyNumber = copyNumber / 10;
			e = e / 10;
		}

		if (isPrime(number) && isPrime(emirpNumber))
			return true;
		else
			return false;

	}
}
