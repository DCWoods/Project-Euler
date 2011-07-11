package projecteuler.utility;

public class Util {
    
    public static boolean isPrime(long n) {
         for (long i=2; i<=Math.sqrt(n); i++) {
             if (n % i == 0) {
                 return false;
             }
         }
         return true;
    }
}
