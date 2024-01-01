package com.scaler.dsa1.sort;

import java.util.HashSet;
import java.util.Set;

public class FindTripletsWithZeroSum {

	public static boolean findTriplets(int arr[]) {
		boolean flag = false;

		for (int i = 0; i < arr.length - 1; i++) {
			Set<Integer> hs = new HashSet<>();
			for (int j = i + 1; j < arr.length; j++) {
				int x = -(arr[i] + arr[j]);
				if (hs.contains(x)) {
					flag = true;
				} else {
					hs.add(arr[j]);
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr = {0, -1, 2, -3, 1};
		System.out.println(findTriplets(arr));

	}

}
