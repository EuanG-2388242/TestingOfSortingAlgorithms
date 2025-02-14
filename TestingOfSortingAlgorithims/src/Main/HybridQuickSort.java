package Main;

public class HybridQuickSort extends QuickSort {
	
	private static final int INSERTION_SORT_THRESHOLD = 10;
	
	@Override
	protected void quickSort(int[] array, int low, int high) {
		
		if(high - low < INSERTION_SORT_THRESHOLD) {
			
			insertionSort(array, low, high);
	
		} else {
			
			super.quickSort(array, low, high);
			
		}
	}
	
	private void insertionSort(int[] array, int low, int high) {
		
		for(int indexI = low + 1; indexI <= high; indexI++) {
			
			int key = array[indexI];
			int indexJ = indexI - 1;
			
			while(indexJ >= low && array[indexJ] > key) {
				
				array[indexJ + 1] = array[indexJ];
				indexJ--;
				
			}
			
			array[indexJ + 1] = key;
		}
	}

}
