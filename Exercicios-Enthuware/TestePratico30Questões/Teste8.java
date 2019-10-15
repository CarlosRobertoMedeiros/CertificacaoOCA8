
/**
	Imprime B em seguida a gera a Exception
	Isso ocorre devido ao finally
	
	An exception is thrown in method m1() so println("A") will not be executed.
    As there is no catch block, the exception will not be handled and the main() 
	method will throw the exception to the caller. Therefore, println("C"); 
	will also not be executed.
    'finally' block is always executed (even if there is a return in try but not if 
	there is System.exit() ) so println("B") is executed.
	
*/
class Teste8{
	public static void main(String []args) throws Exception{
		try{
			m1();
			System.out.println("A");
		}
		finally{
			System.out.println("B");
		}
		System.out.println("C");
	
	}
	
	public static void m1() throws Exception{
		throw new Exception();
	}
	
}