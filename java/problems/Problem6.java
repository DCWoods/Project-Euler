package projecteuler.problems;

public class Problem6 {

    public static void main(String[] args) {
        int n = 100;
        
        int sqrSum = 0, sumSqrs = 0;
        for (int i=1; i<=n; i++) {
            sqrSum += i;
            sumSqrs += i*i;
        }
        sqrSum *= sqrSum;
        
        int difference = sqrSum - sumSqrs;
        
        System.out.println("Difference = " + difference);
    }
}