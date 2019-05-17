
public class Main
{
	public static void main(String[] args) {
		
		//usage of method 2
		String str = new String("abcde fghi");
		
		System.out.println(reverseWords(str.toCharArray()));

//		  //method1
//        String str = "HELLO WORLD";
//        String[] str_arr = str.split(" "); 
//        StringBuilder new_str = new StringBuilder();
//        
//        for(int i = str_arr.length-1; i>= 0 ; i-- ) {
//        	
//        	if(i<str_arr.length-1)
//        	{
//        		new_str.append(" ");
//        	}
//        	
//        	new_str.append(str_arr[i]);   
//        }
//        
//        System.out.println(new_str);
    
		
	}
	
	
//		//method2	
	public static char[] reverseWords(char[] s) {
	
		int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	            reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	    reverse(s, i, s.length-1);
	 
	    reverse(s, 0, s.length-1);
	    
	    return s;
	}
	 
	public static void reverse(char[] s, int i, int j){
	   
		System.out.print("before reverse, s is: ");
		System.out.println(s);

		while(i<j){
	        char temp = s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	    }
	    
	    System.out.print("after reverse, s is: ");
		System.out.println(s);

	}
	
	
	
}
