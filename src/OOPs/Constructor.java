package OOPs;

public class Constructor {
    public static void main(String[] args) {
     Employee Tony= new Employee();
     Tony.setName("TonyStark");
     Tony.setId(11);
        System.out.println(Tony.getId());
        System.out.println(Tony.getName());

    }
}
class Employee{
    private int id;
    private String name;

    public Employee() {
        id = 11;
        name = "TonyStark";
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setId(int i) {
        this.id = i;
    }
    public int getId () {
        return id;
    }

    }

