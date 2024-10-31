package PracticeTime;

import java.sql.SQLOutput;

//Check if student of student pass / fail
public class Ques2 {
    public static void main(String[] args) {
        int Marks =70;
        String ReportCard = Marks >= 33 ? "pass" : "fails";
        System.out.println(ReportCard);
    }

}
