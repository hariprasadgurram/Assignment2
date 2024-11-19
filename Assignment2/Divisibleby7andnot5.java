package Assignment2;

public class Divisibleby7andnot5 {
	public static void main(String[] args) {
		for(int i=1;i<=40;i++) {
			
			if(i%7==0 && i%5!=0) {
				System.out.print("," +i);
			}
		}
	}
	

}
