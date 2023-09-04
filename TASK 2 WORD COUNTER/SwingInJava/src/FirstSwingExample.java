import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class FirstSwingExample {
public static void main(String[] args) {
	JFrame frm = new JFrame();// frame object created
	JButton btn = new JButton("Click Here"); // button object created 
	btn.setBounds(130, 100, 100, 40); // x,y axis & width height
	frm.add(btn);  // adding button in frame
	frm.setSize(400, 500); //height : width
	frm.setLayout(null);//using no layout mngr
	frm.setVisible(true);
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setResizable(false);
	Container c = frm.getContentPane();
	c.setBackground(Color.MAGENTA);
	
	
}
}
