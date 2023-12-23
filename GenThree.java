/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	   int MIN = Integer.parseInt(args[0]);
	   int MAX = Integer.parseInt(args[1]);

	       int a, b, c;
	   for (int i = 0; i < 10; i++) {
         a = (int) (Math.random() * (MAX - MIN) + MIN);
		 b = (int) (Math.random() * (MAX - MIN) + MIN);
		 c = (int) (Math.random() * (MAX - MIN) + MIN);

		 }
		   
	   }
                int min ;

	     if (a > b) {
	             if (a > c) {
	                min = a;
	              }  
           } 
	         else {
	          if (b > c) {
	            min = b;
	         } 
	         else {
	            min = c;
	           }
	   }
	            System.out.print(a);
		    System.out.print(b);
		    System.out.print(c);
			System.out.println( "The minimal generated number was " + min );
	}



