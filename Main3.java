public class Main3{
    static boolean checkPallindrome(int num){
        int dup = num;
        int result = 0;
        while(num!=0){
            int digit = num%10;
            result = result*10 + digit;
            num = num/10;
        }
        return dup==result;
    }
    public static void main(String[] args){
       System.out.println(checkPallindrome(127621));
    }
}