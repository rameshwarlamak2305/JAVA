package lab30march;

public class Question3 extends Thread {
   
int num;
   Question3(int num){
	   this.num=num;
   }
@Override
public void run() {
	// TODO Auto-generated method stub
	 for(int i=1;i<=10;i++) {
		 System.out.println(num*i);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
public static void main(String[] args) {
	 Question3 table =new Question3(5);
	 table.start();
}
   
}
