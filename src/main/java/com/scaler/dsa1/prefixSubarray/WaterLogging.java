 package com.scaler.dsa1.prefixSubarray;

public class WaterLogging {

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
	public static void main(String[] args) {
		int[] A = {4,2,5,7,4,2,3,6,8,2,3};
		System.out.println(waterLogging(A));

	}

}
