package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor = JOptionPane.showInputDialog("what flavor of popcorn");
		String time = JOptionPane.showInputDialog("How long to cook it");
		int min = Integer.parseInt(time);

		
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		
		microwave.putInMicrowave(popcorn);
		microwave.setTime(min);
		microwave.startMicrowave();
	}

}
