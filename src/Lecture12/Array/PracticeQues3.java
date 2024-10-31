package Lecture12.Array;

public class PracticeQues3 {
    public static int getaLargest(int number []){
        int largest = Integer.MIN_VALUE;//infinity
        for(int i=0; i<number.length;i++){
            if(largest < number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] ={1,2,6,3,5,7};
        System.out.println("largest values is:"+getaLargest(number));
}
}
