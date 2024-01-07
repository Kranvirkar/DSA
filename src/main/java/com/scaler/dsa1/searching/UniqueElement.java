package com.scaler.dsa1.searching;

public class UniqueElement {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,4,4};
		System.out.println(solve(arr));

	}
	
	public static int solve(int[] arr) {
		int n=arr.length;
		if (n==1) {
			return arr[0];
		}
		if (arr[0]!=arr[1]) {
			return arr[0];
		}
		if (arr[n-1] != arr[n-2]) {
			return arr[n-1];
		}
		int l=1,h=n-1;
		while (l<=h) {
			int m=(l+h)/2;
			if (arr[m]!=arr[m-1] && arr[m]!=arr[m+1]) {
				return arr[m];	
			}
			if (arr[m]==arr[m-1]) {
				m=m-1;
			}
			if (m%2==0) {
				l=m+2;
			}else {
				h=m-1;
			}
		}
		return 0;
	}

}
