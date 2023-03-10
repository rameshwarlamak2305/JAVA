package test;

import java.io.FileReader;
import java.io.FileWriter;

public class RWStrem {

	public static void main(String[] args) {
try {
			
			FileWriter f=new FileWriter("E:\\demo1.docs");
			//String name =" we are learning java io classes";
			//byte arr[] = name.getBytes();//convert string into byte
			
			
			f.write("I am Ram");
			//f.write(arr);
			f.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		//reading
		try {
			FileReader f1=new FileReader("E:\\demo1.docs");
			int i=0;
			while((i=f1.read())!=-1) {
				System.out.print((char)i);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}




	}


