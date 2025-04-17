package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class login extends JFrame implements ActionListener {
    JTextField t1;
    JButton next,back;
    login(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,0,550,500);
        add(image);

//        adding label for quiz test
        JLabel l1 = new JLabel("QUIZ TEST");
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        l1.setBounds(120,45,300,45);
        l1.setForeground(new Color(22,76,86));
        add(l1);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(145,150,300,20);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        name.setForeground(new Color(22,76,86));
        add(name);


//        adding textfield for name
        t1= new JTextField();
        t1.setBounds(80,200,300,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);


//        adding btn for back n next
        next = new JButton("NEXT");
        next.setBounds(100,270,120,25);
        next.setBackground(new Color(22,76,86));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        back = new JButton("BACK");
        back.setBounds(250,270,120,25);
        back.setBackground(new Color(22,76,86));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);







        setSize(1000,500);
        setVisible(true);
        setLocation(250,150);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next){
            String name = t1.getText();
            setVisible(false);
            new Rules(name);
        }else if(e.getSource()==back){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new login();
    }
}
