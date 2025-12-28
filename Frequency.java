
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency{

    public static void freq(int[] arr, int n){
        LinkedHashMap<Integer,Integer> mpp = new LinkedHashMap<>();
        for(int num : arr){
           
            mpp.put(num,mpp.getOrDefault(num,0)+1);
            System.out.println("Updated " + num + " count to " + mpp.get(num));
        }
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
    public static void main(String[] args){
        int arr[] = {5,10,5,5,10,6,7};
        int n = arr.length;
        freq(arr,n);
    }
}