enum Fruits{
	APPLE,
    BANANA,
    CHERRY,
	MANGO;
}

class EnumWithSwitch{

 public static void main(String[] args){
	 Fruits fru=Fruits.MANGO;
	 switch(fru){
		case APPLE:System.out.println("hey i am apple!!");
		break;
		case BANANA:System.out.println("hey i am banana!!");
		break;
		case CHERRY:System.out.println("hey i am cherry!!");
		break;
		case MANGO:System.out.println("hey i am mango!!");
		break;
	 }
 }
}