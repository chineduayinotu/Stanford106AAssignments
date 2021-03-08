package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	public void run() {
		println(removeAllOccurrences("Hello Sam, how is it going?", 's') );
		println(removeAllOccurrences("Java is complex and interesting", 'e') );
		println(removeAllOccurrences("Summer is here!", 'e') );
		
		// Removing dashes from mobile numbers
		
		println(removeAllOccurrences("346-400-7675", '-') );
		
	}

		private String removeAllOccurrences(String str, char ch) {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
			result += str.charAt(i);
			}
			}
			return result;
		}

	}
	

