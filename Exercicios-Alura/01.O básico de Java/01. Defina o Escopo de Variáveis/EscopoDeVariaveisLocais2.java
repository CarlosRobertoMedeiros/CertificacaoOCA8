class VariaveisNoConstrutor{
	VariaveisNoConstrutor(){
		//Podemos Declarar as Variáveis Locais Dentro do Construtor
		//Variáveis que funcionam internamente no construtor
		int nota = 10;
		String nome = "Carlos";
		System.out.println("Valor da nota => "+ nota + "\nValor do Nome => "+nome);
	}
}

class EscopoDeVariaveisLocais2{
	public static void main(String []args){
		new VariaveisNoConstrutor(); //Podemos Declarar as Variáveis Locais Dentro do Construtor
									 // Aqui não se chama nome, nem nota
	}
}