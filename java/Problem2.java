package projecteuler.problems;

public class Problem2 {

    public static void main(String[] args) {
        int limit = 4000000;
        int total = 0;
        int x = 1;  // the current term
        int x1 = 0; // the term 1 prior in the series
        
        while (x < limit) {
        	total += x % 2 == 0 ? x : 0;
        	int oldx1 = x1;
        	x1 = x;
        	x = x + oldx1;
        }

        System.out.println("total=" + total);
    }
}
