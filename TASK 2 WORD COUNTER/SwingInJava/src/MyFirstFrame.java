import java.awt.Color;
import java.awt.Container;
//Demo of JFrame 
import javax.swing.*;
import java.awt.*;

public class MyFirstFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // object of JFrame class.
//calling Jframe main methods
		frame.setVisible(true); // to view the new windows.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when windows close the program will be terminate.
		
		frame.setSize(700, 500); // to set width and height of the windows.
		frame.setLocation(100, 100); // add margin to the windows.
		frame.setBounds(200, 200, 700, 400); // it is combine of Size & location
		
		frame.setTitle("My First Frame - Created by Nannu"); // title to add on windows
		ImageIcon icon = new ImageIcon("nannu.jpeg"); // object created of ImageIcon class.
		frame.setIconImage(icon.getImage()); // set the icon of windows
		
		Container cntr = frame.getContentPane();//to change the bg of windows & need to import awt pkg
		cntr.setBackground(Color.GREEN); //bg set to Green.
		
		frame.setResizable(false);//if we pass false then user can not resize the windows
		
		

	}

}
