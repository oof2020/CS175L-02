/* Prints multiplication table in Java */
public class MultiplicationTable {
     
    public static void main(String[] args) {
       int tablesize = 10; 
   System.out.println(tablesize);
    }

	public static void MultiplicationTable(int tablesize) {
		for(int i = 1; i<=tablesize;i++ ) {
			
        	for(int j=1;j<=tablesize;j++) {
                System.out.format("%4d",i*j);
        	}
            System.out.println();
            }
        }
	}
    
} 
   