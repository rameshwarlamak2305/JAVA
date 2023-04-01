package lab30march;

class Oddnum extends Thread{
	
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+",");
			}
		}
	}
	
}
class Evennum extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+",");
				
			}
		}
		
	}
}


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Oddnum odd=new Oddnum();
 odd.start();
 try {
	odd.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    Evennum even=new Evennum();
    even.start();
	}

}
