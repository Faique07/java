public class BubSort{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void BubbleSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        
        for(int num : arr){
            System.out.print(num + ", ");
        }
        System.out.println(" : Before Sort");

        BubbleSort(arr,n);

        for(int num : arr){
            System.out.print(num + ", ");
            
        }
        System.out.println(" : After Sort");
    }
}