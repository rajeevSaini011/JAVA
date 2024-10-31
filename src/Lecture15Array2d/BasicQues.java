package Lecture15Array2d;
public class BasicQues {
    public static void main(String[] args) {
        int myNumber[][] = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumber.length; ++i) {
            for (int j = 0; j < myNumber.length; ++j) {
                System.out.println(myNumber[i][j]);
            }
        }
    }
}
