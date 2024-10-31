package Lecture13.Sorting;
public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int arr = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[arr]) {
                    arr = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = array[arr];
            array[arr] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);
        System.out.println("Sorted array:");
        printArray(array);
    }
}
