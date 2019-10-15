class Data{
	private int x=0, y=0;
	
	public Data(int x, int y){
		this.x = x;
		this.y =y;
	}
	
	public void setValues(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	
}
class Teste9{
	public static void main(String []args){
		Data d = new Data(1,1);
		d.setValues(2,2); //Nesse Exemplo Foi implementado o método
						  // O que pedia era para alterar o valor do objeto Data do		
						  // O fiz criando o método setValues
		
	}
}