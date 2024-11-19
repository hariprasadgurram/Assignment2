package Assignment2;

public class Factorial {
public static void main(String[] args) {
	int n=8;
	int factorial=1;
	for(int i=8;i>1;i--) {
		factorial=factorial*i;
	}
	System.out.println(factorial);
}
}
