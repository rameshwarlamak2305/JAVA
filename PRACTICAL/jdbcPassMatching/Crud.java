package service;

import java.util.Scanner;

public class Crud {
	public static void check() {
		System.out.println("enter user name");
		String username=sc.nextLine();
		
		System.out.println("enter password");
		String pass=sc.nextLine();
		Employee.admin(username, pass);
		
	}

	static Scanner sc=new Scanner(System.in);
		public static void app() {
			int ch=0;
			 do {
				 System.out.println("1.create table \n 2.add record \n 3. update record \n 4. serach by id \n 5.show all");
				 ch=sc.nextInt();
				switch (ch) {
				case 1:
					Employee.createTable();
				
					break;
				case 2:
					System.out.println("enter your id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("enter your name");
					String name=sc.nextLine();
					 Employee.insertRecord(id, name);
				   break;
				case 3:
					System.out.println("enter your id");
					id=sc.nextInt();
					sc.nextLine();
					System.out.println("enter your new name");
					name=sc.nextLine();
					Employee.updateRecord(name, id);
					break;
				case 4:
					System.out.println("enter your id");
					id=sc.nextInt();
					Employee.retrieveData(id);
					break;
				case 5:
					Employee.showAll();
					break;
				default:
					break;
				}
				
			} while(ch!=0);
				
			
		}
		public static void main(String[] args) {
			check();
		}
			
		
	

}
