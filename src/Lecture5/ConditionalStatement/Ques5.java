package Lecture5.ConditionalStatement;

import java.util.Scanner;

//even odd
public class Ques5 {
    public static void main(String[] args) {
       // int x =2;
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
