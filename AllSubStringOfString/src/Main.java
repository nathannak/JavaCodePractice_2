
public class Main {

public static void main(String[] args) {

		allSubString( "","abc" );

	}

public static void allSubString(String prefix , String rest) {

		if( rest.length()==0 ) {
			System.out.println(prefix);
			return;		
		}

		allSubString( prefix+rest.charAt(0) , rest.substring(1) );
		allSubString( prefix , rest.substring(1) );

	}	
}
