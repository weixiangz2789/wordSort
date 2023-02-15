import java.util.Arrays;

public class SortTester {
    public static void main(String[] args) {
        System.out.println("--- SELECTION SORT --- ");
        int[] arr1 = {1, 0, 3, 2, 3, 2, 3, 1, 3, 6, 4, 3, 1, 7, 7, 6, 6,3, 1, 1};
        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("\n--- INSERTION SORT --- ");
        int[] arr2 = {1, 0, 3, 2, 3, 2, 3, 1, 3, 6, 4, 3, 1, 7, 7, 6, 6,3, 1, 1};
        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}