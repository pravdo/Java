package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// file = an abstract representation of file and directory pathnames
/*
		File file = new File("calculator.txt");
		
		if(file.exists()) {
			System.out.println("Exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("Doesn't exist");
		}
*/
//------------------------------------------------------------
	/*
	 * try {
	 
		FileWriter writer = new FileWriter("poem.txt");
				writer.write("Roses are red");
				writer.append("\nSimple poem");
				writer.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
*/
//-----------------------------------------------------------------
		try {
			FileReader reader = new FileReader("calculator.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read(); // read the next character
			}
			reader.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
