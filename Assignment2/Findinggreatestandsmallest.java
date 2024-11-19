package Assignment2;

public class Findinggreatestandsmallest {
public static void main(String[] args) {
	int a=37;
	int b=26;
	int c=43;
	if(a>b && a>c) {
		System.out.println(a+" is greatest");
	}
	else if(b>a && b>c) {
		System.out.println(b+"is greater");
	}
	else {
		System.out.println(c+" is greater");
	}
   if(a<b && a<c) {
	   System.out.println("a is smaller");
	   
   }
   else if(c<a && c<b) {
	   System.out.println("c is smaller");
   }
   else {
	   System.out.println(b+ " is smaller");
   }
}
}
