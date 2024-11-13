package Basic;
public class TypeConversion {

    public static void main(String[] args) {
        int num = 100;
        long bigNum = num; // Implicit casting from int to long (smaller to larger)
        float floatNum = num; // Implicit casting from int to float

        System.out.println("Integer value: " + num);
        System.out.println("Long value: " + bigNum);
        System.out.println("Float value: " + floatNum);


        double decimalNum = 99.99;
        int intNum = (int) decimalNum; // Explicit casting from double to int

        System.out.println("Double value: " + decimalNum);
        System.out.println("Integer value (after casting): " + intNum);

    }

    
}
