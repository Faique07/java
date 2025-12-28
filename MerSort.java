
import java.util.ArrayList;
import java.util.List;

public class MerSort{

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        int i=low;
        for(int num : temp){
            arr[i] = num;
            i++;
        }
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low + high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,5,3};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr,low,high);
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}