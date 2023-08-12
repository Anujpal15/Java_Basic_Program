package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphabetToPrimeConverter {
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> generatePrimeMapping() {
        Map<Character, Integer> alphabetToPrime = new HashMap<>();
        char letter = 'a';
        int prime = 2;

        while (letter <= 'z') {
            if (isPrime(prime)) {
                alphabetToPrime.put(letter, prime);
                letter++;
            }
            prime++;
        }

        return alphabetToPrime;
    }

    public static void main(String[] args) {

        Map<Character, Integer> alphabetToPrime = generatePrimeMapping();

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet letter: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char inputLetter = input.charAt(0);
            int primeNumber = alphabetToPrime.get(Character.toLowerCase(inputLetter));
            System.out.println("Prime number for " + inputLetter + ": " + primeNumber);
        } else {
            System.out.println("Invalid input. Please enter a single alphabet letter.");
        }
    }




}
