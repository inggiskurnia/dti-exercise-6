import java.util.ArrayList;
import java.util.Scanner;

public class InputArray {
    public ArrayList<Integer> run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the array : ");
        int length = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0; i< length; i++){
            System.out.println("Input number for index number [" + i +"] :");
            numbers.add(scanner.nextInt());
        }

        System.out.println("Your array is : " + numbers);
        return numbers;
    }
}
