
                    // Print A to Z Alphabet    
package Jitendra;
public class A_to_Z_print_Alphabet {
	public static void main(String[] args) {
	   // using for loop by using character
		for(char i='A'; i<='Z'; i++)
	    {
	    	System.out.print(i+" ");
	    }
		  System.out.println();
//	    using for loop by using ASCII value
	    for(int i=65; i<=90; i++)
	    {
	    	System.out.printf("%c",i);
	    	
	    }
	    System.out.println();
	    // using while loop
	    int j=65;
	    while(j<=90) {
	    	System.out.printf("%c",j," ");
	    }
	    // using do-while loop
	    System.out.println();
	    int k=65;
	    do {
	    	System.out.printf("%c",k," ");
	    	
	    }while(++k<=90);
	}

}
