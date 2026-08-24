package java8Feature;

 interface MyInterfaceOne {
	
	public void m1() ;
}
 class MyAppOne  implements MyInterfaceOne{
	
	public void m1() {
		System.out.println("m1 method called...");
	}
	public static void main(String[] args) {
		MyAppOne mao = new MyAppOne();
		mao.m1();
	}
}
