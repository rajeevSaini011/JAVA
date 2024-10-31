package Polymorphism;
//methodOverloading
public class Ques1 {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(5,7);
        obj.sum(5,7,8);
        obj.sum("Android" ,"Developer");
    }
}

class MethodOverloading{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void sum(String a,String b){
        System.out.println(a+b);
    }
}
