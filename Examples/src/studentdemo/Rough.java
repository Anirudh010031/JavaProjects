package studentdemo;

public class Rough {

	    public static void main(String[] args) {

	        int arr[] = {5,7,7,8,8,8,8,10};
	        int target = 8;

	        int left = 0;
	        int right = arr.length - 1;
	        int first = -1;
	        int last = -1;

	        // Find first index
	        while(left <= right) {
	            int mid = (left + right) / 2;

	            if(arr[mid] == target) {
	                first = mid;
	                right = mid - 1;
	            }
	            else if(arr[mid] < target) {
	                left = mid + 1;
	            }
	            else {
	                right = mid - 1;
	            }
	        }

	        left = 0;
	        right = arr.length - 1;

	        // Find last index
	        while(left <= right) {
	            int mid = (left + right) / 2;

	            if(arr[mid] == target) {
	                last = mid;
	                left = mid + 1;
	            }
	            else if(arr[mid] < target) {
	                left = mid + 1;
	            }
	            else {
	                right = mid - 1;
	            }
	        }

	        System.out.println("First index: " + first);
	        System.out.println("Last index: " + last);
	    }
	}
