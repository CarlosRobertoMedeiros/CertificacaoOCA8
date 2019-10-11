package exercicios;

class TestaMensagem{
	static boolean a;
	
	static void testarConversoesDeDados(){
		
		System.out.println("Testar Convers\u00e2o de Dados");		
		//boolean
		//byte => short => int => long(l) => float(f) => double 
		//char é uma variável numérica positiva
		
		char b= 0; //Esse valor é espaço em branco
		System.out.println(b==0);
		System.out.println(a);
	}
	
	
	
	
	public static void main(String[] args){
		//Teste de Impressão para Verificação do Pacote
		System.out.println("Apenas um Print");
		
		//Teste de Impressão dos Parâmetros de Entrada
		for(int i=0; i<args.length;i++){
			System.out.println((i+1)+"\u00b0 par\u00e2metro =>"+args[i]);
		};
		
		testarConversoesDeDados();
	}
}