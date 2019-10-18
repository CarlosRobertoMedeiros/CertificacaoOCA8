// Variável de Instância, objeto, atributo ou membro	
// Variável declarada dentro da classe
// Ela pode ser acessada em qualquer lugar dentro do meu objeto
class EscopoDeVariaveisDeInstancia1{
	
	String nome="Roberto"; ///Variável de Instância, objeto, atributo ou membro	
	
	public EscopoDeVariaveisDeInstancia1(){
		System.out.println("Nome =>"+nome+ " Pode ser chamado no Construtor");
	}
	
	public void m1(){
		System.out.println("Nome =>"+nome+ " Pode ser chamado em Métodos");
	}
		
	public static void main(String []args){
		EscopoDeVariaveisDeInstancia1 escopoDeVariaveisDeInstancia1 = new EscopoDeVariaveisDeInstancia1();//Imprime resultado no construtor
		escopoDeVariaveisDeInstancia1.m1(); //Imprime resultado no método
		
		//Pode Ser acessada aqui pela instância
		System.out.println("Acessado pela Instância "+escopoDeVariaveisDeInstancia1.nome);
	}
}