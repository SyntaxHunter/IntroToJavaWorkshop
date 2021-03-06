package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot r1 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		r1.setSpeed(10);
		
		// 5. Set the pen width to 5
		r1.setPenWidth(5);
		
		// 9. Put the robot's pen down
		r1.penDown();
		
		// 6. Do steps #7 to #8 four times...
		for(int i = 0; i < 4; i++){
		
			// 7. Set the pen color to random
			r1.setRandomPenColor();
			
			// 1. Call the drawSquare() method
			drawSquare();
		
			// 8. Turn the robot 90 degrees to the right
			r1.turn(90);
			
		}
		
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for(int i = 0; i < 4; i++){
			r1.move(150);
			r1.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
