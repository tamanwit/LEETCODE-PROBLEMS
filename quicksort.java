public class quicksort{
    public static void main(String[] args) {
        int[] myArray = {45, 43, 23, 78, 90, 2};
        qsort(myArray, 0, myArray.length - 1);
    
        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
    
    public static void qsort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            qsort(array, low, pivotIndex - 1);
            qsort(array, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
    
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
