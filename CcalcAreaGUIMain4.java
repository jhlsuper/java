package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcAreaGUIMain4 extends JFrame implements ActionListener {
  JTextField radiusTf1;
  JTextField areaTf2; 
  public CalcAreaGUIMain4() {
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("radius");
    JLabel label2 = new JLabel("area");
    radiusTf1 = new JTextField(20);
    areaTf2 = new JTextField(20);
    JButton b1 = new JButton("calc");
    JButton b2 = new JButton("cancel");
    b1.setPreferredSize(new Dimension(40,40));
    b1.addActionListener(this);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        areaTf2.setText(" ");
        radiusTf1.setText(" ");
        b2.setText("canceled.");
      }
    });
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  } 
  public void actionPerformed(ActionEvent e){
    JButton b = (JButton)e.getSource();
    Double r = Double.parseDouble(radiusTf1.getText());
    areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
    b.setText("calced.");
  }

  public static void main(String[] args) {
    CalcAreaGUIMain4 c = new CalcAreaGUIMain4();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible(true);
  }
}
