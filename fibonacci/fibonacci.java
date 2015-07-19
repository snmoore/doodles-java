/**
 * Generate the first 13 terms of the Fibonacci sequence:
 * 		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * <p>
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
 * <pre>F_n = F_{n-1} + F_{n-2}</pre>
 * with seed values
 * <pre>F_1 = 1, F_2 = 1</pre>
 * or (modern usage)
 * <pre>F_0 = 0, F_1 = 1</pre>
 * 
 * @see <a href="https://en.wikipedia.org/wiki/Fibonacci_number">Wikipedia</a>                                              
 */
public class fibonacci {
	public static void main(String[] args) {
		iterative(13);

		recursive(13);
}
	
	/**
	 * Iteratively print the Fibonacci sequence
	 * @param n The number of terms to generate
	 */
	public static void iterative(int n) {
		System.out.println("Iterative:");

		int Fn = 0;
	    int Fn1 = 0;
	    int Fn2 = 1;
	    int i = 0;
		
	    System.out.printf("%d %d ", Fn1, Fn2);
	    for (i = 2; i < 13; i++)
	    {
	        Fn = Fn1 + Fn2;
	        Fn1 = Fn2;
	        Fn2 = Fn;
	        System.out.printf("%d ", Fn);
	    }
		System.out.println("\n");
	}

	/**
	 * Recursively print the Fibonacci sequence
	 * @param n The number of terms to generate
	 */
	public static void recursive(int n) {
		System.out.println("Recursive:");
		
		int i = 0;
		for (i = 0; i < n; i++)
	    {
	        System.out.printf("%d ", recurse(i));
	    }
	}

	/**
	 * Value of the nth term of the Fibonacci sequence, using recursion
	 * @param n The nth term to generate
	 * @return The value of the nth term
	 */
	public static int recurse(int n) {
		if(n == 0)
		{
			return 0;
		}
		if((n == 1) || (n == 2)) {
			return 1;
		}
		else {
			return recurse(n-1) + recurse(n-2);
		}
	}

}
