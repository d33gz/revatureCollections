package revature.methods;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionMethods {
	public static void main(String[] args) {
		Book b1 = new Book("1984", 1949, "George Orwell");
		Book b2 = new Book("Animal Farm", 1945, "George Orwell");
		Book b3 = new Book("Keep the Apidistra Flying", 1936, "George Orwell");
		Book b4 = new Book("Farewell to Arms", 1929, "Ernest Hemingway");
		Book b5 = new Book("For Whom the Bell Tolls", 1940, "Ernest Hemingway");
		Book b6 = new Book("The Divine Comedy", 1472, "Dante Alighieri");
		
		//.add Method
		ArrayList<Book> bookCollection1 = new ArrayList<Book>();
		bookCollection1.add(b1);
		bookCollection1.add(b2);
		bookCollection1.add(b3);
		
		ArrayList<Book> bookCollection2 = new ArrayList<Book>();
		bookCollection2.add(b4);
		bookCollection2.add(b5);
		bookCollection2.add(b6);
		
		//Check out our Collections
		System.out.println("Collection #1");
		for (Book b: bookCollection1)
			System.out.println(b);
		
		System.out.println("\nCollection #2");
		for (Book b: bookCollection2)
			System.out.println(b);
		
		//.addAll Method
		ArrayList<Book> masterCollection = new ArrayList<Book>();
		masterCollection.addAll(bookCollection2);
		masterCollection.addAll(bookCollection1);
		
		System.out.println("\nMaster Collection");
		for (int i = 0; i < masterCollection.size(); i++)
			System.out.println(masterCollection.get(i));
		
		//.clear Method
		bookCollection1.clear();
		bookCollection2.clear();
		System.out.println("\nCleared Collections");
		System.out.println(bookCollection1 + " " + bookCollection2 + "\n");
		
		//.contains Method
		Book b7 = new Book("Atlas Shrugged", 1957, "Ayn Rand");
		System.out.println("Does our Master Collection have Atlas Shrugged?");
		System.out.println(masterCollection.contains(b7));
		System.out.println("Does it have The Divine Comedy?");
		System.out.println(masterCollection.contains(b6)+"\n");
		
		//.equals Method
		ArrayList<Book> fakeCollection = new ArrayList<Book>();
		System.out.println("Is our Fake Collection equal to our Master Collection?");
		System.out.println(masterCollection.equals(fakeCollection));
		fakeCollection.addAll(masterCollection);
		System.out.println("How about now?");
		System.out.println(masterCollection.equals(fakeCollection)+"\n");
		
		//.isEmpty Method
		System.out.println("Is our Fake Collection empty?");
		System.out.println(fakeCollection.isEmpty());
		fakeCollection.clear();
		System.out.println("Now about how?");
		System.out.println(fakeCollection.isEmpty()+"\n");
		
		//.iterator Method
		Iterator<Book> itr = masterCollection.iterator();
		System.out.println("Let's iterate!");
		while (itr.hasNext())
			System.out.println(itr.next());
	
		//.remove Method
		masterCollection.remove(1);
		masterCollection.remove(b3);
		System.out.println("\nI removed some books... can you tell?");
		iterateMe(masterCollection);
	
		//.removeAll Method
		ArrayList<Book> lendingCollection = new ArrayList<Book>();
		lendingCollection.add(b4);
		lendingCollection.add(b2);
		masterCollection.removeAll(lendingCollection);
		System.out.println("\nA friend wanted to borrow a few books. Which ones did they take? These are all that's left...");
		iterateMe(masterCollection);
		
		//.size
		System.out.println("\nHow big is our Master Collection now?\n" + masterCollection.size());
		
	}
	public static void iterateMe(ArrayList<Book> collection) {
		Iterator<Book> itr = collection.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
