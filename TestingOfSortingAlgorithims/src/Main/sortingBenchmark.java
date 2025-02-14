package Main;

import java.io.IOException;

public class sortingBenchmark {
	
	public static void main(String[] args) throws IOException {
		
		String[] datasets = {"int10.txt", "int50.txt", "int100.txt", "int1000.txt", "int20k.txt", "int500k.txt", "intBig.txt", "dutch.txt", "bad.txt"};
		
		SortingAlgorithm[] algorithms = {
				
				new InsertionSort(), new SelectionSort(), new ShellSort(),
				new MergeSort(), new HybridMergeSort(), new BottumUpMerge(),
				new QuickSort(), new QuickSortMedian3(), new QuickSortDutchFlag(),
				new HybridQuickSort()

		};
		
		
		for (String dataset : datasets) {
			
			System.out.println("\nDataset: " + dataset);
			
			int[] array = fileReader.readDataset(dataset);
			
			for(SortingAlgorithm algo : algorithms) {
				
				long time = sortTimer.measureSortTime(array, algo);
				System.out.println(algo.getClass().getSimpleName() + ": " + time + " ms");
			}
		}
	}

}
