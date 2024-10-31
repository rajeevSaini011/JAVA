package Lecture5.ConditionalStatement;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        //int age=20;
          Scanner sc =new Scanner(System.in);
        int age= sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
    }
}
