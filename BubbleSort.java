import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum = 0;
		boolean swap;
		
		System.out.println("Before the bubble sort: " + Arrays.toString(myNums));
		//Loop once for each pass, where passes is one less than the number of items.
		for(passes = 0; passes < myNums.length -1; passes++)
		{
			swap = false;
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(comparisons = 0; comparisons < myNums.length -passes -1; comparisons++)
				//If they are out of order, swap the values
				if(myNums[comparisons] > myNums[comparisons + 1])
				{
					tempNum = myNums[comparisons];
					myNums[comparisons] = myNums[comparisons+1];
					myNums[comparisons+1] = tempNum;
					swap = true;
				}
				
			//End Loop for comparisons
			if(!swap)
			{
				break;
			}
			//The next pass will use one less comparison
		}
		//End Loop for passes
		System.out.println("After the bubble sort: " + Arrays.toString(myNums));


  }
}
