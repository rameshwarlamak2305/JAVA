 class EvenOddSum{
	 public void EvenOddn(){

	 System.out.println("Even numbers between 1 and 200: ");
      for(int i = 1; i<= 200; i++)
      {
         if(i% 2 == 0)
         {
            System.out.print(i + " ");
         }
      }
      System.out.println("\nOdd numbers between 1 and 200: ");
      for(int i =1; i <=200; i++)
      {
         if(i% 2 != 0)
         {
            System.out.print(i+ " ");
         }
	  }
	 }

	   public void sumnumber(){
         int sum = 0;

        for(int i = 1; i <=200; ++i)
        {
            sum = sum + i;
            
        }

        System.out.println("\n\nsum of numbers between 1 to 200:" + sum);
    }
	 
     

    public static void main(String[] args) {
		EvenOddSum obj= new EvenOddSum();
		obj.EvenOddn();
		EvenOddSum a=new EvenOddSum();
		a.sumnumber();
	}
 }

        
     