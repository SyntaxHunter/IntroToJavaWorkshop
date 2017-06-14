/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Riddle Me This
Duration=.33
Platform=Eclipse
Type=Recipe
Objectives=if/else & score & JOptionPane
*/

package day3;

import javax.swing.JOptionPane;

public class TheRiddler {

    public static void main(String[] args) {

        // 1. Make a variable to hold the score
    	int score = 0;
    	String response;
    	
        // 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
    	response = JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
    	
        // 4. If they got the answer right, pop up "correct!" and increase the score by one
    	if(response.equalsIgnoreCase("incorrectly")){
    		JOptionPane.showMessageDialog(null, "Correct!");
    		score++;
    	
        // 5. Otherwise, say "wrong" and tell them the answer
    	} else
    		JOptionPane.showMessageDialog(null, "Wrong. The correct answer was: incorrectly");
    	
        // 6. Add some more riddles
    	response = JOptionPane.showInputDialog("What is at the end of a rainbow?");
    	if(response.equalsIgnoreCase("w") || response.equalsIgnoreCase("the letter w")){
    		JOptionPane.showMessageDialog(null, "Correct!");
    		score++;
    	} else
    		JOptionPane.showMessageDialog(null, "Wrong. The correct answer was: the letter w");
    	
    	response = JOptionPane.showInputDialog("What occurs once in every minute, twice in every moment, yet never in a thousand years? ");
    	if(response.equalsIgnoreCase("m") || response.equalsIgnoreCase("the letter m")){
    		JOptionPane.showMessageDialog(null, "Correct!");
    		score++;
    	} else
    		JOptionPane.showMessageDialog(null, "Wrong. The correct answer was: the letter m");
    	
        // 2. Make a pop up to show the score.
        JOptionPane.showMessageDialog(null, "Score = " + score);
 
    }
}

