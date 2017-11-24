import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class personMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("namn"));
		
		ArrayList<Person> nameList = new ArrayList<Person>();
		while(sc.hasNextLine()) {
			Person p =  new Person(sc.nextLine().trim());
			nameList.add(p);
		}

		Collections.sort(nameList);
		
		for(Person p : nameList) {
			
			System.out.println(p.firstName + " " + p.lastName);
		}
		

	}
}