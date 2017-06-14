package day3;

import javax.swing.JOptionPane;
 
public class BirthdayReminder {
 
	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 5th";
		String dadsBirthday = "November 10th";
		String myBirthday = "January 2nd";
 
		// 2. Find out which birthday the user wants and and store their response in a variable
		String who = JOptionPane.showInputDialog("Whose birthday do you want? (Mom, Dad, or you)");
		
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "You want the birth date of " + (who.equalsIgnoreCase("me")? "yourself" : who) + ".");
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(who.equalsIgnoreCase("mom")){
			JOptionPane.showMessageDialog(null, "Your mom's birthday is " + momsBirthday + ".");
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(who.equalsIgnoreCase("dad")){
			JOptionPane.showMessageDialog(null, "Your dad's birthday is " + dadsBirthday + ".");
		}
		
		// 6. if user asked for your name
			// print myBirthday
		else if(who.equalsIgnoreCase("me")){
			JOptionPane.showMessageDialog(null, "Your birthday is " + myBirthday + ".");
		}
		
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
		}
		
	} 
}
