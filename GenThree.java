/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	   int MIN = Integer.parseInt(args[0]);
	   int MAX = Integer.parseInt(args[1]);

	   for (int i = 0; i < 10; i++) {
        int a = (int) (Math.random() * MAX + MIN);
		int b = (int) (Math.random() * MAX + MIN);
		int c = (int) (Math.random() * MAX + MIN);
		    System.out.print(a);
		    System.out.print(b);
		    System.out.print(c);

	   }
           if (a<b) {
			 if (a<c){
			System.out.println( "The minimal generated number was a" );
			}
		}
              else {
                if (b<c){
			System.out.println( "The minimal generated number was b" );
				}
				  else {
					System.out.println( "The minimal generated number was c" );
				  }

			  }
		   
	}
}

	}
}
