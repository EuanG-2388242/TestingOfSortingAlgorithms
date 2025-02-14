package Main;

public class QuickSort implements SortingAlgorithm {
	
	@Override
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}
	
	protected void quickSort(int[] array, int low, int high) {
	
		if(low < high) {
		
			int pivotIndex = Partition(array, low, high);
		
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}
	
	protected int Partition(int[] array, int low, int high) {
		
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j < high - 1; j++) {
			
			if(array[j] <= pivot) {
				
				i += 1;
				Swap(array, i, j);
			}
		}
		
		Swap(array, i + 1, high);
		
		return i + 1;
	}
	protected void Swap(int[] array, int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
