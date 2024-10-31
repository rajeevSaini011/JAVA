package PracticeTime;

public class Ques4 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.age =12;
        d1.name ="Raja";
        d1.color ="White";
        d1.bark();
        Dog d2 = new Dog();
        d2.name ="leo";
        d2.color="Black";
        d2.walk();


    }
}
class Dog{
    int age;
    String name;
    String color;
    void bark(){
        System.out.println(name+" is barking");
    }
    void walk(){
        System.out.println(name+" is walking");
    }
}
