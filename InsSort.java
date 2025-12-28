public class InsSort{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void InsertionSort(int[] arr, int n){
        for(int i=1; i<n; i++){
            int currIndex = i;
            for(int j=i-1; j>=0; j--){
                if(arr[currIndex] < arr[j]){
                    swap(arr,currIndex,j);
                    currIndex--;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n =arr.length;
        InsertionSort(arr,n);
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}