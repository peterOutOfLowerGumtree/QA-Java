public class PrimeNumber2 {
	// Using Sieve of Eratosthenes
	// Takes far too long to complete

	public static void main(String[] args) {

		isPrime(2000000000);
	}

	public static void isPrime(int n) {
		if (n <= 2)
			System.out.println(0);

		// new array of booleans
		boolean[] num = new boolean[n];

		// All slots in array as prime
		for (int i = 2; i < n; i++)
			num[i] = true;

		// Multiples of primes set as false
		for (int i = 2; i <= n - 1; i++) {
			if (num[i]) {
				// System.out.println(n/3);

				for (int j = i + i; j < n; j++) {
					try {
						if(i%j==0)
						num[j] = false;
					} catch (Exception ex) {
						System.out.println(ex.toString() + j + "" + i);
					}
				}
			}
		}

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (num[i])
				count++;
		}
		System.out.println(count);
	}
}