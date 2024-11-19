package Assignment2;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter grade");
		String s=sc.next();
		switch(s) {
		case("A"):
		System.out.println("Excellent");
		break;
		case("B"):
			System.out.println("Medium");
	    break;
		case("C"):
			System.out.println("Super");
		break;
		case("D"):
		    System.out.println("fail");
		
}
}
	}