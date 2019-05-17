
package maxProfitNewApproach;

import java.util.Arrays;

public class Main {

public static void main(String[] args) 
{		
	
	int[] arr = {600,450,370,500,460,200,300};
	int[] new_arr = new int[arr.length];
	int max_profit=0;

	//find current max to init
	System.arraycopy(arr,0,new_arr,0,new_arr.length);
	Arrays.sort(new_arr); 
	int current_max = new_arr[new_arr.length-1];


	for(int i=0;i < arr.length;i++) {
		
		if( arr[i] == current_max )
		{
			current_max= findnewmax(Arrays.copyOfRange(arr,i,arr.length),current_max);
			continue;
		}

		if( current_max-arr[i] > max_profit ) 
		{
			max_profit = current_max-arr[i];
		}
		
	}
	
	System.out.println(max_profit);

}

	
static int findnewmax(int[] new_arr,int current_max) 
{	
	
	//this is n 
	int new_max =0;
	for(int i =0; i < new_arr.length; i++) {
		if( new_arr[i] > new_max && new_arr[i] != current_max ) {
			new_max = new_arr[i];
		}
	}
	
	return new_max;
	
//	//this is nlogn, trying to reduce to n using cod above -> in this case current_max is uselss
//	Arrays.sort(new_arr);
//	new_arr[new_arr.length-1]=-1;
//	Arrays.sort(new_arr);
//	return new_arr[new_arr.length-1];

}


}
