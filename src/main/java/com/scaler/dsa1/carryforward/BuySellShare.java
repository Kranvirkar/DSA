package com.scaler.dsa1.carryforward;

public class BuySellShare {

    static int maxProfit(int price[], int n)
    {
        int profit = 0;

        for(int i = 1; i < n; i++)
        {
            if(price[i] > price[i - 1])
                profit += price[i] - price[i -1];
            System.out.println(profit);
        }

        return profit;
    }


    public static void main(String args[])
    {
        int arr[] = {1, 5, 3, 8, 12}, n = 5;

        System.out.println(maxProfit(arr, n));

    }

}
