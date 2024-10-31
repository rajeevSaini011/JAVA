package Lecture11.Function;
//find the product a,b
public class PracticeQues1 {
    public static int Multiply(int a , int b){
        return a*b;
    }
    // argument pass and actual Parameter

    public static void main(String[] args) {
        int a=7;
        int b=3;

        int sum = Multiply(a,b);
        System.out.println("the sum is:"+sum);
    }

}
