package Lecture6.Loops;
//print sum of first n natural number
public class PracticeQues2 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum =sum +i;
            System.out.println(sum);
            i++;
        }
    }
}
