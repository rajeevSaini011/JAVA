package Bank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MoneyTransfer extends Frame implements ActionListener {
    Label AccountNumber, l1, l2, l3;
    TextField tf1, tf2, tf3, tf4;
    Button Button1,Button2,Button3;

    public void actionPerformed(ActionEvent ae) {
    }

    MoneyTransfer() {
        AccountNumber = new Label("Account Number:");
        l1 = new Label("Bank:");
        l2 = new Label("IFSC:");
        l3 = new Label("Amount:");

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        tf4 = new TextField(20);

        Button1 = new Button("Submit");
        Button2 = new Button("Back");
        Button3 = new Button("Reset");

        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        setLayout(null);
        add(AccountNumber);
        add(tf1);
        add(l1);
        add(tf2);
        add(l2);
        add(tf3);
        add(l3);
        add(tf4);

        add(Button1);
        add(Button2);
        add(Button3);

        AccountNumber.setBounds(100, 100, 150, 20);
        tf1.setBounds(250, 100, 150, 20);

        l1.setBounds(100, 140, 150, 20);
        tf2.setBounds(250, 140, 150, 20);

        l2.setBounds(100, 180, 150, 20);
        tf3.setBounds(250, 180, 150, 20);

        l3.setBounds(100, 220, 150, 20);
        tf4.setBounds(250, 220, 150, 20);

        Button1.setBounds(100, 260, 80, 30);
        Button2.setBounds(200, 260, 80, 30);
        Button3.setBounds(300, 260, 80, 30);

        setSize(500, 400);
        setVisible(true);
    }

        public static void main (String[]args){
            new MoneyTransfer();
        }
    }
