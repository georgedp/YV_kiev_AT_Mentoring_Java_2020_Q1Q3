import java.util.Scanner;

public class HW_M02_05 {
//    5. By using the sequential search algorithm, write a Java program to search for an element of an integer array of 10
//    elements. The array should be defined using a static initialization, for example:
//    int[] arr = {158,207,392,62,315,434,487,268,405,241}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array contains the next numbers: 158,207,392,62,315,434,487,268,405,241");
        System.out.println("Enter a number from array to find index for it");
        int x = input.nextInt();

        int[] arr = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        int n = arr.length;

        int index = searchArrIndex(arr, n, x);
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at position " + index);
        }
    }

    static int searchArrIndex(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
