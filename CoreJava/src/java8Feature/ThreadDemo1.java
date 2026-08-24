package java8Feature;

public class ThreadDemo1 implements Runnable{
	public void run() {    //Approach 1
		
		for(int i = 1 ; i<=5 ; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadDemo1 td = new ThreadDemo1();
		Thread  t = new Thread(td);
		t.start();
	}
}
