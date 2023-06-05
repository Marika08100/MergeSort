public class Main {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{-6,10,-88,6,0}));

    }
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                return false;
            }

        }
        return true;
    }
    public static int[] mergedArray(int[] leftArray, int[] rightArray ){
        return null;
    }
    public static int[] mergeSort(int[] array){
        return null;
    }
}