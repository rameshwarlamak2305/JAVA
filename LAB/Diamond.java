import java.util.Scanner;
class Diamond {//class Declaration
    public void DiamondPattern(int n ,char c){//method declaration
	 for(int i=1;i<=n;i++)//outer loop 
        {
            for(int j=1;j<=n-i;j++){//inner loop
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print(c); //print the * Symbol
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)//loop fro decreasing symbol
        {
            for(int j=1;j<=n-i;j++)//inner loop
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        Diamond d=new Diamond();
        d.DiamondPattern(n,c);
    }
}