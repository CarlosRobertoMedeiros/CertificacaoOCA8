class OverloadedMethod{
	
	/**
		Olhar Esse Exercício, Está dando erro
		
		Para o método ser sobrecarregado
		Deve-se ter o mesmo nome, com parâmetros diferentes
		O retorno dos parâmetros também podem ser diferentes
	*/
	//Método Padrão
	public int setVar(int a, int b, float c){
		return b;
	}
	
	public int setVar(int a){
		return a;
	}
	
	public float setVar(int a, float b){
		return b;
	}
	
	
	
	
}
class Teste6{
	public static void main(String[]args){
		
		OverloadedMethod om = new OverloadedMethod();
		System.out.println(om.setVar(1,2,3.5)); //Sempre chama do mais específico para o menos específico 
		System.out.println(om.setVar(3));
		System.out.println(om.setVar(3,2.5));
		
		
	
	}

}