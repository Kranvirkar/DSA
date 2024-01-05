package com.scaler.dsa1.searching;

public class LastOccurrance {

	public static void main(String[] args) {
		int[] A = {-5,-5,-3,-3,0,0,1,1,5,5,5,5,8,10,10,15};
		System.out.println(solve(A,5));
	}

	private static int solve(int[] a, int k) {
		int ans=-1,low=0,high=a.length-1;
		while (low<=high) {
			int m=(low+high)/2;
			if (a[m]>k) {
				high=m-1;
			} else if (a[m]<k) {
				low=m+1;
			}else {
				ans=m;
				high=m-1;
			}
		}
		return ans;
	}

}
