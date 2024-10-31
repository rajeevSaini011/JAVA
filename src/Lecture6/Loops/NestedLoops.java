package Lecture6.Loops;

public class NestedLoops {
    public static void main(String[] args) {
        //outer loops
        for (int i = 1; i <= 2; i++){
            System.out.println("Outer:"+ i);
            //inner loops
            for(int j=1; j<= 3; j++){
                System.out.println("inner:"+ j);
            }

        }

    }
}