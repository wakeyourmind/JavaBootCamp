	/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
		while(i<100){
			System.out.println(i);
			i=i+2;			
		}
	
		 
		// 1
		int j = 0;
		while(j<100) {
			if(j%2 != 0) 
			System.out.println(j);
			j++;
		}

		// 2
				int k = 1;
				while(k<100) {
					System.out.println(k);
					k=k+2;			
				}
	}

}
