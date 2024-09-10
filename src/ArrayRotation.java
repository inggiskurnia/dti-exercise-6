import java.util.ArrayList;

public class ArrayRotation {
    public static void run (ArrayList<Integer> numbers, int d) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        ArrayList<Integer> removedArray = new ArrayList<>();
        ArrayList<Integer> outArray = new ArrayList<>();

        for(int i=0; i<numbers.size(); i++){
            if (i >= d) {
                tempArray.add(numbers.get(i));
            } else {
                removedArray.add(numbers.get(i));
            }
        }
        outArray.addAll(tempArray);
        outArray.addAll(removedArray);
        System.out.println(outArray);
    }
}
