package Main;

public class HybridMergeSort implements SortingAlgorithm {
	private static final int INSERTION_SORT_THRESHOLD = 10;
	
	@Override
	public void sort(int[] array) {
		mergeSort(array, 0, array.length -1);
	}
	
    private void mergeSort(int[] array, int left, int right) {
        if (right - left < INSERTION_SORT_THRESHOLD) {
            insertionSort(array, left, right);
        } else if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            Merge(array, left, mid, right);
        }
    }
    
    private void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    
	private void Merge(int[] array, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right -mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		System.arraycopy(array, left, L, 0, n1);
		System.arraycopy(array, mid + 1, R, 0, n2);
		
		int i = 0, j = 0, k = left;
		
		while(i < n1 && j < n2) {
			array[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
		}
		
		while(i < n1) array[k++] = L[i++];
		while(j < n2) array[k++] = R[j++];
		
		
			
	}

}
