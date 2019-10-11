class Exercicio3Enthuware{
	
	private int myValue = 0;
	
	private void showOne(int myValue){
		myValue = myValue;
	}
	
	private void showTwo(int myValue){
		this.myValue = myValue;
	}
	
	public static void main(String []args){
		int x = 10;
		final int y = 10;
		
		Exercicio3Enthuware ct = new Exercicio3Enthuware();
		ct.showOne(100);
		System.out.println(ct.myValue);
		
		ct.showTwo(200);
		System.out.println(ct.myValue);
	}

}