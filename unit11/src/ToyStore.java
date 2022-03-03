//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{	
//		System.out.println(toys);
//		System.out.println("loading");
		String[] toy = toys.split(" ", 0);
		for (String t: toy) {
//			System.out.println("toy: " + t);
			Toy item = getThatToy(t);
			// a is empty then add the new toy to the list
			// else increment the count
			
			// if the toy doesn't exist in the List, add
			// else increment its count
			if (item == null) {
				item = new Toy();
				item.setName(t);
				item.setCount(1);
				toyList.add(item);
			}
			else {
				item.setCount(item.getCount() + 1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		// go through the list to check the name of each Toy against nm
  		// if not found, return Toy with empty name and empty count
  		// purpose of function? for part 1?
  		
  		// array of elements in memory
  		// iterator goes through the array
  		// points at the memory where object is
  		// uses getName method to see name already exists
  		// if so, return the reference, where the count will be modified
  		// if not, return null so that the object can be added to the end
  		
  		for (Toy i: toyList) {
//  			System.out.println(i);
  			// grabs the reference b/c referring to an object, not just a value
  			if (i.getName().equals(nm)) {
  				//return toyList.get(i).;
  				return i; // returns the address to the object
  			}
  		}
		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		String name = "";
 // 		System.out.println("entering loop");
 // 		System.out.println(toyList.size());
  		for (int i = 0; i < toyList.size(); i++) {
 // 			System.out.println("entered loop");
  			if (toyList.get(i).getCount() > max) {
  				max = toyList.get(i).getCount();
  				name =  toyList.get(i).getName();
  			}
  		}
  		return name;
  	}  
  
  	public void sortToysByCount()
  	{
  		for (int i = toyList.size(); i >= 0; i--) {
  			for (int j = 0; j < i - 1; j++) {
  				if (toyList.get(j).getCount() > toyList.get(j + 1).getCount()) {
  					Toy temp = toyList.get(j);
  					toyList.set(j, toyList.get(j + 1));
  					toyList.set(j + 1, temp);
  				}
  			}
  		}
  		
//  		System.out.println("Sorted");
//  		for (int i = toyList.size() - 1; i >= 0; i--) {
//  			System.out.println(toyList.get(i).getName());
//  			System.out.println(toyList.get(i).getCount());
//  		}
  		
  	
  	}  
  	  
	public String toString()
	{
		String toString = "[";
		for (int i = 0; i < toyList.size(); i++) {
			if (i == toyList.size() - 1) {
				toString += toyList.get(i).getName() + " " + toyList.get(i).getCount();
			}
			else {
				toString += toyList.get(i).getName() + " " + toyList.get(i).getCount() + ", ";
			}
		}
		return toString + "]";
	}
}