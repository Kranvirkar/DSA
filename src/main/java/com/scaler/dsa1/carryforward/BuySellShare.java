package com.scaler.dsa1.carryforward;

public class BuySellShare {

	public static int maxProfit(final int[] A) {
        int profit = 0;
        if (A.length <= 1) return 0;
        int minCost = A[0];
        for (int i=1; i<A.length; i++) {
            if (minCost > A[i]) minCost = A[i];
            if (profit < A[i] - minCost) {
                profit = A[i] - minCost;
            }
        }
        return profit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
