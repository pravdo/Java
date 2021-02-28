import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		this.setTitle("Jthis title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false); //prevent this from being resized
		this.setSize(420,420); //sets x and y dimension
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("sw.jpg"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of this
		this.getContentPane().setBackground(new Color(255,200,0)); //change bg color
	}

}
