package Lecture14.String;

import java.util.Scanner;
public class main{
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
      /* int a = 7; //sc.nextInt();
        int b  =2; //sc.nextInt();

        int mul=a*b;
        System.out.println(mul);*/

      /*  Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("adult");

        }else {
            System.out.println("not adult");
        }

       */

   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   if(a==b) {
       System.out.println("equal");
   }else{
       if(a > b){
           System.out.println("is grater then");
       }else{
           System.out.println("less then");
       }


   }



    }

}
