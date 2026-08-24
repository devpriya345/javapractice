package java8Feature;

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		
		Runnable r = ()-> {     // using lambda expression
			for(int i =1; i<=5 ;i++) {
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
	
}
