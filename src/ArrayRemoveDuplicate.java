import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayRemoveDuplicate {

    public static ArrayList<Integer> run(ArrayList<Integer> numbers){
        HashSet<Integer> memo = new HashSet<>();
        ArrayList<Integer> removedDuplicates = new ArrayList<>();

        for(int i=0; i<numbers.size(); i++){
            if (!memo.contains(numbers.get(i))){
                memo.add(numbers.get(i));
                removedDuplicates.add(numbers.get(i));
            }
        }
        return removedDuplicates;
    }


}
