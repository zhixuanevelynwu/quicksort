package quicksort;

/**
 * This is an implementation of the quickSort
 *
 * @author Evelyn Wu
 * @version 11/03/2019
 *
 */
public class QuickSort {

	 public static void quickSort(String[] array) {
	        quickSort(array, 0, array.length - 1) ;
	 }

	 public static void quickSort(String[] array, int left, int right) {
	        int pivot = partition(array, left, right) ;
	        if ( pivot - left > 1 )  {
	            quickSort( array, left, pivot - 1 );
	            //printArray(array);
	        }
	        if ( right - pivot > 1 ) {
	            quickSort( array, pivot + 1, right );
	            //printArray(array);
	        }
	 }

	public static int partition(String[] array, int left, int right) {
		int pivot = selectPivot(array);

		swap(array, pivot, right);
		pivot = right;
		right = right - 1;

		while ( right >= left ) {
			while ( array[left].compareTo(array[pivot]) < 0 )
				left++;
			while ( right >= left && array[right].compareTo(array[pivot]) >= 0 )
				right--;
			if ( right > left )
				swap(array, left, right);

		}
		swap(array, left, pivot);

		return left;
	}

	public static int selectPivot(String[] array) {
		String first = array[0];
		String last = array[array.length - 1];
		String middle = array[(array.length - 1)/2];

		if ( first.compareTo(last) > 0 && first.compareTo(middle) < 0 ||
				first.compareTo(last) < 0 && first.compareTo(middle) > 0 )
			return 0;

		if ( last.compareTo(first) > 0 && last.compareTo(middle) < 0 ||
				last.compareTo(first) < 0 && last.compareTo(middle) > 0 )
			return array.length - 1;

		if ( middle.compareTo(last) > 0 && middle.compareTo(first) < 0 ||
				middle.compareTo(last) < 0 && middle.compareTo(first) > 0 )
			return (array.length - 1)/2;

		else return (array.length - 1)/2;
	}

	public static void swap(String[] array, int i1, int i2) {
        String temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

	public static void printArray(String[] array) {
		for ( String str : array )
			System.out.print(str + " ");
		System.out.println();
	}


}
