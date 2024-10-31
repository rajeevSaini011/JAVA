package Lecture5.ConditionalStatement;
   //print the largest
public class PracticeQues3 {
    public static void main(String[] args) {
       int A =1;
       int B =2;
       int C =6;
        if((A>=B) && (B>=C)) {
            System.out.println("largest number is 1");
        } else if (B>=C) {
            System.out.println("largest number is 3");
        }else{
            System.out.println("largest number is 6");
        }

    }
}
