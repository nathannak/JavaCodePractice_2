
public class Main {

	public static final int MAX_DIGITS = 10;
	
	public static void main(String[] args) {
	
		System.out.println(intToString(1234));
	}
	
	public static String intToString (int num) {

		int i =0;
		boolean isNeg = false;
		
		//create big enough buffer
		char[] temp = new char[MAX_DIGITS+1];
		
		if( num < 0 )
		{
				if( num == Integer.MIN_VALUE ) { return "-2147483648"; }
		
				num = -num;
				isNeg= true;
		}
		
		//fill buffer in reverse order
		do {
			
			temp[i++] = (char) ( (num%10) + '0' );
			
			num /= 10;
			
		} while( num != 0 );
		
		StringBuilder b = new StringBuilder();
		
		if(isNeg) {
			b.append('-');
		}
		
		//generate final string
		while(i>0) {
			b.append(temp[--i]);
		}
		
		return b.toString();
		
	}

}
