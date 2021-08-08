package week1.day1assignment;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 370;
		int calculated = 0, remainder, original;
		original = num;
		while (original != 0) {
			remainder = original % 10;
			calculated = calculated + remainder * remainder * remainder;
			original /= 10;
						
		}
		if (calculated == original) {
			System.out.println(num + "is as armstrong number");}
		else {
			System.out.println(num + " is not an armstrong number");
		}	

	}

}
