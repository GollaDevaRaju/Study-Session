public class SimplePrime {
    
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 up to n - 1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }

        return true; // No factors found, so it is prime
    }

    public static void main(String[] args) {
        int number = 7; // Change this number to test others

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
