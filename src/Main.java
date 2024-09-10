import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InputArray InputArray = new InputArray();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose which question will be run : (1-7)");
        int question = scanner.nextInt();

        switch(question) {
            case 1 : {
                ArrayList<Integer> numbers = InputArray.run();
                System.out.println("Input d : ");
                int d = scanner.nextInt();

                ArrayRotation.run(numbers, d);
            }
            case 2 : {
                ArrayList<Integer> numbers = InputArray.run();
                System.out.println(("The array contains duplicate : " + ArrayDuplicates.run(numbers)));;
            }
            case 3 : {
                ArrayRemoveDuplicate ArrayRemoveDuplicate = new ArrayRemoveDuplicate();
                ArrayList<Integer> numbers = InputArray.run();
                if (ArrayDuplicates.run(numbers)) {
                    System.out.println("The removed duplicates is : " + ArrayRemoveDuplicate.run(numbers));
                } else {
                    System.out.println("There is no duplicates in array");
                }
            }
            case 4 : {
                ArrayRemoveOccurrence ArrayRemoveOccurrence = new ArrayRemoveOccurrence();
                ArrayList<Integer> numbers = InputArray.run();
                System.out.println("Input some number to be removed from array : ");
                int removeNumber = scanner.nextInt();
                System.out.println("The removed occurrence in array is : " + ArrayRemoveOccurrence.run(numbers, removeNumber));
            }
            case 5 : {
                ReverseString ReverseString = new ReverseString();
                System.out.println("Input some string : ");
                scanner.nextLine();
                String word = scanner.nextLine();
                System.out.println("The reverse string is :" + ReverseString.run(word));
            }
            case 6 : {
                ArrayList<Integer> numbers = InputArray.run();
                ArrayList<Integer> duplicates = ArrayFindDuplicates.run(numbers);

                if (!duplicates.isEmpty()) {
                    System.out.println("The removed duplicates is : " + ArrayFindDuplicates.run(numbers));
                } else {
                    System.out.println("There is no duplicates in array");
                }
            }
            case 7 : {
                System.out.println("Input temperatures");
                ArrayList<Integer> numbers = InputArray.run();
                System.out.println("The days you have to wait for warmer temperature is : ");
                System.out.println(WarmerDays.run(numbers));
            }

        }
    }
}