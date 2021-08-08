package week1.day1assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 24;
		boolean flag = false;
		for (int i = 1; i < 8; i++) {
			if ( a % i == 0) {
				flag= true;
				break;
			}
		}
		if (!flag) {
			System.out.println(a + " is a prime number");
		}
		else {
			System.out.println(a + "is not a prime number");
		}

	}

}
