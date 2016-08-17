package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		
		String ans3 =JOptionPane.showInputDialog("can you write in a modern programing code ");

		// 2. If they say "yes", tell them they will rule the world.
		if (ans3.equals("yes") || ans3.equals("Yes")) {
			
			
			String ans2 =JOptionPane.showInputDialog("you will rule the world " + "\n \n \n ps. how old are you");
		if (ans2 < 18){
			
			JOptionPane.showMessageDialog(null, " nevermind ");
			
			
		

		// 3. Otherwise, wish them good luck washing dishes.
			
		}
		
		if (ans3.equals("no") || ans3.equals("No")) {
			
			
			JOptionPane.showMessageDialog(null, " good luck washing dishes ");
		}	
		
	}
}

