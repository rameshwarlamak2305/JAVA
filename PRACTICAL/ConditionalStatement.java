import java.util.*;
class ConditionalStatement{
        public void calc( int x,int y){
              // int x = 43;
             // int y = 21;
              if(x>y){
                 System.out.println("x is greater than y");
}
              else{
                 System.out.println("x is not greater than y");
}
}
        public static void main(String args[]){
			Scanner s= new Scanner(System.in);
			System.out.println("enter num");
			int x= s.nextInt();
			System.out.println("enter num");
			int y= s.nextInt();

              ConditionalStatement obj = new ConditionalStatement();
              obj.calc(x,y);
}
}