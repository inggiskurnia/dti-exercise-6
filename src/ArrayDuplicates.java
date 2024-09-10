import java.util.ArrayList;
import java.util.HashMap;

public class ArrayDuplicates {
    public static boolean run(ArrayList<Integer> numbers){
        boolean duplicates = false;

        for (int i=0; i<numbers.size()-1; i++) {
            if (numbers.get(i) == numbers.get(i+1)){
                duplicates = true;
            }
        }

        return duplicates;

    }

}
