package ArrayList;

import java.util.ArrayList;
//swap 2 number
public class Questions4 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get (idx1);
        list.set (idx1, list.get(idx2));
        list.set (idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(10);
        int idx = 1, idx2 =3;
        System.out.println(list);
        swap(list,idx,idx2);
        System.out.println(list);

    }
}