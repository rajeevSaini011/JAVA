package Lecture12.Array;
//operation of array
// Lis of element of the same types placed continous memory allocation

import java.util.Scanner;

public class PracticeQues1 {
    public static void main(String[] args) {
        int marks[]= new int[100];
        Scanner sc =new Scanner(System.in);
        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//math
        System.out.println("phy:"+ marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("math:"+marks[2]);
        //Agar Humhe percentage nekalne ho
        int percentage = (marks[0] + marks[1] +marks[2])/3;
        System.out.println("percentage="+ percentage + " ");
        }
    }


