import java.util.ArrayList;

public class ArrayRemoveOccurrence {
    public ArrayList<Integer> run(ArrayList<Integer> numbers, int remove) {
        ArrayList<Integer> removedOccurance = new ArrayList<>();

        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) != remove) {
                removedOccurance.add(numbers.get(i));
            }
        }
        return removedOccurance;
    }
}
