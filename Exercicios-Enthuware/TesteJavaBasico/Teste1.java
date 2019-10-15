class Teste1{
	
	String global = "111";
	
	public int parse(String arg){
		int value =0;
		
		try{
			String global = arg; //333   Ao sair do Try já era
			value = Integer.parseInt(global); //333
		}
		catch(Exception e){
			System.out.println(e.getClass());
		}
		System.out.println(global+" "+value+" ");
		return value;
	}
	
	public static void main(String[] args){
		Teste1 ct = new Teste1();
		System.out.print(ct.parse("333"));
	}

}

/*
  111 333 333

**/