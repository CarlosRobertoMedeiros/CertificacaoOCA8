class Automovel{
	public void drive(){
		System.out.println("Automovel:Drive");
	}
}

class Teste18 extends Automovel{ //Teste18SeriaCaminhao
	
	public static void main(String[] args){
		Automovel auto = new Automovel();
		Teste18 truck = new Teste18();
		
		auto.drive();  //1
		truck.drive(); //2
		auto = truck;  //3
		auto.drive();  //4

	}
	
	public void drive(){
		System.out.println("Truck:Drive");
	}
	
}