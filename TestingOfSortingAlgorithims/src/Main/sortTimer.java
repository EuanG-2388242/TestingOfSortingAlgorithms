package Main;

import java.util.Arrays;

public class sortTimer {
	
	public static long measureSortTime(int[] array, SortingAlgorithm sorter) {
		
		int[] copy = Arrays.copyOf(array, array.length);
		long startTime = System.nanoTime();
		
		sorter.sort(copy);;
		
		long endTime = System.nanoTime();
		
		return(endTime - startTime) / 1_000_000;
	}
}
