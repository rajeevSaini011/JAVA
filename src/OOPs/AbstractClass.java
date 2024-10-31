package OOPs;


abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a circle");
    }
}


class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();


        circle.draw();
        rectangle.draw();
    }
}