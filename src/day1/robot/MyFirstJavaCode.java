package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaCode {

	public static void main(String[] args){
		Robot r2d2 = new Robot();
		r2d2.setSpeed(100);
		r2d2.setPenColor(Color.RED);
		r2d2.penDown();
		
		for(int i = 0; i < 20; i++){
			
		}
		
//		createShape(r2d2,6,150);
//		r2d2.move(75);
//		r2d2.turn(90);
//		r2d2.penUp();
//		r2d2.move(75);
//		r2d2.penDown();
//		r2d2.turn(270);
//		createShape(r2d2,360,1);
		
//		r2d2.move(150);
//		r2d2.turn(90);
//		r2d2.setSpeed(80);
//		r2d2.turn(180);
//		r2d2.move(75);
//		r2d2.turn(180);
//		r2d2.penDown();
//		r2d2.sparkle();
//		for(int i = 0; i < SIDES; i++){
//			r2d2.move(150);
//			r2d2.turn(360/SIDES);
//		}
//		r2d2.penUp();
//		r2d2.move(75);
//		r2d2.turn(90);
//		r2d2.move(150);
//		r2d2.turn(180);
		
	}
	
	public static void createShape(Robot r2d2, int sides, int sideLength){
		for(int i = 0; i < sides; i++){
			r2d2.move(sideLength);
			r2d2.turn(360/sides);
		}
	}
	
}
