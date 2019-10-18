class VariaveisNoBloco{
	
	public void testaBloco(){
		int x =5;
		//As variáveis Internas declaradas dentro do If só funcionam dentro do bloco
		if (x>4){
			int nota = 2;
			String nome = "Carlos Roberto";
			System.out.println("Valor da nota => "+ nota + "\nValor do Nome => "+nome);
		}
		//Essa linha abaixo não funciona devido a funcionalidade está sendo executada apenas no if
		//System.out.println("Valor da nota => "+ nota + "\nValor do Nome => "+nome);
		
		//Testando o Bloco For
		for(int i=0;i<3;i++)
			System.out.println("Valor de i => "+ i); //Imprime aqui pois a variável i está dentro do escopo do laço
		
		//System.out.println("Valor de i => "+ i); //Aqui não imprime poi so i saiu do escopo do bloco
		
			
		
	}
}

class EscopoDeVariaveisLocais3{
	public static void main(String []args){
		new VariaveisNoBloco().testaBloco();
	}
}