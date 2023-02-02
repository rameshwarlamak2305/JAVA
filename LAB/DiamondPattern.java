import java.util.Scanner;  
public class DiamondPattern  
{  
	public void pattern(int row){
		int i, j, n= 1;
		n = row - 1;  

		for (j = 1; j<= row; j++)  
{  
for (i = 1; i<=n; i++)  
{  
System.out.print(" ");  
}  
n--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
n = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= n; i++)  
{  
System.out.print(" ");  
}  
n++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
	}
public static void main(String[] args)  
{  
  
System.out.print("Enter the number of rows : ");  
Scanner sc = new Scanner(System.in);  
int row = sc.nextInt();  
DiamondPattern obj=new DiamondPattern();
obj.pattern(row);
}
	}

  

 

