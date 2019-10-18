/*Variáveis Estáticas / Variáveis de Classe
  Variável estática eu posso acessar através de qualquer escopo, 
	- dentro de um método local,
    - um constructor, 
	- dentro de um outro método, 
	- através da referência da classe Pessoa.id,
    - através da referência da instância p.id. 
	
  Todos referenciam o mesmo objeto id.*/
  
class Pessoa{
	static int id =10;//Atributo estático Não compila se trocar int por static
	
	static void m2(){
		System.out.println("Acessando Um Método Estático Através de outro método estático. Um método estático só acesso outros métodos instanciando os objetos internamente");
	}
}  
  
  
  
class EscopoDeVariaveisDeClasse{
	public static void main(String []args){
		Pessoa pessoa = new Pessoa();
		System.out.println("Foi Chamado um atributo Estático com Instância "+pessoa.id);// Eu posso acessar uma variável de classe ou Estática através de uma instância /
																						// Por ser uma Variável Estática, pode-se instanciar usar o new em n variáveis, porém todas vão apontar
																						// para o mesmo endereço de memória, ou seja, um único id.
																						
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Foi Chamado um atributo Estático com Instância "+pessoa2.id); //Iutra Instância que deve apontar o mesmo ponto
		
		if (pessoa.id == pessoa2.id)
			System.out.println("Iguais"); //Informa Iguais pois as 2 variáveis apontam para o mesmo endereço de memória
		
		
		System.out.println("Também pode acessar Diretamente pela classe.Atributo "+Pessoa.id); //// Acessado através da classe
		
		if (pessoa.id == Pessoa.id & pessoa2.id == Pessoa.id)
			System.out.println("Iguais"); //Informa Iguais pois as 2 variáveis apontam para o mesmo endereço de memória
		
		System.out.println("Um Método estático pode acessar variáveis estáticas");
		
		pessoa.m2();//Um método estático é acessado por uma classe estática
		
		
																						
																						
		
		
		
		
	}
	

}