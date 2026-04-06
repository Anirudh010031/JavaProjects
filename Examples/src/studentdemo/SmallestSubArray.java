package studentdemo;

public class SmallestSubArray {
//	public static void main(String[] args) {
//		int arr[]= {2,3,1,2,2,2,3,5};
//		int target = 7;
//		int sizeSub=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;int sizeWindow=0;
//			for(int j=i;j<arr.length;j++) {
//				sum +=arr[j];
//				sizeWindow++;
//				if(sum>=target) {
//					break;
//				
//				}
//			}
//			if(sum==target) {
//				sizeSub=Integer.min(sizeSub,sizeWindow);
//				
//			}
//		
//		}
//		System.out.println(sizeSub);
//	======================================================================================================================
// public static int minLength(int target , int nums[]) {
//	    int minLen =Integer.MAX_VALUE;
//	    for(int i=0;i<nums.length;i++) {
//	    	int sum=0;
//	    	for(int j=i;j<nums.length;j++) {
//	    		sum=sum+nums[j];
//	    		if(sum>=target) {
//	    			minLen=Math.min(minLen, j-i+1);
//	    			break;
//	    		}
//	    	}
//	    }
//	    return minLen==Integer.MAX_VALUE?0:minLen;
// }
// public static void main(String[] args) {
//	int nums[] = {2,3,1,2,2,2,3,5};
//	System.out.println(SmallestSubArray.minLength(7, nums));
//}========================================================================================================================

	    public static void main(String[] args) {

	        int arr[] = {-2,3,1,2,2,-2,2,1};
	        int target = 15;

	        int minLength = Integer.MAX_VALUE;

	        for(int i = 0; i < arr.length; i++) {

	            int sum = 0;

	            for(int j = i; j < arr.length; j++) {

	                sum = sum + arr[j];

	                if(sum == target) {

	                    int length = j - i + 1;

	                    if(length < minLength) {
	                        minLength = length;
	                    }
	                }
	            }
	            System.out.println(target);
	        }

	        if(minLength == Integer.MAX_VALUE)
	            System.out.println("No subarray found");
	        else
	            System.out.println("Smallest subarray size: " + minLength);
	    }
	}
