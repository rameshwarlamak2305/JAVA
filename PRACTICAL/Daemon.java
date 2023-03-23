package threading;

public class Daemon implements Runnable{

	public static void main(String[] args) {
		Daemon d=new Daemon();
		Thread t= new Thread(d);
		t.setDaemon(true);
		
		t.start();
		
		

	}

	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		}
		else {
			System.out.println("not a daemon");
		}
		
	}

}
