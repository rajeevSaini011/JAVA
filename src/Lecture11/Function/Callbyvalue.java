package Lecture11.Function;

public class Callbyvalue {
    public static void swap(int a, int b){
        //swap
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args []) {
        int a =12;
        int b =10;



        //display
       System.out.println("before swaping x " + a+ " and y="+b);
       swap(a,b);
        System.out.println("after swaping x " + a + " and y="+b);
    }
}
