class FuncoesdoArray{
	private static String nomezao;
	private static boolean valor;
	private static double valor1;
	
	public static void main(String args[]){
		//String nomezinho;

		//É obrigado inicializar variável de qualquer tipo dentro do método 
		//System.out.println(nomezinho);
		//Valor Default de String e null
		System.out.println("Nomezao =>"+nomezao);
		
		//Valor Default de boolean e false
		System.out.println(valor);
	
		//Valor Default de Double 0.0
		System.out.println(valor1);
		
		//Criação de Arrays Primitivos
		String[] nomes = new String[10];
			
		
		//Consultar o valor inicial de cada posição do array
		//Valor Default Para o bojeto String é nulo 
		for(String nome:nomes){
			System.out.println(nome);
		}
		
		
		//Criação de Array numérico
		int[] numeros = new int[10];
		//Valor Default Para tipos numéricos é 0
		for(int numero:numeros){
			System.out.println(numero);	
		}

	}


}