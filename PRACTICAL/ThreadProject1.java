package threading;


class TicketBooking{
	private int total_seats;
	TicketBooking(int seats){
		this.total_seats=seats;
	}
	synchronized void bookseat(int seats) {
		
		if(total_seats>=seats) {
			System.out.println("your " +seats + " seat is booked");
			
			total_seats=total_seats-seats;
			
			System.out.println("Avaible seats " +total_seats);
			
		}else {
			
			System.out.println("seats cannot booked");
			System.out.println("Avaible seats " +total_seats);
			
		}
	}
	
}

public class ThreadProject1 extends Thread {
	static TicketBooking book;
	private int seat;
	public void run() {
		
		book.bookseat(seat);
	}

	public static void main(String[] args) {
		
		book=new TicketBooking(50);
		
		ThreadProject1 ram=new ThreadProject1();
		ram.seat=5;
		ram.start();
		
        
		ThreadProject1 sham=new ThreadProject1();
		sham.seat=10;
		sham.start();
		
 
	}

}
