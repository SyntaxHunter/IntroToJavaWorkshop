package day3;

import javax.swing.JOptionPane;

public class name {
	public static void main(String[] args) {
		
		String ans =JOptionPane.showInputDialog("Enter your name");
		String vcr =JOptionPane.showInputDialog(" Hello " +ans+" ,now what is your favorite primary color");
		
		if (vcr.equals("red") || vcr.equals("Red")) {
			
			String ans3 =JOptionPane.showInputDialog("are you shure that is your favorite primary color (yes/no)");
			
		}
		
		if (vcr.equals("blue") || vcr.equals("Blue")) {
			
			
			String ans2 =JOptionPane.showInputDialog("correct, how old are you");
			
			
		}
		if (vcr.equals("green") || vcr.equals("Green")) {
			
			JOptionPane.showMessageDialog(null, " Wait, green is not a primary color ");
			
			
		}
		if(vcr.equals("yellow") || vcr.equals("yellow")) {
			
			
			String ans3 =JOptionPane.showInputDialog("are you shure that is your favorite primary color (yes/no)");
			
		}
		
		
	}

}
