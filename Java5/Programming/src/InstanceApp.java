import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();	
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2");
		//PrintWriter에 있는 관계사용
		
		
		//java의 기본적인 클래스 = class object
		//object 상속받는 class = 	extends Object
		//writer class 확장하여 상속 = PrintWriter extends Writer
		
		
		
//		PrintWriter.write("result1.txt","Hello 1");
//		PrintWriter.write("result2.txt","Hello 2");
		 
		
	}
}
