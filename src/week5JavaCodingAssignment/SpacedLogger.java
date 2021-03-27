package week5JavaCodingAssignment;


//part 3 b
public class SpacedLogger implements Logger {// this implements Logger interface
	
	
	public SpacedLogger() {}// This is part of part 10 its instantiating an instance of this class to the app class
	
	// part 6 and 7 
	public void Log(String string) {//This should space out the letters in each word
		
		StringBuilder Log = new StringBuilder();
		
		for (int i = 0 ; i < string.length(); i++) {
			
			Log.append(string.charAt(i)+ " ");
		}
		System.out.println(Log);
	}
	
	//part 8 
	@Override
	public void Error(String string) {// This method is created to space out the input but with the ERROR: intact
	
		System.out.println("Error: ");
		
		Log(string);
	}
	
	

		
	}


