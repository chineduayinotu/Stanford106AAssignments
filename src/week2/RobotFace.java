package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// The head. The head is a big rectangle whose dimensions are given by the named
// constants HEAD_WIDTH and HEAD_HEIGHT. The interior of the head is gray, although it
// should be framed in black

public class RobotFace extends GraphicsProgram {
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 20;
	private static final int MOUTH_WIDTH = 80;
	private static final int MOUTH_HEIGHT = 20;
	
	double x = getWidth();
	double y = getHeight();
	
	public void run () {
		addFace (getWidth() /2 , getHeight() /2); }
	
	private void addFace(double i, double j) {
		
		addHead(i , j);
		addEye(i - HEAD_WIDTH / 4, j - HEAD_HEIGHT /4);
		addEye(i + HEAD_WIDTH / 4, j - HEAD_HEIGHT /4);
		addMouth(i, j + HEAD_HEIGHT /4);
	}
	
	private void addHead(double i, double j) {
		double x = i - HEAD_WIDTH / 2;
		double y = j - HEAD_HEIGHT / 2;
		GRect head = new GRect(x , y , HEAD_WIDTH, HEAD_HEIGHT);
		head.setFillColor(Color.gray);
		head.setFilled(true);
		add(head);
	}
		
	private void addEye(double i, double j) {
		double x = i - EYE_RADIUS;
		double y = j - EYE_RADIUS;
		GOval eye = new GOval(x , y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFillColor(Color.yellow);
		eye.setFilled(true);
		eye.setColor(Color.yellow);
		add(eye);
	}	
		
	private void addMouth(double i, double j) {
		double x = i - MOUTH_WIDTH / 2;
		double y = j - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x , y , MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		mouth.setColor(Color.white);
		add(mouth);

	}
	
		
	

}
