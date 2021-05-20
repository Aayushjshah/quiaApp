package quiz;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class rules  extends JFrame implements ActionListener{
    
    
    JButton b1,b2;
    String usr;
    rules(String username){
        setBounds(400, 200 , 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

        //welcome `username` to SimpleMinds
        usr=username;
        JLabel j1 = new JLabel("Welcome " + username + " to simple Minds!");
        // j1.setText("Welcome to AAYUSH" + " Shah");
        setLayout(null);
        j1.setBounds(20 , 30 , 600 , 30);
        j1.setFont(new Font("Mongolian Baiti" , Font.BOLD , 30));
        j1.setForeground(new Color(30 ,144 , 254));
        add(j1);

    //rules
        String ss ="<html><ol>"
        + " <li>And the sins of the fathers shall be</li> "
        + " <li>visited upon the heads of the children,</li> "
        + " <li>even unto the third and fourth</li> "
        + " <li>generation of them that hate me.</li> "
        + " <li>Well, then I hate thee, unrighteous picture;</li> "
        + " <li>Wicked image, I hate thee;</li> "
        + " <li>So, strike with thy vengeance</li> "
        + " <li>The heads of those little men</li> "
        + " <li>Who come blindly.</li> "
        + " <li>It will be a brave thing.</li> "
        + "</ol></html>";
        JLabel j2 = new JLabel(ss);
        // j2.setText();
        j2.setFont(new Font("Tahoma" , Font.ROMAN_BASELINE,18));
        j2.setLayout(null);
        j2.setBounds(0 ,80  , 600 , 220);
        add(j2);


      //buttons
      
      b1 = new JButton("BACK");
      b1.setLayout(null);
      b1.setBounds(250 ,350 , 100 , 30 );
      b1.setBackground(new Color(30 , 144 ,254));
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);

      //b2
      b2 = new JButton("Start");
      b2.setLayout(null);
      b2.setBounds(400 , 350 , 100 ,30);
      b2.addActionListener(this);
      b2.setBackground(new Color(30,144,254));
      b2.setForeground(Color.WHITE);
      add(b2);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new App().setVisible(true);
        }else{
            new ques(usr).setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args){
        System.out.println("Rules PAge");
        new rules("Mann");
    }
}



