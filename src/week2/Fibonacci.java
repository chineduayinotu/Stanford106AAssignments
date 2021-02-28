package week2;

// Write a program that displays the terms in the Fibonacci sequence, starting with Fib(0)
// and continuing as long as the terms are less than 10,000. Thus, your program should
// produce the following sample run

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000 ;
	public void run() {
		println ("Below is a list of the Fibbonaci Sequence");
		int fib1 = 0;
		int fib2 = 1;
		while (fib1 <= MAX_TERM_VALUE) {
			println (fib1);
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
					
		}
	/*Once Fibanocci reaches the max value 10000, it stops */	
		
	}
			
	}
