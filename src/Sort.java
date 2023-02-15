import java.util.ArrayList;

public class Sort {
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int x = i; x < numbers.length; x++) {
                if (numbers[x] < min) {
                    min = numbers[x];
                    idx = x;
                }
            }
            numbers[idx] = numbers[i];
            numbers[i] = min;
        }
    }

    public static void selectionSort (int[] elements) {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                count ++;
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(count);
    }

    public static void insertionSort(int[] elements) {
        int count = 0;
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                count ++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(count);
    }

    // PART B.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int j = 0; j < words.size()-1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++) {
                count ++;
                if (words.get(k).compareTo(words.get(minIndex)) < 0) {
                    minIndex = k;
                }
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex, temp);
        }
        System.out.println(count);
    }

    public static void insertionSortWordList(ArrayList<String> words) {
        /* TO BE IMPLEMENTED IN PART B */
    }
}
