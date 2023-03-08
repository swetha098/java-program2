package file;
import java.io.FileOutputStream;
public class fileoutputinput {
	public static void main(String[] args) {
		String A="Abukodiyan";
		byte[] b=A.getBytes();
		try {
			FileOutputStream f= new FileOutputStream("D://saji.txt");
			f.write(b);
			System.out.println("Success");
		
	}
		catch (Exception e) {
		System.out.println(e);}
	}}

