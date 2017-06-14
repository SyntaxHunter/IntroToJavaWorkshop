package day3;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class SlaveTortoise {
	
	public static void main(String[] args) {
		String shape;
		Robot robot = new Robot();
		robot.setSpeed(10);
		robot.setPenWidth(2);
		
		for(int i = 0; i < 10; i++){
		
			shape = JOptionPane.showInputDialog("What shape would you like the slave tortoise to make?");
			
			if(shape.equals("circle")){
				makeShape(360,1,robot);
			} else if (shape.equals("triangle")){
				makeShape(3,100,robot);
			} else if (shape.equals("square")){
				makeShape(4,100,robot);
			} else if (shape.equals("pentagon")){
				makeShape(5,100,robot);
			} else if (shape.equals("hexagon")){
				makeShape(6,100,robot);
			} else if (shape.equals("heptagon")){
				makeShape(7,100,robot);
			} else if (shape.equals("octogan")){
				makeShape(8,100,robot);
			} else {
				JOptionPane.showMessageDialog(null, "That is an invalid message. \nShape must have between 3 and 8 sides or be a circle.");
			}
		
		}
		
	}
	
	private static void makeShape(int sides, int length, Robot robot){
		robot.penUp();
		robot.moveTo((int) (Math.random() * 1000) + 100, (int) (Math.random() * 700) + 100);
		robot.setRandomPenColor();
		robot.penDown();
		for(int i = 0; i < sides; i++){
			robot.move(length);
			robot.turn(360/sides);
		}
	}
	
}
