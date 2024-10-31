package OOPs;

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rajeev");
        student.setAge(22);
        student.setRoll_no(185);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll No: " + student.getRoll_no());
    }
}

class Student {
    private String name;
    private int age;
    private int roll_no;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}