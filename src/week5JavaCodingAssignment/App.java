package week5JavaCodingAssignment;
// Part 9 created a class named App with a main class
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//part 10 this is calling for that instance of the following classes SpacedLogger and AsteriskLogger
		Logger spacedLogger = new SpacedLogger();
		Logger asteriskLogger = new AsteriskLogger();
		
// Part 11 this will Test both methods on both instances, passing in Strings 
		asteriskLogger.Error("This is a Fatal Error you Must look at everything Again!!! ");
		asteriskLogger.Log("There is an Error!! You must fix this!!!");
				
		
		System.out.println();
		spacedLogger.Error("This is a Huge ERROR!!! Must fix it ASAP!!!!");
		spacedLogger.Log("This is more readable!! With More Spaces!!!");
		
	}

}
