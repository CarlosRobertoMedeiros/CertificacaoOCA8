public class Video1Exercicio1{

	public void m1(){
		int x = 10; //Variável Local de Método
		
		//Caso de Bloco IF Não existe a variável fora do bloco
		if (x >= 10){
			int y = 50;
			System.out.println("Variável Local Y dentro do bloco IF"+y); 	
		}
		
		//Caso de Bloco for Não existe a variável fora do bloco
		for (int i=0,j=0;i<=10;i++) j++; //Nesse caso as informações dão erro.
	
		System.out.println("Variável dentro do bloco for i "+i); 
		System.out.println("Variável dentro do bloco for j "+j); 
		
		System.out.println("Variável Local dentro do Método"+x); 
	}
	
	public void m2(String nome){ //O parâmetro nome só está disponível dentro de m2
		System.out.println("Variável passada por Parâmetro dentro do método"); 
	}
	
	
	public static void main(String[]args){
		Video1Exercicio1 video1Exercicio1 = new Video1Exercicio1();
		video1Exercicio1.m1();
		
		
	}
}

C:\eclipse\workspace-trunk\sge-entidade\sge-fabrica-entidade\src\main\was-resources\META-INF\persistence.xml