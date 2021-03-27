package week5JavaCodingAssignment;



//This is Part 3a of assignment
public class AsteriskLogger implements Logger{// this implements the interface Logger into this class by using the word "implements"
	
	public AsteriskLogger() {}//This is part of part 10 its instantiating an instance of this class to the app class
		
	

	// this is part 4
	
public void Log(String string) {
	System.out.println("***" + string + "***");// this method will print out a 3 asterisks on each side of the String
	
}
//This is part 5 
	
	public void Error(String string) {// This method creates a box of asterisks with an error message
		string = "*** ERROR: " + string +  "***";
		String asteriskLine= "";
		for (int i = 0; i < string.length(); i ++) {
			asteriskLine = asteriskLine + "*";
		}
		
System.out.println(asteriskLine+ "\n" + string + "\n" + asteriskLine);
	}
	
}


