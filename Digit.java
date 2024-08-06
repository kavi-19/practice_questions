import java.util.Scanner;

public class Digit {
  public static void main(String[] args) {
		int num;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits:");
		num=sc.nextInt();
		
		while(num>0) {
		sum=sum+num%10;  //num%10-gives the last digit of a num
		num=num/10;      // num/10-eliminates the last digit
			
		}
		System.out.println("Sum of the digit is:"+sum);
	}
  
  
}
