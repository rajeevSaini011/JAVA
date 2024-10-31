package Bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class login extends Frame implements ActionListener {
    Label Login, l1,l2;
    TextField tf1, tf2;
    Button Button1,Button2,Button3;


    public void actionPerformed(ActionEvent ae) {

    }

    login() {
        Login  = new Label("LOGIN");
        l1= new Label("UserName");
        tf1 = new TextField(20);
        l2 = new Label("Password:");
        tf2 = new TextField(20);


        Button1 = new Button("SignIn");
        Button2 = new Button("Signup");
        Button3 = new Button("forgot");

        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        setLayout(null);
        add(Login);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);

        add(Button1);
        add(Button2);
        add(Button3);
        Login.setBounds(220, 100, 150, 20);
        l1.setBounds(100, 140, 150, 20);
        tf1.setBounds(280, 140, 100, 20);
        l2.setBounds(100, 170, 150, 20);
        tf2.setBounds(280, 170, 100, 20);

        Button1.setBounds(160, 200, 60, 20);
        Button2.setBounds(240, 200, 60, 20);
        Button3.setBounds(320,200,60,20);

        setVisible(true);
        setSize(400, 400);

    }

    public static void main(String[] args) {
        new login();
    }

    }



