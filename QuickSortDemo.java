import java.util.Arrays;
/*
1. working of quick sort demonstrated via printing various steps/values.
2. explained via comments.
*/

public class QuickSortDemo {
	static void start(int a[]) {
		sort(a, 0, 7);
		// sort(array,lowest index,highest index)
	}

	public static void sort(int a[], int low, int high) {
		System.out.println("\nexecuting sort(a," + low + "," + high + ")");
		System.out.println("before this iteration---> " + Arrays.toString(a));
		int i = low; // value of low and high will be used later , hence taking
						// i and j for iterations.
		int j = high;
		int t;
		int pivot = a[(low + high) / 2]; // middle element VALUE(not index) as
											// pivot.
		System.out.println("pivot = " + pivot);

		while (i <= j) {
			while (a[i] < pivot) // on left side stop for first i(index) which
									// is more than pivot.
				i++;
			while (a[j] > pivot) // on right side stop for first j(index) which
									// is less than pivot.
				j--;

			if (i <= j) {
				System.out.println("swapping " + a[i] + " at " + i + " and " + a[j] + " at " + j);
				t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
				// swapping values at i and j , so that all lower elements goes
				// to left and higher to right.

			}
			// iterate until j is more than i means, all elements lower than
			// pivot at left and higher at right.

		}
		System.out.println("after this iteration---> " + Arrays.toString(a));
		System.out.println("i = " + i + "    j = " + j);
		if (low < j) // check if more than one element(boundary condition for
						// recursion) on left side
		{
			System.out.println("called sort(a," + low + "," + j + ")");
			sort(a, low, j);
		}
		if (i < high) // similarly if more than one element on right , recurse
						// the right sub-array.
		{

			System.out.println("called sort(a," + i + "," + high + ")\n");
			sort(a, i, high);
		}
	}

	public static void main(String[] ar) {
		int[] i = { 3, 8, 4, 6, 7, 1, 2, 5 };
		QuickSortDemo.start(i);
		System.out.println("in main" + Arrays.toString(i));
	}

}