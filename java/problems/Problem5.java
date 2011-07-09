package projecteuler.problems;

public class Problem5 {

    public static void main(String[] args) {
        int divisorLimit = 20;
        
        int x = divisorLimit-1;
        boolean foundNumber = false;
        while (!foundNumber) {
            x++;
            foundNumber = true;
            for (int i=1; i<=divisorLimit; i++) {
                if (x % i != 0) {
                    foundNumber = false;
                    break;
                }
            }
        }
        
        System.out.println("Answer = " + x);
    }
}