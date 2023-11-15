package bufferbuilder;

import java.util.Scanner;

public class Oddcapital {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String output = generateSequence(input);

	        System.out.println("Input: " + input + ", Output: " + output);
	    }

	    private static String generateSequence(String input) {
	        StringBuilder output = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            if (i % 2 == 0) {
	                output.append(Character.toUpperCase(currentChar));
	            } else {
	                output.append(Character.toLowerCase(currentChar));
	            }
	        }

	        return output.toString();
	    }
	}
