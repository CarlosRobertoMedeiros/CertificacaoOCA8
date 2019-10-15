class Teste7{
	public static void main(String[] args){
		byte b = -128; //Acho que passou
		int i = b;
		b = (byte) i;
		System.out.println(i+" "+b);
	}
}