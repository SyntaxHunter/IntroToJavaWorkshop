package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
		JOptionPane.showMessageDialog(null, "Have a great day!");
		String age = JOptionPane.showInputDialog("How old are you?");
		JOptionPane.showMessageDialog(null, "I am also " + age + ".");
		String color = JOptionPane.showInputDialog("What is your favorite color?");
		if (color.equals("white")) {
			JOptionPane.showMessageDialog(null, "That is my favorite color, too!");
		} else {
			JOptionPane.showMessageDialog(null, "That is a nice color, but my favorite color is white.");
		}
		String animal = JOptionPane.showInputDialog("What is your favorite animal?");
		JOptionPane.showMessageDialog(null, "My favorite animal is also a(n) " + animal + "! What a coincidence?");

	}

}
