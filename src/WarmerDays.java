import java.util.ArrayList;

public class WarmerDays {

    public static ArrayList<Integer> run(ArrayList<Integer> numbers){

        int tempTemperature1 = numbers.get(0);
        int tempTemperature2 = numbers.get(1);
        int tempDays = 0;
        ArrayList<Integer> days = new ArrayList<>();

        for (int i=1; i<=numbers.size(); i++){

            System.out.println("Temporary temperature before : " + tempTemperature1 + " " + tempTemperature2);
            tempDays += 1;

            if (tempTemperature2 > tempTemperature1) {
                days.add(tempDays);
                tempTemperature1 = numbers.get(i);
                tempTemperature2 = numbers.get(i+1);

                System.out.println("Temporary temperature after : " + tempTemperature1 + " " + tempTemperature2);
                tempDays = 0;
            } else {
                //tempTemperature1 = numbers.get(i);
                tempTemperature2 = numbers.get(i);
            }
        }
        return days;
    }
}
