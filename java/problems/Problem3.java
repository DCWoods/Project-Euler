package projecteuler.problems;

public class Problem3 {
    
    public static void main(String[] args) {
        long x = 600851475143L;
        
        for (long lowFactor=2; lowFactor<x/2; lowFactor++) {
            double highFactor = (double) x / lowFactor;
            
            // check if the high factor is integer
            if (highFactor % 1 == 0) {
                // check if prime
                boolean prime = true;
                double limit = highFactor;
                for (long i=2; i<limit; i++) {
                    if (highFactor % i == 0) {
                        // highFactor is not prime, it is divisible by i. Adjust
                        // the maximum considered factor of highFactor
                        limit = highFactor / i;
                        prime = false;
                        break;
                    }
                }
                   
                if (prime) {
                    System.out.println("Largest prime factor of " + 
                            x + " is " + (long) highFactor);
                    return;
                }
            }
        }
    }
}