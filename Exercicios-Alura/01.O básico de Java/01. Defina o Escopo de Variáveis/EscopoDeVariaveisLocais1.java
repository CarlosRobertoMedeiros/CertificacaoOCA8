class VariaveisLocais{
	void m1(){
		//Podemos Declarar as Variáveis Locais Dentro de Um Método
		//Variáveis que funcionam internamente no método
		int nota = 10;
		String nome = "Carlos";
		System.out.println("Valor da nota => "+ nota + "\nValor do Nome => "+nome);
	}
}

class EscopoDeVariaveisLocais1{
	public static void main(String[] args){
		VariaveisLocais variaveisLocais = new VariaveisLocais();
		variaveisLocais.m1(); //Podemos Declarar as Variáveis Locais Dentro de Um Método
							  // Aqui não se chama nome, nem nota
	}
	
}