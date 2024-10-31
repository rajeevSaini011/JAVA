package OOPs;

import javax.naming.Name;

public class MethodOverloading {
    public static void main(String[] args) {
      Greet obj = new Greet();
      obj.Greetings();
      obj.Greetings("Rajeev");
    }
}
class Greet{
    void Greetings() {
        System.out.println("hello, Good Morning to all of you");
    }
   void Greetings(String name){
       System.out.println("hello "+name+", Good morning");

    }
}

