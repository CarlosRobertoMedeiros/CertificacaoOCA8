class A{
	public A(){}
	public A(int i){System.out.println(i);}
}
class Teste4{
	static A s1 = new A(1); //1
	A a = new A(2); 
	
	public static void main(String[] args){
		Teste4 teste4 = new Teste4();
		A a = new A(3);
	}
	
	static A s2 = new A(4);
}

//Rever o exercício