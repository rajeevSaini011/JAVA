package Lecture5.ConditionalStatement;
//Print the Greeting
import java.util.*;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int button= sc.nextInt();
       if(button == 1) {
           System.out.println("hello ji");
       } else if (button ==2) {
           System.out.println("Namaste");
       } else if(button ==3){
           System.out.println("Bonjour");
       }else{
           System.out.println("Invalid Button");
    }



    }
}
