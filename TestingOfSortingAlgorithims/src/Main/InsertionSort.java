package Main;

public class InsertionSort implements SortingAlgorithm {
	
	@Override
	public void sort(int[] array) {
		for(int i = 1; i < array.length; i++) { //Loops through the list
			
			int key = array[i]; //sets key variable to where we are on the list at point j
			int j = i -1; //sets i to be 1 less that j
			
			while(j >= 0 && array[j] > key) { //continues checking through the list to see if there is a number smaller than it
				
				array[j + 1] = array[j]; //sets the bigger value back one place
				i = i-1; //changes i 
				j--;
				
			}
			array[j + 1] = key;
			
		}
	}

}
