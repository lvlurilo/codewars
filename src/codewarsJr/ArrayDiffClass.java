package codewarsJr;

public class ArrayDiffClass {

	/*
	 * Metodo que compara 2 arrays e retorna um novo array apenas com os elementos
	 * de a != elementos de b
	 * 
	 * Your goal in this kata is to implement a difference function, which subtracts
	 * one list from another and returns the result.
	 * 
	 * It should remove all values from list a, which are present in list b keeping
	 * their order.
	 * 
	 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2} If a value
	 * is present in b, all of its occurrences must be removed from the other:
	 * 
	 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
	 */

	public int[] arrayDiff(int[] a, int[] b) {

		int count1 = 0;
		int count2 = 0;
		int countFinal = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count1++;
				}
				if (count1 != 0) {
					count2++;
					count1 = 0;
				}
			}
		}

		countFinal = a.length - count2;

		int[] arrayDest = new int[countFinal];
		int k = 0;

		count1 = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[j]) {
					count1++;
				}
			}
			if (count1 == b.length) {
				arrayDest[k] = a[i];
				k++;
			}
			count1 = 0;
		}

		a = arrayDest;

		return a;
	}

}
