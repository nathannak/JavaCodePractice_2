
package str2int;

public class Main {

	public static void main(String[] args) 
	{
		
		System.out.println(str2int("-1000"));
		System.out.println(str2int("3000"));
		
	}
	
	public static int str2int (String str) {
		
		//variables
		boolean number_neg = false;
		
		int mult=1;
		int sum=0;
		
		//main logic
		for(int i = str.length()-1; i >= 0 ; i--) {
			
			//wait until we reach to index 0
			if ( str.charAt(i)=='-' ) {
				number_neg = true;
				continue;
			}
			
			int curr_char_in_int = str.charAt(i) - '0';
			sum =  curr_char_in_int*mult;
			mult *= 10;
			
		}
		
		if(number_neg) {sum *= -1;}
		
		return sum;
	}
	
}
