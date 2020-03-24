
public class ClassDataArray

{
	private Person[] myPersonArray;
	private int nElems;
							
	public ClassDataArray(int max) {
							
		myPersonArray = new Person[max];
		nElems = 0;
	}

	
public Person find(String searchName) { 
	return null;
}

public Person findBinarySearch(String searchName) {
	
	int low = 0;
	int high = myPersonArray.length - 1;	// nElems - 1
	
	while(low <= high) {
		
		int mid = (low + high)/2;
		
		if (myPersonArray[mid] != null) {
			System.out.println("last name of Person" + myPersonArray[mid].getLast());
		}
		else {
			System.out.println("Person is null");
		}
		
		if (myPersonArray[mid] == null) {
			high = mid - 1;
		}				
		else if (myPersonArray[mid].getLast().compareToIgnoreCase(searchName) == 0) {
			
			return myPersonArray[mid];
		}
		else if(myPersonArray[mid].getLast().compareToIgnoreCase(searchName) > 0) {
			
			high = mid-1;
		}
		else if(myPersonArray[mid].getLast().compareToIgnoreCase(searchName) < 0) {
			low = mid + 1;
		}			
		
		// "Bottom" of Loop
	}
	return null;
}

public boolean insertBinary(String last, String first, int age) 
{
	return insertBinary(new Person(last, first, age));
}

public boolean insertBinary(Person person) 
{
	if (nElems < myPersonArray.length) {
		
		int low = 0;
		int high = myPersonArray.length - 1;
		int currentIndex = 0;
		String newPersonLast = person.getLast();
		String currentLast = "";
	
		while(low <= high) {
			
			currentIndex = (low + high) / 2;
			
			if(myPersonArray[currentIndex] == null) {
				System.out.println("person at index " + currentIndex+ " is null");
				high = currentIndex - 1;
			}
			else {
				currentLast = myPersonArray[currentIndex].getLast();
				System.out.println("person at index " + currentIndex+ " is " + currentLast);
				
				if(newPersonLast.compareToIgnoreCase(currentLast) < 0){
					high = currentIndex - 1;
				}
				else {
					low = currentIndex + 1;
				}
			}
		}
		
		currentIndex = low;
		
		if(myPersonArray[currentIndex] != null) {
			
			currentLast = myPersonArray[currentIndex].getLast();
			
			if(newPersonLast.compareToIgnoreCase(currentLast) > 0){
				currentIndex++;						
			}				
		}
		
		for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
			myPersonArray[i] = myPersonArray[i - 1];
			
		}
		
		myPersonArray[currentIndex] = person;
		System.out.println("inserting " + newPersonLast + " at index " + currentIndex);
		nElems++;	
		
	}
	return false;
}

public boolean insert(String last, String first, int age)							
{
	return insert(new Person(last,first,age));
	/*
	// Make sure we are in bounds:
	if(nElems < myPersonArray.length)
	{
		myPersonArray[nElems] = new Person(last, first, age);
		nElems++; // increment size 
		return true; // success
	}	
	
	return false;	// implicit else
	*/
}

// overload, not in book
public boolean insert(Person person) {
	if(nElems < myPersonArray.length) {
		myPersonArray[nElems] = person;
		nElems++; // increment size
		return true;	// success
	}	
	return false;	// implicit else
}

	public boolean delete(String searchName) {
		int j = 0; // broken out so we can access later
		for(; j < nElems; j++) { // omitting the lcv part
			if(myPersonArray[j].getLast().equals(searchName)) {
				break;	// this retains the value of the LCV for further use
			}
		}
					
		// if we haven't found it, then 'j' will be equal to
		// the number of elements in the array.
		if(j == nElems) {
			return false; // We didn't find it
		}
		
		// Now, remove that element, and shift the others down:
		// (This actually just moves the upper elements down,
		// and overwrites the deleted one:
		
		//
		for(int k = j; k < nElems; k++) {
			// shift down
			if(k < nElems) {
				myPersonArray[k] = myPersonArray[k + 1];
			}
			// reduce the number of elements by 1:
			nElems--;
			
		}
		
		return true;
		
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++)
		{
			myPersonArray[i].displayPerson();
		}
	}

}	// end class ClassDataArray