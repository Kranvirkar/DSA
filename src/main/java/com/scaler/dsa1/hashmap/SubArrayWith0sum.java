package com.scaler.dsa1.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWith0sum {

	/*
	 * Given an array of integers A, find and return whether the given array
	 * contains a non-empty subarray with a sum equal to 0.
	 * 
	 * If the given array contains a sub-array with sum zero return 1, else return
	 * 0.
	 * 
	 * Input 1:A = [1, 2, 3, 4, 5]
	   Input 2:A = [4, -1, 1]
	Example Output
	Output 1: 0
	Output 2: 1

	 * 
	 */
	
	public static int solve(int[] A) {
	       int n = A.length;
	       int ans =0;
	      long psum[] = new long[n];
	      //claculate prefix sum
	      psum[0] = A[0];
	      for(int i=1;i<psum.length;i++){
	          psum[i] = psum[i-1]+A[i];
	      }
	      Map<Long, Integer> hm = new HashMap<>();
	      for(int i=0;i<psum.length;i++){
	          if(psum[i]==0){
	              ans = 1;
	          }
	          if(hm.containsKey(psum[i])){
	              ans = 1;
	          }else{
	              hm.put(psum[i], i);
	          }
	      }
	    return ans;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 5};
		System.out.println(solve(A));
	}

}
