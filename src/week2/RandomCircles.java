package week2;

/** 1. True/False questions
a) The value of a local variable named i has no direct relationship with that of a
variable named i in its caller.
Answer: True
b) The value of a parameter named x has no direct relationship with that of a variable
named x in its caller.
Answer: True **/

/** snitch: x = 4004, y = 1001
quaffle: x = 2003, y = 1, z = 1001
bludger: x = 1001, y = 2001, z = 2003 **/


/** Write a GraphicsProgram that draws a set of ten circles with different sizes, positions,
and colors. Each circle should have a randomly chosen color, a randomly chosen radius
between 5 and 50 pixels, and a randomly chosen position on the canvas, subject to the
condition that the entire circle must fit inside the canvas without extending past the edge.
The following sample run shows one possible outcome:
 */

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram
{	
	private static final int N_CIRCLES = 10;
	private static final int MAX_RADIUS = 50;
	private static final int MIN_RADIUS = 5;
		
	public void run()
	{
		for (int x = 0; x < N_CIRCLES; x++)
		{
			double i = rgen.nextDouble (MAX_RADIUS, MIN_RADIUS);
			double j = rgen.nextDouble (0, getWidth() - 2 * i);
			double k = rgen.nextDouble (0, getHeight() - 2 * i);
			GOval circle = new GOval (j, k, 2 * i, 2 * i);
			circle.setFilled(true);
			circle.setFillColor(rgen.nextColor());
			add(circle);
		}
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
	

























