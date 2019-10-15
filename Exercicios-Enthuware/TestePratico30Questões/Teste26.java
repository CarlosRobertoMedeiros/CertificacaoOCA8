class Teste26{
	
	int x =5;
	int getX(){return x;}
	
	public static void main(String[] args){
		Teste26	tc = new Teste26();
		tc.looper();
		System.out.println(tc.x);
	}
	
	public void looper(){
		int x=0;
		while( (x=getX())!=0 ) {
			for (int m = 10; m>0;m--){
				x =m;
			}
		}
	}

}

/**
	Esse programa nunca termina
	Pois o for de dentro testa m>0 sendo que inicia com 10,
	e sempre aumenta. 
*/