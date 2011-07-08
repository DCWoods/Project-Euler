package projecteuler.problems;

public class Problem4 {

    public static void main(String[] args) {
        int largest = 0;
        for (int i=999; i>99; i--) {
            for (int j=999; j>99; j--) {
                int x = i*j;
                
                if (x > largest) {
                    String xStr = String.valueOf(x);
                    if (isPalindrome(xStr)) {
                        largest = x;
                    }
                }
            }
        }
        System.out.println("Largest palindrome is " + largest);
    }
    
    private static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int i=0, j=c.length-1; i<j; i++, j--) {
            if (c[i] != c[j]) {
                return false;
            }
        }
        return true;
    }
}
