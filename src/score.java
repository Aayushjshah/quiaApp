package quiz;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
public class score extends JFrame implements ActionListener{
    JButton exit ,pAgain;
    score(String username , int score){
        setBounds(400,150 ,750 , 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        this.setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel j1 = new JLabel(i3);
        j1.setBounds(10,150,300,250);
        add(j1);

        //buttons

        pAgain = new JButton("Play again!");
        pAgain.setBounds(310,375,150,30);
        pAgain.setBackground(new Color(30,144,254));;
        pAgain.setForeground(Color.WHITE);
        pAgain.addActionListener(this);
        pAgain.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(pAgain);


        exit= new JButton("Exit");
        exit.setBounds(550,375,100,30);
        exit.setBackground(new Color(30,144,254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        exit.setFont(new Font("Tahoma",Font.BOLD , 18));
        add(exit);
        // Thank you 

        JLabel thanks = new JLabel("Thank you " +  username + " for playing with us!");
        thanks.setFont(new Font("Tahoma" , Font.ITALIC , 20));
        thanks.setBounds(310,100,400,25);
        add(thanks);

        JLabel s = new JLabel("Your SCORE is " + (score*10));
        s.setBounds(350,205,400,30);
        s.setFont(new Font("Tahoma",Font.BOLD , 25));
        add(s);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }else{
            new App().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new score( "AAYUSH" , 60);
    }
}
