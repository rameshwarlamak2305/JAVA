package threading;

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
}
public class JoinDemo {

	public static void main(String[] args) {
	
		Thread1 t1=new Thread1();
		  t1.start();
		  
		  
      try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      Thread1 t2=new Thread1();
	  t2.start();
      try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		  
		  System.out.println("this is thread main");

  
	}
}


