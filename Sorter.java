public class Sorter {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j>= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;}
            
        }
    public static void selectionSort(int[] arr){
        int min = 0; // index of the minimum.
        for(int i = 0; i < arr.length; i++){
        min = i;
        for(int j = i; j < arr.length; j++){
        if(arr[min] > arr[j]){
        min = j;
        }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        }
        
    }
}
