package projecteuler.problems;

import projecteuler.utility.Util;

public class Problem7 {

    public static void main(String[] args) {
         int numPrimes = 10001;
         int primeCount = 0;
         
         int n = 1;
         while (primeCount < numPrimes) {
             n++;
             if (Util.isPrime(n)) {
                 primeCount++;
             }
         }
        
         System.out.println("target prime = " + n);
     }
}
