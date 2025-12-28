public class SelSort{
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void SelectionSort(int[] arr, int n){
        for(int i=0 ;i<n-1; i++){

            int minIndex = i;

            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
        System.out.println("array after sorting");
        for(int num : arr){
            System.out.print(num + ",");
        }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        SelectionSort(arr, n);
        
    }
}