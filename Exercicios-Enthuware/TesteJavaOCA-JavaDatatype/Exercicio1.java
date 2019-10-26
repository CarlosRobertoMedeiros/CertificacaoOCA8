class ValidarTipo{
	void associarStringParaLong(){
		String mStr = "123";
		long l = new Long(mStr);
		System.out.println("Usando new Long(mStr): = "+l);
		
		long l1 = Long.parseLong(mStr);//Método Estático
		System.out.println("Usando Long.parseLong(mStr) = "+l1);
		
		long l2 = Long.valueOf(mStr);
		System.out.println("Usando Long.valueOf(mStr) = "+l2);
	}
}

public class Exercicio1{
	public static void main(String[]args){
		new ValidarTipo().associarStringParaLong();
	}
	
}