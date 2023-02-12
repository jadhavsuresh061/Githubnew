package com.exception;

public class Sample {
	public void m2() {
		System.out.println("excuting m2");
		int []x= {1,2,3,4};
try {
		System.out.println(x[5]);
}catch(ArrayIndexOutOfBoundsException e){
	e.printStackTrace();
	int LastIndex  = x.length;
	System.out.println(LastIndex);
}
System.out.println("CONTINUE METHOD M2");
Exception e = new Exception();
	}

}
