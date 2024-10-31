package Lecture5.ConditionalStatement;
import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else if(a>b) {
            System.out.println("grater then");
        }
        else {
            System.out.println("less then");

        }
    }
}
