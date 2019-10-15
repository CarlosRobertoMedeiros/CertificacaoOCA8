class A{
	String value = "test";
	A(String val){
		this.value = val;
	}
}
class Teste12{

	//Não compila
	//O método print() não existe na classe A
	public static void main(String[] args) throws Exception{
		new A("new Test").print();
	
	}
}