package ArrayList;
import com.sun.security.jgss.GSSUtil;

import java.sql.ClientInfoStatus;
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
   ArrayList<Integer> List = new ArrayList<>();
   ArrayList<Integer> List2 = new ArrayList<>();
   List.add(10);
   List.add(20);
   List.add(30);

        List.add(1);
        List.add(2);
        List.add(3);



        System.out.println("first list:"+List);
        //Size
        System.out.println(List.size());
        //list contains
        System.out.println(List.contains(20));
        //remove
        List.remove(1);
        List.addAll(List2);
        System.out.println(List);
    }
}
