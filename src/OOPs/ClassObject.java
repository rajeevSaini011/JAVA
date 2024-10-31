package OOPs;
//what is object?
// An object is an instance of a class it has own  state Behavior and identity
public class ClassObject {
    public static void main(String[] args) {
        Dog d1 = new Dog();
      //  int age = 12;
        d1.name = "Tommy";
        d1.bark();
        Dog d2 = new Dog();
        d2.name ="Nancy";
        d2.walk();
    }
}

//WHAT IS  CLASS ?
// a Class is simply a representation of a type an object.
// it is the  blueprint / template and plan that describe the details of an object

class Dog {
    String name;
   // int age;
    String Color;

    void walk() {
        System.out.println(name + " is walking ");
    }

    void bark() {
        System.out.println(name + " is barking");
   // }

   // int age() {
     // System.out.println(age + " 12 year old");

     }

    }
