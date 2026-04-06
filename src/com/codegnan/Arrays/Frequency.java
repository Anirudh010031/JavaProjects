package com.codegnan.Arrays;

public class Frequency {
	public static void findFrequency(int arr[]) {
		 if(arr==null||arr.length==0) {
			 System.out.println("array is invalid");
			 return;
		 }
		 //creating boolean array initially all va f
		 boolean visited[]=new boolean[arr.length];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(visited[i]) {
				 continue;//skip the element
			 }
			 int count=1;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j])
				 {
					 count++;
					 visited[j]=true;
				 }
				 
			 }
			 System.out.println(arr[i]+"---->"+count);
			
				
			 }
			
		 }

	public static void main(String[] args) {
		 int arr[] = {1,2,3,1,2,3,1};
		 Frequency.findFrequency(arr);
		 
	}
}
