class Teste28{
	public static void main(String[] args){
		Object a,b,c;
		
		a = new String("A");
		b = new String("B");
		c = a; // c = A
		a = b; // a = B
		System.out.println(" "+c);
		
	}
}