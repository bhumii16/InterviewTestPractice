package javaPrograms;

public class findLongestIncrSubarray {

	/***
	 * Find the longest increasing subarray (continuous) of an integer array .Print
	 * start and end indexes"
	 **********/

	public static void main(String[] args) {

		int[] arr = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };

		findLongestIncreasingInt(arr, arr.length);

	}


	public static void findLongestIncreasingInt(int arr[], int arr_len) {
		int finalSI = -1;
		int finalLI = -1;
		int finalLen = 0;
		int len = 0;
		int lastIndex = -1;
		int startIndex = 0;
		for (int i = 0; i < arr_len-1; i++) {

			if (arr[i + 1] > arr[i]) {
				
				lastIndex = i + 1;
				len = len + 1;
			} else {

				if (finalLen < len) {
					finalSI = startIndex;
					finalLI = lastIndex;
					finalLen = len;
				}

				startIndex = i + 1;
				lastIndex = -1;
				len = 0;
			}
		}
		System.out.println("startIndex=" + finalSI + "; lastIndex=" + finalLI);

	}

	/*
	 * public static void findLongestIncreasingInt(int arr1[], int arr1_len) { int
	 * lenContinuousArr = 1; int maxLen = 1; int startIndex = 0; for (int i = 1; i<
	 * arr1_len; i++) { if (arr1[i] > arr1[i - 1]) { lenContinuousArr++; } else { if
	 * (maxLen < lenContinuousArr) { maxLen = lenContinuousArr; startIndex =
	 * i-maxLen; } lenContinuousArr = 1; } }
	 * 
	 * if(maxLen < lenContinuousArr) { maxLen = lenContinuousArr; startIndex =
	 * arr1_len - maxLen; } int lastIndex = maxLen + startIndex-1;
	 * System.out.println(startIndex + "," + lastIndex);
	 * 
	 * 
	 * }/
	 */
}
