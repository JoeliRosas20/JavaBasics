import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Lets give this another go.");
		Demo2 d = new Demo2();
		/*
		d.daMethod();
		d.adder(5, 5);
		d.adder(10, 10);
		d.adder(14, 7);
		int sum = d.daAdder(5, 5);
		sum += d.daAdder(10, 10);
		sum += d.daAdder(14, 7);
		System.out.println(sum);
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		System.out.println("Please enter your age:");
		int age = sc.nextInt();
		System.out.println("You are "+age+" years old.");
		System.out.println(date);
		*/
		int result = d.addNumbers(10, 11, 2);
		System.out.println(result);
		d.printProductionNames("Selene", "Nanci", "Maya");
		
	}
	
	public void daMethod() {
		System.out.println("Woohoo, Day 2");
	}
	
	//Adding 2 numbers
	public void adder(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public int daAdder(int num1, int num2) {
		return num1 + num2;
	}
	
	public int addNumbers(int...num) {
		int sum = 0;
		for(int i: num) {
			sum = sum + i;
		}
		return sum;
	}
	
	public void printProductionNames(String...name) {
		for(String s: name) {
			System.out.println(s);
		}
	}

}
