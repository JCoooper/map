import java.util.*;
/**
 * This program demonstrates how a map (dictionary) data structure is
 * implemented in Java.
 */
public class MapDemo {

    public static void main(String[] args) {

	// Define the map
	Map<String, Integer> gradeBook = new HashMap<String, Integer>();
	
	
	// Put some data into the map
	gradeBook.put("Alice", 8462847);
	gradeBook.put("Rob", 8304756);
	gradeBook.put("Elon", 1927486);
	gradeBook.put("Kimbal", 4759275);
	gradeBook.put("Jeffwho", 3948275);
	gradeBook.put("Pump", 1111112);
	Scanner scrn = new Scanner (System.in);
	boolean w = true;
	while(w == true) {
		
	System.out.println("Do you want to get a specific number (1) or print the whole thing (2) or exit (3):  ");
	
	if(scrn.next() == "1") {
	System.out.println("Who's Phone Number Would You Like To Get?: ");
	String s1 = scrn.next();
	System.out.println(s1 + "'s Phone Number is " + gradeBook.get(s1));
	} else if(scrn.next() == "2") {
	gradeBook.forEach( (name, pnumber) -> System.out.println(name + "'s phone number is " + pnumber) );
	} else if(scrn.next() == "3") {
		w = false;
	}
	
}
    }
}
