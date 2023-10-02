import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a list of numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        double average = calculateAverage(input);
        
        System.out.println("Average: " + average);
    }
    
    public static double calculateAverage(String input) {
        String[] numbers = input.split(" ");
        ArrayList<Double> numberList = new ArrayList<>();
        
        for (String numberStr : numbers) {
            try {
                double number = Double.parseDouble(numberStr);
                numberList.add(number);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + numberStr + " is not a valid number.");
            }
        }
        
        double total = 0.0;
        for (double number : numberList) {
            total += number;
        }
        
        if (numberList.size() > 0) {
            return total / numberList.size();
        } else {
            System.err.println("No valid numbers entered.");
            return 0.0;
        }
    }
}
