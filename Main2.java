public class Main2{

    public static int reverseNum(int num){
        int result = 0;
        
        while(num>0){
            int n = num%10;
            result = result*10 + n;
            num = num/10;
        }
        return result;

    }
    public static void main(String[] args){
        int n = 12010300;
        int answer = reverseNum(n);
        System.out.println(answer);
    }
}