class Teste13{
	public static void main(String[]args){
		System.out.println(Boolean.parseBoolean(" true ")); //False //1
		System.out.println(Boolean.parseBoolean("true")); //True  //2
		System.out.println(Boolean.valueOf(true)); //True
		System.out.println(Boolean.valueOf("trUE")); //False
		System.out.println(Boolean.TRUE); //True
	}
}

/**
1 - This will return false because of the extra spaces at the ends. 
Remember that case of the argment is ignored but spaces are not

2 - Although this will return true but it is still not a valid answer 
because parseBoolean returns a primitive and not a Boolean wrapper object.
*/