import java.awt.Color;
import java.awt.Container;
//Demo of JFrame 
import javax.swing.*;
import java.awt.*;

class MyFirstLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // object of JFrame class.
//calling Jframe main methods
		frame.setVisible(true); // to view the new windows.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when windows close the program will be terminate.
		frame.setBounds(200, 200, 700, 400); // it is combine of Size & location
		Container cntr = frame.getContentPane();//to change the bg of windows & need to import awt pkg
		cntr.setLayout(null); //set the layout to the null
		//creating label
		JLabel label = new  JLabel("User Name :");
		label.setBounds(20, 30, 200, 30);
		cntr.add(label);
		
		Font font = new Font("Aerial",Font.ITALIC,30);
		label.setFont(font);
		
	}

}
