class Teste33{
	
	private int myValue =0;
	
	public void showOne(int myValue){
		myValue	= myValue;
		System.out.println(this.myValue);
	}
	
	public void showTwo(int myValue){
		this.myValue = myValue;
		System.out.println(this.myValue);
	}
	
	public static void main(String[] args){
		Teste33	ct = new Teste33();
		ct.showOne(100);
		ct.showTwo(200);
	}
}

/*
Imprime 0 em seguida 200
**/