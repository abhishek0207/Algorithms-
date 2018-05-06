/*Quick sort algorithm based on the end element acting as a pivot */

public class QuickSortImpl {

	public static void main(String args[]) {
		int[] Arr = {7, 11, 10, 9, 9, 8, 7, 6};
		long startTime = System.nanoTime();
		QuickSort(Arr, 0, Arr.length - 1);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; 
		System.out.println("time taken :" + duration);
		for(int j: Arr) {
			System.out.println(j);
		}
		
	}

	private static void QuickSort(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		if(i < length) {
		int partitionIndex = partition(arr, i, length);
		QuickSort(arr, i, partitionIndex - 1);
		QuickSort(arr, partitionIndex + 1, length);
		}
		
		
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		//consider the last element as the pivot, 
		int pivot = end;
		int partitionIndex = start;
		for(int i = start; i< arr.length; i++) {
			if(arr[i] < arr[pivot] ) {
				int temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				partitionIndex++;
			} 
		}
		
		int temp = arr[partitionIndex];
		arr[partitionIndex] = arr[pivot];
		arr[pivot] = temp;
		return partitionIndex;
	}
}
