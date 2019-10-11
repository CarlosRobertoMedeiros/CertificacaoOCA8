class B{}
class B1 extends B {};
class B2 extends B {};

public class ExtendsTest{
	public static void main(String ...args){
		B b = new B();
		B1 b1 = new B1();
		B2 b2 = new B2();
		
		b = b1; //Sem problemas
		b2 = b;
		b1 = (B1) b;
		b2 = (B2) b1;
		b1 = (B) b1;

	}

}