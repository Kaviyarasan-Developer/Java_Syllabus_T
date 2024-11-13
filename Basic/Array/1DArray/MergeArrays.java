

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        System.out.println("Merged array:");
        for (int number : mergedArray) {
            System.out.print(number + " ");
        }
    }
}


// public class MergeArrays {
//     public static void main(String[] args) {
//         int[] array1 = {1, 3, 5};
//         int[] array2 = {2, 4, 6};
        
//         // Create a new array to hold the merged result
//         int[] mergedArray = new int[array1.length + array2.length];
        
//         // Copy elements from array1 to mergedArray
//         int index = 0;
//         for (int i = 0; i < array1.length; i++) {
//             mergedArray[index] = array1[i];
//             index++;
//         }

//         // Copy elements from array2 to mergedArray
//         for (int i = 0; i < array2.length; i++) {
//             mergedArray[index] = array2[i];
//             index++;
//         }

//         // Print the merged array
//         System.out.println("Merged array:");
//         for (int number : mergedArray) {
//             System.out.print(number + " ");
//         }
//     }
// }
