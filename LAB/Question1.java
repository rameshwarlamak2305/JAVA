package lab30march;
class Average extends Thread {
	 public void run() {
		 int sum=0;
		 for(int i=0;i<=10;i++) {
			 sum+=i;
		 }
		int avg=sum/10;
		System.out.println("avg of 10 num: " +avg);
	 }
	

}
class Square extends Thread{
	 public void run() {
		 int arr[]= {1,20,50,15,30};
		 int[] square1=new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			 square1[i]=arr[i]*arr[i];
		 }
		 System.out.println("square of arr:");
		 for(int i=0;i<square1.length;i++) {
			 System.out.println(square1[i]+",");
		 }
	 }
	 
}

public class Question1 {
	public static void main(String[] args) {
		Average avg=new Average();
		avg.start();
		try {
			avg.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Square square1=new Square();
		square1.start();
	}

}
