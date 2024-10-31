package PracticeTime;

import java.util.Scanner;

public class Ques3{

}
class Number {
    int a, b;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        a = sc.nextInt();
        System.out.println("Enter the Second Number");
        b = sc.nextInt();
    }

    void large() {
        if (a > b) {
            System.out.println("Large is :" + a);
        } else {
            System.out.println("Large is :" + b);
        }
    }
}

class largest {
    public static void main(String[] args) {
        Number n = new Number();
        n.getNumber();
        n.large();
    }
}