package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    Score(String name,int score){
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(60,200,200,150);
        add(img);

        JLabel heading = new JLabel("Thank You "+ name +" for playing QUIZ Test");
        heading.setBounds(100,80,700,30);
        heading.setFont(new Font("Times New Roman",Font.BOLD,24));
        add(heading);

        JLabel Score = new JLabel("Your Score is " + score);
        Score.setBounds(350,200,300,30);
        Score.setFont(new Font("Times New Roman",Font.BOLD,24));
        add(Score);

        JButton exit = new JButton("EXIT");
        exit.setBounds(380,270,120,30);
        exit.setBackground(new Color(22,76,86));
        exit.setForeground(Color.white);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new login();
            }
        });


        ImageIcon i11 =new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i22 = i11.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(0,0,750,550);
        add(imgg);

        setSize(750,550);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
