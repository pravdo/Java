import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JFrame = a GUI window to add components to
		/*
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("JFrame title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420,420); //sets x and y dimension
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("sw.jpg"); //create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon of frame
		frame.getContentPane().setBackground(new Color(255,200,0)); //change bg color
*/
		MyFrame myFrame = new MyFrame();
	}

}
