package Lecture11.Function;

public class Parameter {
    // this variable a and b are parameters or formal parameter
    public static int multiply (int a,int b) {
        return a *b;

    }
    public static void main(String[] args) {
      int x =2;
      int y =14;
     //the variables x and y are arguments or actual parameter
      int sum = multiply(x,y);
        System.out.println("sum is:" + sum);
    }

    public static class Factorial {
    }
}
