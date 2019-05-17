
package subSetSumDP;

public class Main {
	
	private static boolean usingDP(int[] a, int sum) {
	    // using boolean matrix for DP
	    boolean dp[][] = new boolean[a.length+1][sum+1];  // +1 in row and column


	    // if the length of the array is variable (and sum is 0) then fill TRUE, since the SUM=0 
	    for(int row=0;row<dp.length;row++){
	        dp[row][0] = true;    // NOTE: dp[length=VARIABLE][sum=0], thus we satisfy the condition where length is VARIABLE
	                              // and the SUM=0
	    }

	    // if the SUM is variable and length is 0 then FALSE, since (sum=variable && length=0)
	    for(int column=1;column<dp[0].length;column++){
	        dp[0][column] = false;  // NOTE: dp[length=0][sum=VARIABLE], thus we satisfy the condition where 
	                                // (length=0 && sum=variable)
	    }

	    for(int i=1;i<dp.length;i++){
	        for(int j=1;j<dp[0].length;j++){


	            /* Check if sum can be obtained by any of the following
	              (a) including the last element
	              (b) excluding the last element   */


	            // VERY VERY IMP: This is same as "excluding the last element" which is represented in DP 
	            dp[i][j] = dp[i-1][j]; // the current position[i][j] would be same as previous position.
	                                   // the previous position means that SUM is ACHIEVED OR NOT-ACHIEVED
	                                   // int the previous position then it will ofcourse be ACHIEVED or NOT-ACHIEVED
	                                   // in the current position.


	            // VERY VERY IMP: This is same as "including the last element" which is represented in DP 
	            // if the column[ sum is represented in column of the matrix i.e this sum exist] > = sum-a[last_index]
	            // then decrease the sum
	            if(j>=a[i-1])   // i.e sum >= array[last index element]. If it is true then include this last element by
	                            // deducting it from the total sum
	                dp[i][j] = dp[i][j] || dp[i-1][j-a[i-1]];  // VERY VERY IMP NOTE: Here dp[i][j] on R.H.S represent
	                            // dp[i-1][j] which we have assigned in the previous step

	        }
	    }
	    
		System.out.print("");
	    return dp[a.length][sum];
	
	}

public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1};
		System.out.println("\nFrom DP: " + usingDP(A,7) );
		
	}

}