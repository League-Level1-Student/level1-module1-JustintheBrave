package _07_binary_converter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField text = new JTextField();
	static JLabel label = new JLabel();
	
	public static void Bconvert() {
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("Binary Number Converter");
		panel.add(text);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bconvert();
	}

}
