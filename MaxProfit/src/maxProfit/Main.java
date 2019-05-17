package maxProfit;

import java.util.Arrays;

public class Main {
	
	static int max_profit;
	static boolean if_ret=false;

	public static void main(String[] args) 
	{	
		int[] arr = {240,300,230,210,300};
		int original_size = arr.length;
		System.out.println(findMaxProfit(arr,max_profit,original_size,0));
			
	}
	
static int findMaxProfit(int[] arr, int max_profit, int original_size, int index)
	{
		
		if(original_size-1 <= index  ) {
			if_ret=true;
		}
		
		if(!if_ret)
		{
		int[] newArray = new int[original_size-index];
		System.arraycopy(arr,index,newArray,0,newArray.length);
		
		Arrays.sort(newArray);
		
		int max_profit_temp = newArray[newArray.length-1]-newArray[0];
		
		if(max_profit <= max_profit_temp) {
			max_profit = max_profit_temp;
		}
		
		findMaxProfit(arr,max_profit,original_size,index+1);
		}
		
		return max_profit;
		
	}


}
