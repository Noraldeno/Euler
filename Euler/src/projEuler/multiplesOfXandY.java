/**
 * 
 */
package projEuler;

import java.util.Scanner;

/**
 * @author norald.alejo
 *
 */
public class multiplesOfXandY {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		System.out.print("Enter the Max: ");
		int max = sc.nextInt();
		System.out.print("\nEnter the first multiple: ");
		int multA = sc.nextInt();
		System.out.print("\nEnter the second multiple: ");
		int multB = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < max; i++){
			if (i % multA == 0 || i % multB == 0){
				sum += i;
			}
		}
		
		System.out.printf("Sum of multiples of %d and %d: %d", multA, multB ,sum);
	}

	

}
