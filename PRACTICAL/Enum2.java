enum Direction
	{
		EAST,
			WEST,
			NORTH,
			SOUTH;
	}

class Enum2{
	
	  Direction direction;
	  Enum2(Direction direction)
	{
		this.direction=direction;
	}
	
	  void checkDirection()
	{
		  switch(direction)
		{
			  case EAST: System.out.println("East");
			  break;
			  case WEST: System.out.println("west");
			  break;
			  case NORTH: System.out.println("north");
			  break;
			  case SOUTH: System.out.println("south");
			  break;
			  default: System.out.println("Wrong choice");
			  break;
		}
	}
	public static void main(String[] args){
		String str="NORTH";
		Enum2 e=new Enum2(Direction.valueOf(str));
        e.checkDirection();
	}
}


