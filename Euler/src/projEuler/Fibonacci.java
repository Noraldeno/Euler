package projEuler;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		int temp = 0;
		int max = 4000000;
		int sum = 0;
		
		while(temp <= max){
			System.out.print(x + ", ");
			if (y % 2 == 0){
				sum += y;
			}
			temp = x + y;
			x = y;
			y = temp;
			
		}
		
		System.out.print("\n\nSum is: " + sum);
	}

}
