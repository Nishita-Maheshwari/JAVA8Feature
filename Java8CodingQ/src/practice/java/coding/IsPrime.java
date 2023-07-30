package practice.java.coding;

public class IsPrime {
	
	private static boolean isPrime(int number) {
		boolean isDivisible=false;
		
		for(int i=2;i<number;i++) {
			if(number %i==0) {
				isDivisible=true;
				break;
			}
		}
		
		return number>1 && !isDivisible;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(isPrime(7));	

	}



}
