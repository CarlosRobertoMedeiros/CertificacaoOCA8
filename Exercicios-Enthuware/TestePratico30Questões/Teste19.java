class Teste19{

	public static void main(String[] args){
		int ia[][] = {{1,2},null};
		
		for(int i =0; i<2;i++)
			for(int j=0;j<2;j++)
				System.out.println(ia[i][j]);

	}
}

/**
It will throw a NullPointerException for ia[1][0] because ia[1] is null.
Note that null is not same as having less number of elements in an array than expected.
If you try to access ia[2][0], it would have thrown ArrayIndexOutOfBoundsException 
because the length of ia is only 2 and so ia[2] tries to access an element out of that 
range. ia[2] is not null, it simply does not exist.

Olhar depois



*/