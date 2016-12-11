package com.sd.gui;

import javax.swing.*;

import java.awt.*;

class CalcAreaGUIMain2 extends JFrame implements ActionListener {
	JTextField radiusTf1;
	JTextField areaTf2;
	public CalcAreaGUIMain2() {
	JFrame f=new JFrame();
	JPanel panel=new JPanel(new GridLayout(3,2));
	getContentPane().add(panel);
	JLabel label1=new JLabel("radius");
	JLabel label2=new JLabel("area");
	JTextField radiusTf1 =new JTextField(10);
	JTextField areaTf2 =new JTextField(10);
	JButton b1=new JButton("calc");
	JButton b2=new JButton("cancel");
	b1.addActionListener(this);
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			areaTf2.setText(" ");
			radiusTf1.setText(" ");
			b2.setText("completed");
	}
	});
	
	panel.add(label1);
	panel.add(label2);
	panel.add(radiusTf1);
	panel.add(areaTf2);
	panel.add(b1);
	panel.add(b2);
	
	f.pack();
	f.setVisible(true);

	}
	void actionPerformed(AtctionEvent e) {
		JButtone b=(JButtone)e.getSource();
		Double r = Double.parseDouble(radiusTf1.getText());
		areaTf2.setText(Double.toString(Math,PI*Math.pow(r,2)));
			b.setText("calculatted");
	}
	public static void main(String[] args) {
		CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
		
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.pack();
		c.setVisible(true);
	}
}