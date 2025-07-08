 package com.scaler.dsa1.prefixSubarray;

public class WaterLogging {

   // Time:O(n), space Time:O(n)
    public static int waterLogging(int[] A) {
		int N=A.length;
		int[] prefixMax=prefixMax(A);
		int[] suffixMax=suffixMax(A);
		int ans=0;
		for (int i = 0; i < N; i++) {
			int l=prefixMax[i], r=suffixMax[i];
			int level =Math.min(l, r);
			int water = level-A[i];
			ans+=water;
		}
		return ans;
	}

    // Time:O(n), space Time:O(n)
    public int trap(int[] height) {
        int n=height.length;
        int[] leftMax=new int[n];
        int[] RightMax=new int[n];

        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(RightMax[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            water+=Math.max(0,Math.min(leftMax[i],RightMax[i])-height[i]);
        }
        return water;
    }
	
	public static int[] prefixMax(int[] A) {
        int N= A.length;
        int[] result =new int[N];
        result[0]=A[0];
        int max=A[0];
        for(int i=1;i<N;i++){
            if(max<A[i]){
               max=A[i];
            }
            result[i]=max;
        }
        return result;
    }
	
	public static int[] suffixMax(int[] A) {
        int N= A.length;
        int[] result =new int[N];
        result[N-1]=A[N-1];
        int max=A[N-1];
        for(int i=N-2;i>=0;i--){
            if(max<A[i]){
               max=A[i];
            }
            result[i]=max;
        }
        return result;
    }

    //Optimised Two Pointer Time:O(n), space Time:O(1)
    public static int trappingWater(int height[]) {
        if (height == null || height.length < 3) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }
	public static void main(String[] args) {
		int[] A = {4,2,5,7,4,2,3,6,8,2,3};
		System.out.println(waterLogging(A));
        System.out.println(trappingWater(A));

	}

}
