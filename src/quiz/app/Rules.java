package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name =name;

        JLabel l1 =new JLabel("Welcome "+name+" to QUIZ TEST");
        l1.setBounds(150,100,700,30);
        l1.setFont(new Font("Times New Roman",Font.BOLD,28));
        l1.setForeground(Color.black);
        add(l1);

//adding label for rules
        JLabel l2 =new JLabel();
        l2.setBounds(70,150,700,350);
        l2.setFont(new Font("Serif",Font.PLAIN,18));
        l2.setForeground(Color.black);
        l2.setText(
                "<html>"+
                        "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                        "2. There are a total 10 questions. " + "<br><br>" +
                        "3. You only have 15 seconds to answer the question." + "<br><br>" +
                        "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                        "5. No talking." + "<br><br>" +
                        "6. No one else can be in the room with you." + "<br><br>" +
                        "<html>"
        );
        add(l2);


//        adding btn for start and back
        back =new JButton("BACK");
        back.setBounds(250,500,100,30);
        back.setForeground(Color.white);
        back.setBackground(new Color(22,76,86));
        back.addActionListener(this);
        add(back);


        start =new JButton("START");
        start.setBounds(450,500,100,30);
        start.setForeground(Color.white);
        start.setBackground(new Color(22,76,86));
        start.addActionListener(this);
        add(start);

//adding bg image
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i2 = i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel images =new JLabel(i3);
        images.setBounds(0,0,800,650);
        add(images);


        setSize(800,650);
        setLocation(350,100);
        setUndecorated(true);//for removing minimize maximize n close option
        setLayout(null);
        setVisible(true);
    }
   public void actionPerformed(ActionEvent e){
        if(e.getSource()==back){
            setVisible(false);
            new login();
        }else if(e.getSource() ==start){
            setVisible(false);
            new Quiz(name);
        }
   }
    public static void main(String[] args) {
        new Rules("User");
    }
}
