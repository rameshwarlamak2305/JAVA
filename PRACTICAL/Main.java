/*enum Day // declaring enum outside the class
{
	SUNDAY,
    MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
		}*/
	class Main{
		enum Day // declaring enum outside the class
{
	SUNDAY,
    MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY;
	Day()
	{
		System.out.println("Im private cons");
	}
		}
		public static void main(String[] args){
			Day d1=Day.THURSDAY;
			System.out.println(d1);
			System.out.println("value tuesday:"+Day.valueOf("THUESDAY"));
            
			System.out.println("Index tuesday:"+Day.valueOf("THUESDAY").ordinal());
	        for(Day d:Day.values()){
				System.out.println(d);
			}
	
	}
	}
