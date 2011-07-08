package projecteuler.problems;

/**
 * Using the mod operator to check every natural number
 * up to the limit.
 */
public class Problem1 {
	
	public static void main(String[] args) {
		int limit = 1000;
		int total = 0;
		
		for (int i=1; i<limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}
		
		System.out.println("total=" + total);
	}
}