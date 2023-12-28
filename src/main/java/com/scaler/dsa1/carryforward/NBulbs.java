package com.scaler.dsa1.carryforward;

public class NBulbs {

	/*
	 * Given N Bulbs & their initial state, each bulb has a switch associated to it 
	 * if we click on switch
	 * Note: every bulb on right including current bulb is flipped
	 * ON (1) & OFF(0)
	 * TC: O(N^2) SC: O(1)
	*/
	
	public static int minSwitch(int[] arr) {
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				arr[i]=1;
				count+=1;
				for (int j = i+1; j < arr.length; j++) {
					if (arr[j]==1) {
						arr[j]=0;
					}else {
						arr[j]=1;
					}
				}
			}
		}
		return count;		
	}
	
	//optimised
	public static int minSwitch1(int[] bulb) {
		int count =0;
		for (int i = 0; i < bulb.length; i++) {
			if (bulb[i]==count%2) {
				count+=1;
			}
		}
		return count;		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {0,1,1,0,1,0};
		int[] arr = {0,1,1,0,1,1,1,0,0}; 

		System.out.println(minSwitch1(arr1));
	}

}
