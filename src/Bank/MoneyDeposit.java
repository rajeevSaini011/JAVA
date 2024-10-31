package Bank;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.SimpleDateFormat;

class MoneyDeposit extends Frame implements ActionListener {
    Label MoneyDeposit, l1, l2,l3,l4,l5;
    TextField tf1, tf2,tf3,tf4,tf5;
    Button Button1, Button2,Button3;


    public void actionPerformed(ActionEvent ae) {

    }

    MoneyDeposit() {
        MoneyDeposit = new Label("MONEY DEPOSIT:");

        l1 = new Label("Account Number :");
        l2 = new Label("1316816448 :");
        l3 = new Label("Amount :");
        l4 = new Label("Check/Draft :");
        l5= new Label("Date :");
       //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


        // DateChooser dateChooser = new DateChooser();
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        tf4 = new TextField(20);
        tf5 = new TextField(20);


        Button1= new Button("Submit");
        Button2= new Button("Back");
        Button3 = new Button("Reset");

        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        setLayout(null);
        add(MoneyDeposit);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);

        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);


        add(Button1);
        add(Button2);
        add(Button3);
        MoneyDeposit.setBounds(200, 100, 150, 20);
        l1.setBounds(100, 140, 150, 20);
        l2.setBounds(300, 140, 150, 20);
        l3.setBounds(100, 180, 150, 20);
        tf1.setBounds(300, 180, 100, 20);
        l4.setBounds(100, 220, 150, 20);
        tf2.setBounds(300, 220, 100, 20);
        l5.setBounds(100, 260, 150, 20);
        tf3.setBounds(300, 260, 100, 20);

        Button1.setBounds(100, 300, 80, 20);
        Button2.setBounds(200, 300, 80, 20);
        Button3.setBounds(300, 300, 80, 20);

        setVisible(true);
        setSize(500, 400);

    }

    public static void main(String[] args) {
        new MoneyDeposit();
    }

}
