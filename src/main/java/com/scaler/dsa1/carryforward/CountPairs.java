package com.scaler.dsa1.carryforward;

public class CountPairs {

	/*
	 * Given a char ch[N], calculate no. of pairs indices=i,j,
	 *  such that i<j &&
	 * ch[i]=='a'&& ch[j]=='g'
	 * 
	 * Brute force 
	 * TC -O(N*N) SC -O(1)
	 */
	public static int countPairs(char[] ch) {
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='a') {
				for (int j = i+1; j < ch.length; j++) {
					if (ch[j]=='g') {
					count+=1;	
					}
				}
			}
		}
		return count;
	}
	
	//optimised
	public static int countPairs1(char[] ch) {
		int pair=0, countA=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a') {countA++;}
			else if (ch[i]=='g') {
				pair+=countA;	
					}
				}
		return pair;
	}
	
	
	public static void main(String[] args) {
		char[] ch = {'a','g','d','f','g','a','g','g'};
		//System.out.println(countPairs(ch));
		System.out.println(countPairs1(ch));
	}

}
