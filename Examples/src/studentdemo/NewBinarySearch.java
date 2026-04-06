package studentdemo;

public class NewBinarySearch {
	//return indexes
	public static int[] searchRange(int nums[],int target) {
		int first=findBound(nums,target,true);
		int last = findBound(nums,target,false);
		return new int[] {first,last};
	}
	public static int findBound(int nums[],int target,boolean isFirst) {
		int left =0;
		int right= nums.length-1;
		int index=-1;
		while(left<=right) 
		{
			int mid=(left+right)/2;
			if(nums[mid]==target)
			{
				index=mid;
				if(isFirst) {
					right = mid-1;
				}
				else {
					left=mid+1;
				}
			}else if(nums[mid]>target)
			{
				right=mid-1;
				
			}else {
				left=mid+1;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		
	        int nums[] = {5, 7, 7, 8, 8, 10};
	        int target = 8;

	        int result[] = searchRange(nums, target);

	        System.out.println("First Index: " + result[0]);
	        System.out.println("Last Index: " + result[1]);
	    }
		
}
	
//	public static void main(String[] args) {
//		
//	
//	int arr[] = {5,7,7,8,8,10};
//	int target = 8 ;
//	int left =0;
//	int right =arr.length-1;
//	int mid = (left+right)/2 ;
//	while(left<=right) {
//		if(arr[mid]==target) {
//			System.out.println("first index:"+ mid);
//		
//			left = mid;
//			right--;
//			if(arr[left+1]==arr[right]) {
//				System.out.println("last index :" + right+1);
//				return;
//			}
//		}
//	}
