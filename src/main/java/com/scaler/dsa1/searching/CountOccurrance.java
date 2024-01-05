package com.scaler.dsa1.searching;

public class CountOccurrance {

	public static void main(String[] args) {
		int[] A = {-5,-5,-3,-3,0,0,1,1,5,5,5,5,8,10,10,15};
		System.out.println(solve(A,-5));
	}

	private static int solve(int[] a, int i) {
		int first=first(a, i);
		if (first==-1) {
			return 0;
		}else {
			return (last(a, i)-first+1);
		}
	}

	private static int first(int[] a, int k) {
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
	private static int last(int[] a, int k) {
		int ans=-1,low=0,high=a.length-1;
		while (low<=high) {
			int m=(low+high)/2;
			if (a[m]>k) {
				high=m-1;
			} else if (a[m]<k) {
				low=m+1;
			}else {
				ans=m;
				low=m+1;
			}
		}
		return ans;
	}

}
