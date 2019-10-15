class Teste30{
	public static void main(String[] args) throws Exception{
		boolean flag = true;
		switch(flag){
			case true: System.out.println("true");
				 default: System.out.println("false");
		}
	
	}
}

/*
Não compila, o switch não permite utilizar variáveis do tipo boolean.
Erro de compilação
A boolean cannot be used for a switch statement. It needs an integral type, an enum, or a String
**/