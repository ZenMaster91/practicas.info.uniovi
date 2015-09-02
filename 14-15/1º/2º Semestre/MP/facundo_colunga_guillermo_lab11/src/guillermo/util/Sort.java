package guillermo.util;

import java.util.Comparator;

/**
 * To finish...
 * @author Guillermo1
 *
 */
public class Sort {

	public static void sort(Object[] a)
	{
		@SuppressWarnings("unchecked")
		Comparable<Object>[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}
	
	public static <T> void sort(Object[] a, Comparator<T> c)
	{
		@SuppressWarnings("unchecked")
		Comparable<Object>[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1, c);
	}
	
	private static void mergeSort(Object[] a, Object[] tmp, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
	
	private static <T> void mergeSort(Object[] a, Object[] tmp, int left, int right, Comparator<T> c) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center, c);
			mergeSort(a, tmp, center + 1, right, c);
			merge(a, tmp, left, center + 1, right, c);
		}
	}

	@SuppressWarnings("unchecked")
	private static void merge(Object[] a, Object[] tmp, int left, int right, int rightEnd) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while (left <= leftEnd && right <= rightEnd)
			if (((Comparable<Object>) a[left]).compareTo((Object) a[right]) <= 0)
				tmp[k++] = a[left++];
			else
				tmp[k++] = a[right++];

		while (left <= leftEnd)
			// Copy rest of first half
			tmp[k++] = a[left++];

		while (right <= rightEnd)
			// Copy rest of right half
			tmp[k++] = a[right++];

		// Copy tmp back
		for (int i = 0; i < num; i++, rightEnd--)
			a[rightEnd] = tmp[rightEnd];
	}
	
	@SuppressWarnings("unchecked")
	private static <T> void merge(Object[] a, Object[] tmp, int left, int right, int rightEnd, Comparator<T> c) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while (left <= leftEnd && right <= rightEnd)
			if (c.compare((T)a[left], (T)a[right]) <= 0)
				tmp[k++] = a[left++];
			else
				tmp[k++] = a[right++];

		while (left <= leftEnd)
			// Copy rest of first half
			tmp[k++] = a[left++];

		while (right <= rightEnd)
			// Copy rest of right half
			tmp[k++] = a[right++];

		// Copy tmp back
		for (int i = 0; i < num; i++, rightEnd--)
			a[rightEnd] = tmp[rightEnd];
	}
}
