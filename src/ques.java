package quiz;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;  //for ActionListener
import java.awt.Graphics;
import java.util.Random;
public class ques extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    String[][] q= new String[10][5];
    // String[][]  = new String[10][1];
    String[][] qa = new String[10][2];
    JLabel qno,question;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup bg1;
    public static int timer = 15; 
    public static int count = 0;
    public static int score = 0;
    public static boolean end = false;
    JRadioButton[] bb= new JRadioButton[4];
         String user;
    ques(String usr){
      user=usr;  
      //create an image 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel j1 = new JLabel(i1);
        
      //main frame  
        setBounds(250,26,1140,800);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
      //end  
        
        j1.setLayout(null);
        j1.setBounds(0,0, 1140 ,402);
        add(j1);

        //qno
        Font f1 = new Font("Tahoma" ,Font.BOLD , 18);
        qno = new JLabel("1:");
        qno.setLayout(null);
        qno.setBounds(30,450,30,25);
        qno.setFont(new Font("Tahoma", Font.BOLD , 18));
        add(qno);
        //question
        
        question = new JLabel("Purusharth karyo ?");
        question.setBounds(58,450,700 , 25);
        question.setFont(f1);
        add(question);


        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
    q[0][1] = "JVM";
    q[0][2] = "JDB";
    q[0][3] = "JDK";
    q[0][4] = "JRE";

    q[1][0] = "What is the return type of the hashCode() method in the Object class?";
    q[1][1] = "int";
    q[1][2] = "Object";
    q[1][3] = "long";
    q[1][4] = "void";

    q[2][0] = "Which package contains the Random class?";
    q[2][1] = "java.util package";
    q[2][2] = "java.lang package";
    q[2][3] = "java.awt package";
    q[2][4] = "java.io package";

    q[3][0] = "An interface with no fields or methods is known as?";
    q[3][1] = "Runnable Interface";
    q[3][2] = "Abstract Interface";
    q[3][3] = "Marker Interface";
    q[3][4] = "CharSequence Interface";

    q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
    q[4][1] = "Stack";
    q[4][2] = "String memory";
    q[4][3] = "Random storage space";
    q[4][4] = "Heap memory";

    q[5][0] = "Which of the following is a marker interface?";
    q[5][1] = "Runnable interface";
    q[5][2] = "Remote interface";
    q[5][3] = "Readable interface";
    q[5][4] = "Result interface";

    q[6][0] = "Which keyword is used for accessing the features of a package?";
    q[6][1] = "import";
    q[6][2] = "package";
    q[6][3] = "extends";
    q[6][4] = "export";

    q[7][0] = "In java, jar stands for?";
    q[7][1] = "Java Archive Runner";
    q[7][2] = "Java Archive";
    q[7][3] = "Java Application Resource";
    q[7][4] = "Java Application Runner";

    q[8][0] = "Which of the following is a mutable class in java?";
    q[8][1] = "java.lang.StringBuilder";
    q[8][2] = "java.lang.Short";
    q[8][3] = "java.lang.Byte";
    q[8][4] = "java.lang.String";

    q[9][0] = "Which of the following option leads to the portability and security of Java?";
    q[9][1] = "Bytecode is executed by JVM";
    q[9][2] = "The applet makes the Java code secure and portable";
    q[9][3] = "Use of exception handling";
    q[9][4] = "Dynamic binding between objects";

//answerss

    qa[0][1] = "JDB";
    qa[1][1] = "int";
    qa[2][1] = "java.util package";
    qa[3][1] = "Marker Interface";
    qa[4][1] = "Heap memory";
    qa[5][1] = "Remote interface";
    qa[6][1] = "import";
    qa[7][1] = "Java Archive";
    qa[8][1] = "java.lang.StringBuilder";
    qa[9][1] = "Bytecode is executed by JVM";

        //radio buttons

        r1 = new JRadioButton("Sachot thai ha");
        r1.setBounds(30,510,700,25);
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("Dialog" , Font.PLAIN , 18));
        add(r1);

        //r2
        r2 = new JRadioButton("Ha pan haju ghano ghano kari saku chu");
        r2.setBounds(30,570,700,20);
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("Dialog" , Font.PLAIN , 18));
        add(r2);

        //r3
        r3 = new JRadioButton("kriya thi yuktta");
        r3.setBounds(30 , 630 , 700 ,20);
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Dialog" , Font.PLAIN , 18));
        add(r3);

        //r4
        r4 = new JRadioButton("karya  pramad");
        r4.setBounds(30,690,700,20);
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Dialog" , Font.PLAIN ,18));
        add(r4);

        bg1 = new ButtonGroup();    //part of swing
        bg1.add(r1);    bg1.add(r3);
        bg1.add(r2);    bg1.add(r4);
        
    
        bb[0]=r1;
        bb[1]=r2;
        bb[2]=r3;
        bb[3]=r4;

    //buttons    
        b1 = new JButton("Next");
        b1.setBounds(888,500,200,30);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma" , Font.PLAIN , 21));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("50-50");
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma" , Font.PLAIN , 21));
        b2.addActionListener(this);
        b2.setBounds(888 , 580 , 200 ,30);
        add(b2);

        b3 = new JButton("Submit");
        b3.setBackground(new Color(30,144,254));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Tahoma" , Font.PLAIN , 21));
        b3.setEnabled(false);
        b3.addActionListener(this);
        b3.setBounds(888 , 660 , 200 ,30);
        add(b3);
        start(0);
        //make an array
        //make a start function .
    }
    public void start(int count){ //sets the values for each question
      bg1.clearSelection();
      for(int i=0;i<bb.length;i++){
        bb[i].setEnabled(true);
      }
      qno.setText("" + (count+1));
      question.setText(q[count][0]);
      r1.setLabel(q[count][1]);
      r1.setActionCommand(q[count][1]);
      r2.setLabel(q[count][2]);
      r2.setActionCommand(q[count][2]);
      r3.setLabel(q[count][3]);
      r3.setActionCommand(q[count][3]);
      r4.setLabel(q[count][4]);
      r4.setActionCommand(q[count][4]);

      //

      if(count == 9){
        b1.setEnabled(false);
        b3.setEnabled(true);
      }
    }

    public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == b1){
          //next
          b1Event();
          //check if qa given
         
      }else if(ae.getSource() == b2){
          //lifeline
          Random rr = new Random();
          int subCount=0;
          int prv=-1;
          
          while(subCount!=2){
            int nn=rr.nextInt(4);
            if(q[count][nn + 1]!=qa[count][1] && nn != prv){
              // System.out.println(nn+1);
              bb[nn].setEnabled(false);
              prv=nn;
              subCount++;
            }
          }
          b2.setEnabled(false);
      }else{
        //b3
        b3Event();
      }
    }
    private void b1Event(){
      if(bg1.getSelection()==null){
        qa[count][0]=""; //storing qawer given by user
    }else{
        qa[count][0]=bg1.getSelection().getActionCommand();
        
    }
      timer=15;
      count++;
      start(count);
      repaint();//java.awt.component  //will call paint method and hence we are overriding paint method
    }


    private void b3Event(){
      if(bg1.getSelection() == null){
        qa[count][0] = "";
      }else{
        qa[count][0] = bg1.getSelection().getActionCommand();
      }
      //we will now calculate score.
      int i=0;

      if(end==false){
      for(;i<10;i++){
        if(qa[i][0]==qa[i][1]){
          score++;
        }
      }
      
    }
    System.out.println("Score is : " + score);
      end = true;
      new score(user,score).setVisible(true);
      this.setVisible(false);
      count = 0;// timer = 0;
    }
    public void paint(Graphics g){  //.awt.Graphics imported for Graphics 
      super.paint(g);
      String time = "TIME LEFT:" + timer;
      g.setFont(new Font("Tahoma" , Font.BOLD , 22));
      g.setColor(Color.RED);
      
      //if setColor below drawString not applicable since string is displayed and designin mentioned later
      // if(end=false){
      if(timer <= 0 ){
        time = "Times UP!!";
          
          if(count==9 && end == false){ 
            
            b3Event();
            // end = false;
            // timer = 0;
          }else if(count != 9){
            timer = 15;
            b1Event();
          }
      }
      g.drawString(time, 900, 480);
      try{
        Thread.sleep(1000);
        timer --;  
        repaint();
      }catch(Exception e){}
      
    }
    public static void main(String[] args){
        // System.out.println("AAYUSH");
        // new ques();
    }
}
