class Exericio4{
	public static void main(String [] args){
			String s = "blooper";
			StringBuilder sb = new StringBuilder(s);
			sb.append("Whooper");
			sb.append("Shopper");
			
			System.out.println(s);
			System.out.println(sb);
			
			
			System.out.println("===BRINCANDO DE ARRAY===");
			String []alunos = new String[10];
			
			for(String aluno:alunos)
				System.out.println("aluno =>"+aluno);
			
			
			
			
			
	}
}