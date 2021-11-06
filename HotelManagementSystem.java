package Hotel.Management.system;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;



public class HotelManagementSystem extends JFrame implements ActionListener{

        HotelManagementSystem() {
            setBounds(5, 100, 1366, 563);         //setBounds is used to define the bounding rectangle of a component.

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/system/icons/first.jpg"));
            JLabel l1 = new JLabel(i1);
            l1.setBounds(0, 0, 1366, 563);
            add(l1);

            JLabel l2 = new JLabel("Hotel Management System");
            l2.setBounds(20, 100, 1000, 780);
            l2.setForeground(Color.white);
            l2.setFont(new Font("Serif", Font.PLAIN, 50));
            l1.add(l2);

            JButton b1= new JButton("Next");
            b1.setBackground(Color.white);
            b1.setForeground(Color.black);
            b1.setBounds(1024,460,95,30);
            b1.addActionListener(this);
            l1.add(b1);



            setLayout(null);
            setVisible(true);   // always at the last

            while (true) {
                l2.setVisible(false);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
                l2.setVisible(true);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        }

        public  void actionPerformed(ActionEvent ae){
            new Login().setVisible(true);
            // by default setVissible by default is false
               this.setVisible(false);   // to close the current class

        }



    public static void main(String[] args) {

            new HotelManagementSystem();
    }
}
