package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray 

{

	public static void main(String[] args) 
	
	{
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int data = arr.length;
		System.out.println("Sorted Array: ");
		
		for (int i=0; i<data; i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0; i<data; i++)
		{
			if(arr[i]!=(i+1))
			{
				System.out.println("Missing Element is: " +(i+1));
				break;
			}
			
		}

	}

}
