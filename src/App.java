package quiz;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener{
    //actionListener => interface declares actionPerformed function in it for to be implemented.
    JButton b1,b2;  //actionPerformend
    // String t1Val;
    JTextField t1;
    App(){
        setBounds(400,200,800,500); //swing.*  this is to set the initial frame of the software
        //400=> start pt of frame from left of screen
        //200 => start pt of frame from top of screen
        //800 => length(width)
        //500 =>height
        setVisible(true);   //swing.*  initially visibilty of all frames is none. we changed it to true

//to change the background 
        getContentPane().setBackground(Color.WHITE); //getContentPane=>to select the  mainframe
        //Color=> is a part of awt
    //image    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        //imageIcon of javax.swing 
        //ClassLoader => a class having methods to load diiferent folders
        //.getSystemResource => method to load local file by mentioning path
        //path relative from src

        //image i1 cannot directly be added to the frame 1st we need to make a label for it
        JLabel l1 = new JLabel(i1);
        //now set the label in the frame
        setLayout(null);    //for mentioning that we dont wish to use any inbuilt layout and hence passed 'null'
        l1.setBounds(0,0,400,500);  //now relative to the main frame
        //.setBounds will work only when setLayout is set to null . 
        add(l1);    //adding it to the frame finally
    //imageEnd

    //heading
        JLabel heading = new JLabel("SimpleMinds");
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD , 40));    //Font => awt.;
        //Font(string font-name , weight/style , size)
        heading.setForeground(new Color(30,144,254));    //fore ground to change color of things inside here text
        heading.setBounds(450,40,300,45);
        add(heading);
    //heading ends
    
    //text field
        JLabel l3 = new JLabel();
        l3.setText("Enter your name please:");
        l3.setFont(new Font("Mongolian Baiti" , Font.BOLD , 18));
        l3.setForeground(new Color(30,144,254));
        l3.setBounds(480,150,300,20);
        add(l3);
    //input
    
         t1 = new JTextField();
        t1.setBounds(450,180,230,20);
        // System.out.println(t1.getText());
        // t1Val=t1.getText();
        t1.setFont(new Font("Mongolian Baiti" , Font.BOLD , 17));
        add(t1);

    //buttons
    
        // JButton b1 = new JButton("Rules"); //b4
        b1 = new JButton("Rules");  //aftr
        // b1.setText("Rules");
        b1.setBounds(450,220,100,20);
        b1.setBackground(new Color(30,144,254));
        b1.addActionListener(this); //actionPerformed will handle the event => for that awt.event.* imported and implenteing actionListener interface
        b1.setForeground(Color.WHITE);
        add(b1);

        // JButton b2 = new JButton("Exit");
        b2 = new JButton("Exit");
        b2.setBounds(580,220,100,20);
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
    //buttons end

       

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){        //here we are using b1 but it is a local variable in constructors.So globally defining them !
            //render to a new frame
            String t1Val = t1.getText();
            this.setVisible(false);
            new rules(t1Val);
            //close current tab
        }else{
            //b2 is clicked
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        System.out.println("AAYUSH");
        System.out.println("Sincerity");
        new App();
    }
}