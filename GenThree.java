/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	  int MIN = Integer.parseInt(args[0]);
	   int MAX = Integer.parseInt(args[1]);

	        int a, b, c;
			double r = Math.random();
			
         a = (int) ( r * (MAX - MIN) + MIN);
		 b = (int) ( r * (MAX - MIN) + MIN);
		 c = (int) ( r * (MAX - MIN) + MIN);

		 
	        System.out.print(a);
		    System.out.print(b);
		    System.out.print(c);
		 

	     if (a < b) {
	             if (a < c) {
	                System.out.println( "The minimal generated number was " + a );
	              }  
           } 
	         else {
	          if (b < c) {
	            System.out.println( "The minimal generated number was " + b );
	         } 
	         else {
	            System.out.println( "The minimal generated number was " + c );
	           }
	   }
	        
			
	}

}
	 

