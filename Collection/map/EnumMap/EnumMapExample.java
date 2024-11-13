


import java.util.EnumMap;
import java.util.Map;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);

        // Adding values
        map.put(Day.MONDAY, "Start of the week");
        map.put(Day.FRIDAY, "End of the work week");
        map.put(Day.SUNDAY, "Rest day");

        // Accessing values
        System.out.println("Value for MONDAY: " + map.get(Day.MONDAY));

        // Iterating through EnumMap
        for (Map.Entry<Day, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        System.out.println("Contains key FRIDAY: " + map.containsKey(Day.FRIDAY));

        // Checking size
        System.out.println("Size of EnumMap: " + map.size());

        // Removing a key
        map.remove(Day.SUNDAY);
        System.out.println("After removing SUNDAY: " + map);

        // Checking if empty
        System.out.println("Is EnumMap empty? " + map.isEmpty());
    }
}
