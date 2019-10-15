class Teste15{

	private int myValue = 0;
	
	public void showOne(int myValue){
		myValue = myValue;
	}
	
	public void showTwo(int myValue){
		this.myValue = myValue;
	}
	
	public static void main(String []args){
		Teste15 tst = new Teste15();
		tst.showTwo(200);
		System.out.println(tst.myValue);
		tst.showOne(100);
		System.out.println(tst.myValue);
	}
}

/**
	Resposta Imprime 200 em seguida 200
	no Método showOne o myValue não é referenciado ao this

*/