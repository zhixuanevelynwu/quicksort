package quicksort;

public class quicksortTest {

	public static void main(String[] args) {
		String[] s1 = {"zack", "apple", "bean"};
		//System.out.println(quicksort.selectPivot(s1));
		
		//apple bean fish shack zack
		String[] s2 = {"fish", "zack", "apple", "bean", "shack", "fish"};
		//System.out.println(QuickSort.selectPivot(s2));
		int pivot1 = QuickSort.partition(s2, 0, s2.length - 1);
		//for ( String str : s2 )
			//System.out.print(str + " ");
		//System.out.println();
		
		//int pivot2 = QuickSort.partition(s2, 0, pivot1 - 1);
		//for ( String str : s2 )
			//System.out.print(str + " ");
		//System.out.println();
		
		int pivot3 = QuickSort.partition(s2, pivot1 + 1, s2.length - 1);
		
		QuickSort.quickSort(s2);
		for ( String str : s2 )
			System.out.print(str + " ");
		System.out.println();
		
		
	}

}
