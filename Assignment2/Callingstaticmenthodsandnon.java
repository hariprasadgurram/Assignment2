package Assignment2;

public class Callingstaticmenthodsandnon {
	public static void main(String[] args) {
		Staticandnonstatic sn=new Staticandnonstatic();
		sn.a=10;
		sn.b=20;
		Staticandnonstatic.method1();
		sn.method();
		System.out.println(sn.a);
	}

}
