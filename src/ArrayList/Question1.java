package ArrayList;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer>List  =new ArrayList<>();
        ArrayList<String> List2 =new ArrayList<>();
        ArrayList<Boolean>List3 =new ArrayList<>();
        List.add(0);
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println(List);

        //GetOperation
              //Add
        int element = List.get(1);
        System.out.println(element);
        //Delete
        List.remove(2);
        System.out.println(List);

        //set
        List.set(2,10);
        System.out.println(List);

        //Contains
        System.out.println(List.contains(1));
        System.out.println(List.contains(11));



    }
}
