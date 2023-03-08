package filecount;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class wordcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String S= sc.nextLine();
		
		
		byte []b=S.getBytes();
		int count=0;
		try{
			FileOutputStream f = new FileOutputStream("D://uount.txt");
			f.write(b);
			f.close();
			FileInputStream r=new FileInputStream("D://uount.txt");
			
			int i;
			
			while((i=r.read())!=-1) {
				if(i==' ') {
					count++;
				}
			}System.out.println(count+1);r.close();
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
