package ExceptionHandling;
//throw
import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18) {
            throw new RuntimeException("sorry you can't vote");
        }else{
            System.out.println("you are eligible to vote");
        }
    }
}
