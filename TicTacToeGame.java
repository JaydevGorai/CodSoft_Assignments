
package in.SmartProgramming.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToeGame implements ActionListener
{
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    
    String s="";
    int c=0;
    Color c1;
    TicTacToeGame()
    {
        jf=new JFrame("TicTacToeGame by Jaydev");
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setLayout(new GridLayout(3,3));
        
        jb1=new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2=new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3=new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4=new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5=new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6=new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7=new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8=new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9=new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }
    public static void main(String[] args) 
    {
            new TicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        c=c+1;
        if(c%2==0)
        {
            s="0";
            c1=Color.PINK;
        }
        else
        {
            s="X";
            c1=Color.RED;
        }
        
        if(e.getSource()==jb1 )
        {
           jb1.setFont( new Font("Algerian", 1, 80));
            jb1.setText(s);
            jb1.setBackground(c1);
            jb1.setEnabled(false);
        }
        
        if(e.getSource()== jb2)
        {
            jb2.setFont(new Font("Algerian",1,80));
            jb2.setText(s);
            jb2.setBackground(c1);
            jb2.setEnabled(false);
        }
        
        if(e.getSource()== jb3)
        {
            jb3.setFont( new Font("Algerian", 1, 80));
            jb3.setText(s);
            jb3.setBackground(c1);
            jb3.setEnabled(false);
        }
        
        if(e.getSource()== jb4)
        {
            jb4.setFont(new Font("Algerian",1,80));
            jb4.setText(s);
            jb4.setBackground(c1);
            jb4.setEnabled(false);
        }
        
        if(e.getSource()== jb5)
        {
            jb5.setFont( new Font("Algerian", 1, 80));
            jb5.setText(s);
            jb5.setBackground(c1);
            jb5.setEnabled(false);
        }
        
        if(e.getSource()== jb6)
        {
            jb6.setFont(new Font("Algerian",1,80));
            jb6.setText(s);
            jb6.setBackground(c1);
            jb6.setEnabled(false);
        }
        
        if(e.getSource()== jb7)
        {
            jb7.setFont( new Font("Algerian", 1, 80));
            jb7.setText(s);
            jb7.setBackground(c1);
            jb7.setEnabled(false);
        }
        
        if(e.getSource()== jb8)
        {
            jb8.setFont(new Font("Algerian",1,80));
            jb8.setText(s);
            jb8.setBackground(c1);
            jb8.setEnabled(false);
        }
        
        if(e.getSource()== jb9)
        {
            jb9.setFont( new Font("Algerian", 1, 80));
            jb9.setText(s);
            jb9.setBackground(c1);
            jb9.setEnabled(false);
        }
    }
}
