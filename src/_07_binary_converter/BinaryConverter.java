package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField text = new JTextField();
	static JLabel label = new JLabel();
	static JButton button = new JButton();
	static String bin;
	
	public void Bconvert() {
		text.setPreferredSize(new Dimension(200,100));
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension (400,130));
		frame.setTitle("Binary Number Converter");
		panel.add(text);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		button.addActionListener(this);
		button.setText("Enter");
		frame.pack();
		
		
	}
	
	static String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryConverter convert = new BinaryConverter();
		
		convert.Bconvert();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		bin = text.getText();
		convert(bin);
		
		label.setText(convert(bin));
	}

}
