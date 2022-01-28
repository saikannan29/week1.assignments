package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1=1;
		int input=5;
		for(int i=1;i<=input;i++)
		{
			int answer=value1*i;
			value1=answer;
			if(i==5) {
				System.out.println("factorial of 5 is " +answer);
			}
		}
	}
}


 