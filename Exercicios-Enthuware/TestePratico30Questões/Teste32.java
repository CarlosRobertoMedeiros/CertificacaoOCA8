class Teste32{
	public static void main(String[] args) throws Exception{ 
		try{
			amethod();
			System.out.println("try ");
		}
		catch(Exception e){
			System.out.println("catch");
			
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("out");
	}
	
	public static void amethod(){ }
}

/**
	Imprime o try finally out
*/