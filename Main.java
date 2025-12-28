public class Main{

    public static int checkDigit(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 1859895;
        int answer = checkDigit(n);
        System.out.println(answer);
    }
}