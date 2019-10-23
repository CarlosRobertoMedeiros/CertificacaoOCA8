package com.bar;

import com.foo.*;
import static com.foo.X.LOGICID;


public class Y{
	public static void main(String[]args){
		X x = new X();
		x.apply(LOGICID);
	}
}