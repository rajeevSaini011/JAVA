package ExceptionHandling;
//try to Catch
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        int divisor = sc.nextInt();
        try{
            int result = divident/divisor;
            System.out.println("your answer is:"+result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());



        }

        }


}
