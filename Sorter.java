public class Sorter {
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
