import java.util.*;

public class RemoveDuplicateInArray {

	public static int [] uniqueArray(int arr[]) 
	{
		Arrays.sort(arr);
		int nw=1;
		int count=1;
		
		//count of unique value
		for(int i=0;i<arr.length-1;i++)
		{
			if (arr[i]!=arr[i+1])
			{
				 count+=1;
			}
		}

		int unique[] = new int[count];
		unique[0]=arr[0];
		
		// For storing unique elements
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(nw<count) 
			{
				if(arr[i]!=arr[i+1])
				{	

					unique[nw]=arr[i+1];	
					nw+=1;
				}
			}
		}
		
		return unique;
	}
	
	public static void main(String[] args) {
		int input[]= {5,77,7,8,9,12,77,22,5};
		
		int newArray[] = RemoveDuplicateInArray.uniqueArray(input);
		
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
	}

}


/*************
Output :
5
7
8
9
12
22
77
**************/