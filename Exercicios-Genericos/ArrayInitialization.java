class ArrayInitialization{
	public static void main (String...args){
		String[] sa = new String[1] {"aaa"}; //Da Erro ou passa tamanho ou não passa
		String[] sb = new String[]{"aaa"}; //Funciona devido o valor ser inicializado
		String[] sc = new String[1]; sc[0]="aaa";
		String[] sd = { new String ("aaa")};
		String[] se = { "aaa"};
	}

}