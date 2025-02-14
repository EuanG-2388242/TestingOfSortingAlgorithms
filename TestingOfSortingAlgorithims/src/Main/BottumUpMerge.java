package Main;

public class BottumUpMerge extends MergeSort {
	
	@Override
	public void sort(int[] array) {
		
		if (array == null || array.length <= 1) return;
		
		int n = array.length;
		
		for(int size = 1; size < n; size*= 2) {
			
			for(int left = 0; left < n - size; left += 2 * size) {
				
				int mid = left + size - 1;
				int right = Math.min(left + 2 * size - 1,  n - 1);
				
				Merge(array, left, mid, right);
			}
		}
		
	}

}
