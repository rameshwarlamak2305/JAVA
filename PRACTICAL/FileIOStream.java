package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileIOStream {

	public static void main(String[] args) {
		try {
			
			FileOutputStream f=new FileOutputStream("E:\\demo.txt");
			String name =" we are learning java io classes";
			byte arr[] = name.getBytes();//convert string into byte
			
			f.write(arr);
			f.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		//reading
		try {
			FileInputStream f1=new FileInputStream("E:\\demo.txt");
			int i=0;
			while((i=f1.read())!=-1) {
				System.out.print((char)i);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
