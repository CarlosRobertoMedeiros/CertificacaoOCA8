class Teste10{
	public static void main(String []args){
		int i = 0;
		int j = 1;
		
		System.out.println(i++ == 0);
		System.out.println(j++ == 2);
		
		if( (i++ == 0) & (j++ == 2) ){ // Aqui da False Passa da Primeira Condição
			i = 12;					   // Cancela a Segunda Condição		
		}
		
		System.out.println(i+" "+j);// Realiza o ++ para cada um aumentando i e j
									// Para 1 e 2 
									
	}
}


/**
	Quer Saber o valor final do System.out.println
	

The | and & operators, when applied to boolean operands, ensure that both the sides are evaluated. This is opposed to || and && operators, which do not evaluate the Right Hand Side operand if the result can be known by just evaluating the Left Hand Side.

Now, let us see the values of i and j at each step:

int i = 0;
int j = 1;
if( (i++ == 0) & (j++ == 2) )    //compare i with 0 and increment i => returns true and i becomes 1. Evaluate next condition:
        //compare j with 2 and increment j => return false and j becomes 2.
        //true & false returns false so i = 12 is not executed.
{
   i = 12;
}
System.out.println(i+" "+j)); //print 1 and 2

*/