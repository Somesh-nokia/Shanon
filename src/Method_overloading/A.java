package Method_overloading;

public class A {

public static void A1(int a , int b) {
		System.out.println(10+20);
		
}
		public static void A1(int a , int b,int c) {
			System.out.println(10+20+30);
		
	
	}
	public static void main(String[] args) {
		
		A1 (10,20);
		A1 (10,20,30);
}
	


}


