
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an ordered array of Person object
		int maxSize = 10000; // array size
		ClassDataArray orderedArray;
		orderedArray = new ClassDataArray(maxSize);
		
		// Inserts - InsertBinary
		/*
		orderedArray.insertBinary("Evans", "Patty", 24);
		orderedArray.insertBinary("Smith", "Lorraine", 37);
		orderedArray.insertBinary("Carpenter", "John", 18);
		orderedArray.insertBinary("Weaver", "Will", 19);
		orderedArray.insertBinary("Aumiller", "Allen", 42);
		orderedArray.insertBinary("Krow", "Tim", 19);
		orderedArray.insertBinary("Allen", "Mike", 19);
		orderedArray.insertBinary("Kofroth", "Jonathon", 19);
		orderedArray.insertBinary("Colpetzer", "Trenton", 19);
		orderedArray.insertBinary("Groce", "Chris", 22);
		*/
		
		orderedArray.display();
		
		/*
		String search = "Weaver";
		Person found;
		
		found = orderedArray.findBinarySearch(search);
		
		if (found != null) {
			
		System.out.println("Found " + search);
		found.displayPerson();
		
		}
		else {
			
			System.out.println("not found");
			*/
		}
}
