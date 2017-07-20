public class PrimeNumber {
	// Using Sieve of Eratosthenes

	public static void main(String[] args) {

		isPrime(3000000);
	}

	public static void isPrime(int n) {
		if(n<=2) System.out.println(0);
		
		// new array of booleans
		boolean[] num = new boolean[n];
		
		// All slots in array as prime
		for (int i = 2; i < n; i++)
			num[i] = true;
		
		// Multiples of primes set as false
		for (int i = 2; i <= n-1; i++) {
			if (num[i]) {
				for (int j = i + i; j < n; j = j + i)
					num[j] = false;
			}
		}
		
		int count = 0;
		for (int i = 2; i<n; i++){
			if(num[i]) count++;
		}
		System.out.println(count);
	}
}