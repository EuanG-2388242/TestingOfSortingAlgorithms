package Main;

public class QuickSortDutchFlag extends QuickSort {
	
	@Override
	protected void quickSort(int[] array, int low, int high) {
		
		if(low < high) {
			
			int[] partitionIndexes = dutchPartition(array, low, high);
			
			quickSort(array, low, partitionIndexes[0] - 1);
			quickSort(array, partitionIndexes[1] + 1, high);
		}
	}
	
	private int[] dutchPartition(int[] array, int low, int high) {
		
		int pivot = array[high];
		int lessPivot = low, greaterPivot = high, index = low;
		
		while(index <= greaterPivot) {
			
			if(array[index] < pivot) {
				
				Swap(array, lessPivot, index);
				
				lessPivot++;
				index++;
				
			} else if(array[index] > pivot ) {
				
				Swap(array, index, greaterPivot);
				
				greaterPivot--;
				
			} else {
				
				index++;
			}
		}
		
		return new int[] {lessPivot, greaterPivot};
	}

}
