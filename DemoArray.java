import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int marks[] = {87, 65, 98, 70, 65};
		System.out.println("Length:"+marks.length);
		for(int i = 0; i < 2; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("Printing all the marks:");
		for(int i:marks) {
			System.out.println(i);
		}
		int nums[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Please enter 5 numbers:");
		for(int i = 0; i < nums.length;i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		System.out.println("The sum is:"+sum);
	}

}
