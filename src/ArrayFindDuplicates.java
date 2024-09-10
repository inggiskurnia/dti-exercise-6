import java.util.ArrayList;
import java.util.HashSet;

public class ArrayFindDuplicates {
    public static ArrayList<Integer> run(ArrayList<Integer> numbers){
        HashSet<Integer> memo = new HashSet<>();
        ArrayList<Integer> duplicateNumber = new ArrayList<>();

        for (Integer number : numbers) {
            if (!memo.contains(number)) {
                memo.add(number);
            } else {
                duplicateNumber.add(number);
            }
        }
        return duplicateNumber;
    }
}
