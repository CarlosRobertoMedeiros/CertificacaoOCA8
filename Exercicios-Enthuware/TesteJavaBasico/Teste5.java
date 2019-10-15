class Teste5{
	public static void main(String[]args){
		Object a,b,c; //Para objeto não precisa inicializar a variavel
		
		a = new String("A"); //A
		b = new String("B"); //B
		
		c = a;			// jogo a referencia de a em C  //A
		a = b;          //jogo a referencia de b em A //B
		System.out.println(""+c); //A

	}
}