package InsectInstance;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestGUI extends javax.swing.JFrame{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Jeff");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//frame.setContentPane(frame);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 300);
		frame.setVisible(true);
		
		JTextField field = new JTextField();
		field.setSize(100, 50);
		field.setLocation(85, 90);
		field.setVisible(true);
		
	}

	

	

}