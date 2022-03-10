package revature.assignment1and2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment1and2 {
	public static void main(String[] args) {
		//Assignment 1
		//Create an ArrayList and a HashSet. Insert 3 objects into each.
		//ArrayList
		ArrayList<Object> foods = new ArrayList<Object>();
		foods.add(new Food("chicken"));
		foods.add(new Food("eggs"));
		foods.add(new Food("yogurt"));
		System.out.println(foods);
		
		//HashSet
		HashSet<Object> drinks = new HashSet<Object>();
		drinks.add(new Drink("milk"));
		drinks.add(new Drink("water"));
		drinks.add(new Drink("juice"));
		System.out.println(drinks);
		
		//Assignment 2
		Iterator<Object> itrF = foods.iterator();
		while (itrF.hasNext()) System.out.println(itrF.next());
		
		Iterator<Object> itrD = drinks.iterator();
		while (itrD.hasNext()) System.out.println(itrD.next());
	}
}
