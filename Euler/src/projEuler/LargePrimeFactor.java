package projEuler;

public class LargePrimeFactor {
	
	public static boolean isPrime(int n){
		if (n % 2 == 0){
			return false;
		}
		for (int i = 3; i*i <= n; i+= 2){
			if (n%i == 0)
				return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		int i = 2;
		int num = 13195;
		int temp = num;
		
		while(!isPrime(temp)){
			if (isPrime(i) && temp % i == 0){
				temp /= i;
				System.out.print(i + ",");
			}
			i++;
		}
		
		System.out.print("\n\nThe Largest Prime: " + temp);
		
		
	}
}
