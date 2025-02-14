package Main;

public class MergeSort implements SortingAlgorithm {
	
	@Override
	public void sort(int[] array) {
		MergeSort(array, 0, array.length -1);
	}
	
	protected void MergeSort(int[] array, int left, int right) {
		
		if (left < right) {
			
			int mid = (left + right) / 2;
			MergeSort(array, left, mid);
			MergeSort(array, mid + 1, right);
			Merge(array, left, mid, right);
		}
			
			
	}
		
	protected void Merge(int[] array, int left, int mid, int right) {
		
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
