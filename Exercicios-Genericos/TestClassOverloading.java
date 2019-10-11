class OverloadingTest{
	
	void m1(int x){
		System.out.println("m1 int");
	}
	
	void m1(double x){
		System.out.println("m1 double");
	}
	
	void m1(String x){
		System.out.println("m1 String");
	}
}

public class TestClassOverloading{
	
	public static void main(String[]args) throws Exception{
		OverloadingTest ot = new OverloadingTest();
		ot.m1(1.0);
	}
}