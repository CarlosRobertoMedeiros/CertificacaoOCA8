class E1 extends Exception{}
class E2 extends E1{}

class Teste20{
	public static void main(String[] args){
		try{
			throw new E2();
		}
		catch(E1 e){
			System.out.println("E1");
		}
		catch(Exception e){
			System.out.println("E");
		}
		finally{
			System.out.println("Finally");
		}
	
	}
}

/**
  Vai imprimir E1 e Finally, basta seguir o código para perceber
  
  Since E2 is a sub class of E1, catch(E1 e) will be able to catch exceptions of class E2.
  Therefore, E1 is printed. Once the exception is caught the rest of the catch blocks 
  at the same level (that is the ones associated with the same try block) are ignored.
  So E is not printed. finally is always executed (except in case of System.exit()), 
  so Finally is also printed.
    
*/