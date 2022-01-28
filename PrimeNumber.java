package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int number = 6;
		boolean status = false;
		for (int i = 2; i < number; i++) {
			if ((number % i) == 0) {
				status = true;
				break;
			}
		}
		if (status == true) {
			System.out.println(number + " is not a prime number");
		} else {
			System.out.println(number + " is a prime number");
		}
	}
}
