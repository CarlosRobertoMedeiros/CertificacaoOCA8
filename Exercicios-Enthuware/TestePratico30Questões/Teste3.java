class ValoresCalculados{
	int calculaSoma(){
		int count = 0,sum = 0;

		do{
			if(count % 3 ==0)continue;
			sum+=count;

		}while(count++ <11);

		return sum;
	}
	
}


class Teste3{
	
	public static void main(String []args){
		ValoresCalculados vc = new ValoresCalculados();
		System.out.println(vc.calculaSoma());
	}
}

/** 

  0  mod 3 = 0  //Pula
  1  mod 3 = 1  // 0+1 = 1
  2  mod 3 = 2  // 2+1 = 3
  3  mod 3 = 0  //Pula
  4  mod 3 = 1  = 4+3 = 7
  5  mod 3 = 2  = 5+7 = 12
  6  mod 3 = 0  //Pula
  7  mod 3 = 1  = 7+12 = 19
  8  mod 3 = 2  = 8+ 19 = 27
  9  mod 3 = 0  //Pula
  10 mod 3 = 1  = 10+27 = 37
  11 mod 3 = 2 = 11+37 = 48..
  Resposta 48
  
*/

