package Assignment2;

public class Char {
	public static void main(String[] args) {
		char[] c= {'p','r','a','s','a','d'};
		
		for(int i=0;i<=c.length-1;i++) {
			int count=1;
			for(int j=i+1;j<=c.length-1;j++) {
				if(c[i]==c[j]) {
					count++;
					
				}
				if(c[i+1]!=c[i]) {
					System.out.print(c[i]+":"+count+" ");
				}
			}
		}
		
				
	}

}
