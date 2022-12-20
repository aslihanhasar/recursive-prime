import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number == i) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return isPrime(number, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i = 2;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (isPrime(number, i)) {
                System.out.println("This number is a prime number.");
            } else {
                System.out.println("This number is not a prime number.");
            }
        } while (number >= 0);
    }
}
