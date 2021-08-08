package week1.day1assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range = 8 & firstNum = 0, secNum = 1 in the series)
		int range = 8;
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		// Iterate from 1 to the range
		// Print first number
		System.out.println("FirstNumber is" + firstNum);
		
			for (int i = 0; i < range; i++) {
				
		
			thirdNum = firstNum + secondNum;
			System.out.println("" + thirdNum);
			firstNum = secondNum;
			secondNum = thirdNum;
			
			}
		

	}

}
