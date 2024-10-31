package SwitchStatement;
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int Button = sc.nextInt();
      //  int  Button=1;
     switch(Button){
         case 1:System.out.println("hello");
         break;
         case 2:System.out.println("namaste");
         break;
         case 3:System.out.println("Bonjour");
         break;
         default:System.out.println("Invalid Button");

     }

    }

}
