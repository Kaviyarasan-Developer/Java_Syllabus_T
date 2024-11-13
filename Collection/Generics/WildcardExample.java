

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.5);
        doubleList.add(4.5);

        printNumbers(intList);
        printNumbers(doubleList);
    }
}
