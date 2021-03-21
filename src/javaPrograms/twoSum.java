package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] arr = twoSum(nums, target);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				if (i != map.get(diff)) {
					return new int[] { i, map.get(diff) };
				}

			}

		}

		return new int[] { -1 };

	}
}
