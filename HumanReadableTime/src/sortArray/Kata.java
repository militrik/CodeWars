package sortArray;

public class Kata {
    public static int[] sortArray(int[] array) {
        int sortedIndex = array.length;
        int numberOfSwap;
        do {
            numberOfSwap = 0;
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (array[i] % 2 == 0)
                    continue;
                int j = i + 1;
                for (; j < sortedIndex; j++) {
                    if (array[j] % 2 != 0)
                        break;
                }
                if (j < sortedIndex) {
                    if (array[i] > array[j]) {
                        swapInArray(array, i, j);
                        numberOfSwap++;
                    }
                }
            }
        } while (numberOfSwap > 0);

        return array;
    }


    public static void swapInArray(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}


/*public class Kata {
    public static int[] sortArray(int[] array) {
        int sortedIndex = array.length;
        int numberOfSwap;
        do {
            numberOfSwap = 0;
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (array[i] % 2 == 0)
                    continue;
                int j = i + 1;
                for (; j < sortedIndex; j++) {
                    if (array[j] % 2 != 0)
                        break;
                }
                if (j < sortedIndex) {
                    if (array[i] > array[j]) {
                        swapInArray(array, i, j);
                        numberOfSwap++;
                    }
                }
            }
        } while (numberOfSwap > 0);

        return array;
    }


    public static void swapInArray(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}*/



