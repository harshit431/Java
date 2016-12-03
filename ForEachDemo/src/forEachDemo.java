//for each is basically used for iterating over the arrays
public class forEachDemo {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5}; //firstly forEach is used to iterate over arrays generally
		
		//for iterating create a variable of same type as of array
		
		for(int i:arr)
		{
			System.out.println("The value of I is"+i);//what this for loop will do is it will take one value at a time 
			//firstly it will take first value that is 1 and then it will automatically increment to other value stored in the array 
			//that is 2 so one by one all the values will be displayed
			
			//one disadvantage is that it will increment the refrence variable value of array by one only 
			
			//for having the display like 1,3,5 that is to move to array elements in alternate fashion we have to increment the refrence variable by 2 
			//which can be done only by simple for loop i.e
			
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("The value at refrence variable j is"+arr[j]);
			}
		}
		
		//One can also use foreach loop to iterate in 2-D array like
		
		int two[][]={
				{1,2},
				{3,4}
		};
		
		for(int onearray[]:two)
		{
			for(int k:onearray)//first onearray[]={1,2} then one by one goes to k then {3,4} goes to onearray
			{
				System.out.println("The value is"+k);
			}
		}
		

	}

}
