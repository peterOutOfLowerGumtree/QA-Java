
public class PrimeNumber3 {
	// Using Sieve of Eratosthenes
	public static void main(String[] args) {

		isPrime(2000000000);
		
	}

	public static void isPrime(int n) {
		// new array of booleans
		int count1 = 0;
		int count2 = 0;
		int nSQRT = (int) Math.sqrt(n);
		boolean[] primes = new boolean[n + 1];
		for (int m = 2; m <= nSQRT; m++) {              // primes between 2 & n^(-2)
			if (!primes[m]) {
				count1++;
				for (int k = m * m; k <= n; k += m)     // remove multiples of m where m is prime
					primes[k] = true;
			}
		}
		for (int m = nSQRT; m <= n; m++){
			if (!primes[m]){
				count2++;
			}}
		System.out.println(count1+count2);
	}
}