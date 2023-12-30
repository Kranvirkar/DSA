package com.scaler.dsa1.recursion;

public class FindFibonacci2 {

	/*
	 * The Fibonacci numbers are the numbers in the following integer sequence. 0,
	 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. In mathematical terms, the
	 * sequence Fn of Fibonacci numbers is defined by the recurrence relation: Fn =
	 * Fn-1 + Fn-2 Given a number A, find and return the Ath Fibonacci Number using
	 * recursion. Given that F0 = 0 and F1 = 1.
	 * 
	 * Input 1: A = 2 Input 2: A = 9 Example Output Output 1: 1 Output 2: 34
	 * 
	 * 
	 */
	
	
	public static int findAthFibonacci(int A) {
        if(A==1 || A==0){
            return A;
        }
        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
	public static void main(String[] args) {
		System.out.println(findAthFibonacci(9));;

	}

}
