package Constructor;

public class Time {
	int totalseconds;
	Time(int sec){
		totalseconds = sec;
	}
	Time(int min ,int sec){
		totalseconds = min*60 + sec;
	}
	Time(int hour,int min,int sec){
		totalseconds = hour*3600 + min*60 + sec;
	}
	void totalseconds() {
		System.out.println("Total seconds =" + totalseconds);
	}
	public static void main(String[] args) {
		Time t1 = new Time(40);
		Time t2 = new Time(5,40);
		Time t3 = new Time(7,5,40);
		t1.totalseconds();
		t2.totalseconds();
		t3.totalseconds();
	}
}
