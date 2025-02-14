package Main;

public class QuickSortMedian3 extends QuickSort {
	
	@Override
	protected int Partition(int[] array, int low, int high) {
		
		int mid = (low + high)/2;
		
		if(array[mid] < array[low]) Swap(array, mid, low);
		if(array[high] < array[low]) Swap(array, high, low);
		if(array[mid] < array[high]) Swap(array, mid, high);
		
		return super.Partition(array, low, high);
	}

}
