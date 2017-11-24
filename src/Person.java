import java.io.File;
import java.util.Scanner;



public class Person implements Comparable<Person>{
	
	String firstName;
	String lastName;
	
	
	
	public Person(String fullName)  {
		// ex: p = "Karlsson Ohlsson Perssono Joakim"
		
		int index = fullName.lastIndexOf(' ');
		
		firstName = fullName.substring(0, index);
		lastName = fullName.substring(index+1);
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public int compareTo(Person p) {

		  if(this.lastName.compareTo(p.getLastName()) == 0){
	            return this.firstName.compareTo(p.getFirstName());
	        }
	        else{
	            return this.lastName.compareTo(p.getLastName());
	        }
	    }
	}
	
	
	
