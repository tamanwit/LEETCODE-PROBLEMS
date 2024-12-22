public class arr_sort {
    //check if an array is sorted (Strictly increasing)
    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            //arr is sorted
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,6,3};
        System.out.println(isSorted(arr, 0));
    }
}
