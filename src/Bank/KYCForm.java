package Bank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KYCForm extends Frame implements ActionListener {
    Label KYCForm,l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11,l12,l13,l14;
    TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10,tf11,tf12,tf13,tf14;
    Button Button1;

    public void actionPerformed(ActionEvent ae) {
    }
       KYCForm() {
           KYCForm= new Label("KYC Form:");

           l1 = new Label("Name of Applicant");
           l2 = new Label("Father Name");
           l3 = new Label("Gender");
           l4 = new Label("Marital Status");
           l5 = new Label("Date of Birth");
           l6 = new Label("PanCard");
           l7 = new Label("Address");
           l8 = new Label("Phone Number");
           l9 = new Label("Email");
           l10 = new Label("City");
           l11 = new Label("PinCode");
           l12 = new Label("Country");
           l13 = new Label("Signature");
           l14 = new Label("Date");


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
           tf11 = new TextField(20);
           tf12 = new TextField(20);
           tf13 = new TextField(20);
           tf14 = new TextField(20);


           Button1 = new Button("Submit");
           Button1.addActionListener(this);

           setLayout(null);
           add(KYCForm);
           add(l1);
           add(tf1);
           add(l2);
           add(tf2);
           add(l3);
           add(tf3);
           add(l4);
           add(tf4);
           add(l5);
           add(tf5);
           add(l6);
           add(tf6);
           add(l7);
           add(tf7);
           add(l8);
           add(tf8);
           add(l9);
           add(tf9);
           add(l10);
           add(tf10);
           add(l11);
           add(tf11);
           add(l12);
           add(tf12);
           add(l13);
           add(tf13);
           add(l14);
           add(tf14);
           add(Button1);

           KYCForm.setBounds(150, 30, 100, 30);
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
           l11.setBounds(50, 470, 120, 30);
           tf11.setBounds(200, 470, 150, 30);
           l12.setBounds(50, 510, 120, 30);
           tf12.setBounds(200, 510, 150, 30);
           l13.setBounds(50, 550, 120, 30);
           tf13.setBounds(200, 550, 150, 30);
           l14.setBounds(50, 590, 120, 30);
           tf14.setBounds(200, 590, 150, 30);


           Button1.setBounds(150, 640, 100, 30);

           setVisible(true);
           setSize(500, 400);


       }

    public static void main(String [] args ) {
        new KYCForm();
    }
}

