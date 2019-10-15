import exercicio31.*;

class Teste31{
	
	public static void main(String[] args){
		
		Student s = new Student("Vaishali","930012");
		s.grade();
		System.out.println(s.getName());
		s =null;

		s = new Student("Vaishali", "930012");
		s.grade();
		System.out.println(s.getName());
		s = null;
	}

}

/*
na linha s = null, anterior a s = new Student("Vaishali", "930012");
o gc já pode ser chamado.
*/