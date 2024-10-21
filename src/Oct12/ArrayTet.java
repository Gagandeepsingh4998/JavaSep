package Oct12;

import java.util.Scanner;

public class ArrayTet {
    public static void main(String[] args) {
        int[] arr = printArray();
    }

    public static int[] printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the Array (5 integers): ");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reversing the array
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }

        // Display the elements in the array
        System.out.println("Display the elements in the array (reversed): ");
        for (int element : arr) {
            System.out.println(element);
        }
        return arr;
    }
}
