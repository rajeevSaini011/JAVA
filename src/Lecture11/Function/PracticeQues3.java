package Lecture11.Function;

public class PracticeQues3 {
    //check if a number is prime or not
    public static Boolean IsPrime(int n){
        Boolean isprime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i==0){ //completely dividing
               // isprime = false;
               // break;
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(IsPrime(5));

    }
}
