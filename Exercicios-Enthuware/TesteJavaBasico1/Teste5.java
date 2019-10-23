class Teste5{
	public static void main(String[] args){
		if (args.length ==0)
			System.out.println("no arguments");
		else
			System.out.println(args.length + " arguments");
			
	}
	

}

//length vs length()
// length é usado para arrays args.length
// length() é usado para objetos string e suas variáveis

// length can be used for int[], double[], String[] 
// to know the length of the arrays.

// length() can be used for String, StringBuilder, etc 
// String class related Objects to know the length of the String

//Example

/* Java program to illustrate the 
// concept of length 
// and length() 
public class Test { 
public static void main(String[] args) 
    { 
        // Here array is the array name of int type 
        int[] array = new int[4]; 
        System.out.println("The size of the array is " + array.length); 
  
        // Here str is a string object 
        String str = "GeeksforGeeks"; 
        System.out.println("The size of the String is " + str.length()); 
    } 
} */
