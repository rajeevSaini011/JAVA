package Bank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends Frame implements ActionListener {
    Label Signup, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    Button Button1;

    public void actionPerformed(ActionEvent ae) {

    }

    Signup() {
        Signup = new Label("SignUp:");

        l1 = new Label("A/C Holder Name");
        l2 = new Label("Father Name");
        l3 = new Label("Address");
        l4 = new Label("Contact No");
        l5 = new Label("Aadhaar No");
        l6 = new Label("Pan Card");
        l7 = new Label("City");
        l8 = new Label("Country");
        l9 = new Label("Citizen");
        l10 = new Label("PinCode");

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        tf4 = new TextField(20);
        tf5 = new TextField(20);
        tf6 = new TextField(20);
        tf7 = new TextField(20);
        tf8 = new TextField(20);
        tf9 = new TextField(20);
        tf10 = new TextField(20);

        Button1 = new Button("Submit");
        Button1.addActionListener(this);

        setLayout(null);
        add(Signup);
        add(l1); add(tf1);
        add(l2); add(tf2);
        add(l3); add(tf3);
        add(l4); add(tf4);
        add(l5); add(tf5);
        add(l6); add(tf6);
        add(l7);  add(tf7);
        add(l8);  add(tf8);
        add(l9);  add(tf9);
        add(l10); add(tf10);
        add(Button1);

        Signup.setBounds(150, 30, 100, 30);
        l1.setBounds(50, 70, 120, 30);
        tf1.setBounds(200, 70, 150, 30);
        l2.setBounds(50, 110, 120, 30);
        tf2.setBounds(200, 110, 150, 30);
        l3.setBounds(50, 150, 120, 30);
        tf3.setBounds(200, 150, 150, 30);
        l4.setBounds(50, 190, 120, 30);
        tf4.setBounds(200, 190, 150, 30);
        l5.setBounds(50, 230, 120, 30);
        tf5.setBounds(200, 230, 150, 30);
        l6.setBounds(50, 270, 120, 30);
        tf6.setBounds(200, 270, 150, 30);
        l7.setBounds(50, 310, 120, 30);
        tf7.setBounds(200, 310, 150, 30);
        l8.setBounds(50, 350, 120, 30);
        tf8.setBounds(200, 350, 150, 30);
        l9.setBounds(50, 390, 120, 30);
        tf9.setBounds(200, 390, 150, 30);
        l10.setBounds(50, 430, 120, 30);
        tf10.setBounds(200, 430, 150, 30);
        Button1.setBounds(150, 470, 100, 30);

        setSize(500, 550);
        setVisible(true);

            }

    public static void main(String[] args) {
        new Signup();
    }
}
