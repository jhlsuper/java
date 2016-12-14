package com.sd.yun;

import javax.swing.*;

import java.awt.event.*; //for ActionListener

import java.awt.*;

import java.awt.Container;

public class YutGui extends JFrame implements ActionListener{
  YutGame1 y=new YutGame1();
 
  JButton b1;
  JTextField instruction;
  JLabel label1;
  
  public void yutgui() {
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(3,1));
    getContentPane().add(panel);
    label1= new JLabel("Instruction");
    instruction= new JTextField(10);
    
   
    b1=new JButton("Play YutnoriGame!!");  
        
        
    b1.setPreferredSize(new Dimension(80,80));
    b1.addActionListener(this);
    
    
    
    panel.add(b1);
    panel.add(label1);
    panel.add(instruction);
    instruction.setText("go to cmd");
    
   
   
    
  }
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource(); 
    if(b==b1) {
        y.playgame();

             
     
      }
    
      else {
      System.out.println("Please click play yutnorigame button!");
      }
      
      
      }


  

  public static void main(String[] args) {
    YutGui yg=new YutGui();
    yg.yutgui();
    yg.setDefaultCloseOperation(EXIT_ON_CLOSE);
    yg.pack();
    yg.setVisible(true);
  }
}
