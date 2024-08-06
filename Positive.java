import java.util.Scanner;


public class Positive {
  public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		count = sc.nextInt();
		int num,sum=0;
		for(int i=0;i<count;i++) {
			System.out.println("Enter:");
			num = sc.nextInt();
			sum = sum+num;
		}
			System.out.println("sum of positive number:"+sum);
			
		
	}
}

    
