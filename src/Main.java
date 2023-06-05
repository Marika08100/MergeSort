import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{-6, 10, -88, 6, 0})));
        System.out.println(Arrays.toString(mergeSort(new int[]{-6, 10, -88, 6, 0})));
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static int[] merge(int[] leftArray, int[] rightArray) {
        int[] array = new int[leftArray.length + rightArray.length];

        int arrayIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (arrayIndex < array.length &&
                rightIndex < rightArray.length &&
                leftIndex < leftArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[arrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        while (rightIndex < rightArray.length) {
            array[arrayIndex] = rightArray[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
        while (leftIndex < leftArray.length) {
            array[arrayIndex] = leftArray[leftIndex];
            leftIndex++;
            arrayIndex++;

        }

        return array;
    }

    public static int[] mergeSort(int[] array) {
        if (isSorted(array)) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
}