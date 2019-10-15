class Teste25{

	public static void main(String []args){
		int i =0;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool = false;
		
		bool = (bool2 & method1("1"));   //1 bool = (false ) Não usa curto circuito
		bool = (bool2 && method1("1"));  //2        
		bool = (bool1 | method1("3"));   //3 bool = (false) Não usa curto circuito
		bool = (bool1 || method1("4"));  //4
	}
	
	public static boolean method1(String str){
		System.out.println(str);
		return true;
	}
}

/**
& and | do not short circuit the expression. The value of all the expressions 
( 1 through 4) can be determined just by looking at the first part.
&& and || do not evaluate the rest of the expression if the result of the whole 
expression can be known by just evaluating the left operand, so method1() is not 
called for 2 and 4.

O short circuit força a execução do método


*/