package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		
		// START HERE
		Robot john = new Robot();
		john.setPenColor(Color.MAGENTA);
		john.penDown();
		for (int i = 0; i < 12; i++) {
		john.move(50);
		john.turn(45);	
		}
		
	
		
		
	}
}
