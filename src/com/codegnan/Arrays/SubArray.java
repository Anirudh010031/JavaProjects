package com.codegnan.Arrays;

public class SubArray {
//	public static int maxSub(int arr[],int k) {
//		int maxSum=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length-k;i++)
//		{
//			int sum=0;
//			for(int j=i;j<i+k;j++)
//			{
//				sum=sum+arr[j];
//			}
//			maxSum=Math.max(maxSum, sum);
//		}
//		return maxSum;
//	}	
//	public static void main(String[] args) {
//	 int arr[] = {2,1,5,1,3,2};
//	 System.out.println(SubArray.maxSub(arr,3));
//	 
//	}
//}

//	public static void main(String[] args) {
//		int arr[] = { 2,3,4,5,1,7,2};
//		int k=3;
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<=arr.length-k;i++) {
//			int sum=0;
//			for(int j=i;j<k+i;j++) {
//				sum+=arr[j];
//			}
//			max=Math.max(max,sum);
//		}
//		System.out.println(max);
//		
//		
//		
//	}
//}

/////// using sliding window method

	public static int maxSum(int nums[],int k) {
		if(nums.length<k) {
			return 0;
		}
		int windowSum=0;
		int maxSum=0;
		//intialise the window
		for(int i=0;i<k;i++)
		{
			windowSum=windowSum+nums[i];
		}
		maxSum=windowSum;
		for(int i=k;i<nums.length;i++) {
			windowSum=windowSum-nums[i-k]+nums[i];
			maxSum=Math.max(maxSum,windowSum);
		}
		return maxSum;
	}
public static void main(String[] args) {
	int nums[] = {2,5,1,2,3,2};
	System.out.println(SubArray.maxSum(nums,3));
	
}
}
	

	
	
