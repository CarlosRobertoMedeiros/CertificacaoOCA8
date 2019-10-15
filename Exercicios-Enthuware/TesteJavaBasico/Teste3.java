class Teste3{ //A classe Seria Triângulo
	public static void main(String[] args){
		public int base;
		public int height;
		public double area;
		
		public Teste3(int base, int height){
			this.base = base;
			this.height = height;
			updateArea();
		}

		void updateArea(){
			area = base*height/2;
		}
		
		public void setBase(int b){base = b; updateArea();}
		public void setHeight(int h){height = h; updateArea();}

	}
}