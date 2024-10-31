package ExceptionHandling;
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        try{
            System.out.println("i am in first try block");
            try{
                arr[6] = 10;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}