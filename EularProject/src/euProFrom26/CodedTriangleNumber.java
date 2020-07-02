package euProFrom26;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CodedTriangleNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f=new File("H:\\Eular\\p042_words.txt");
		ArrayList<String> sal=new ArrayList<String>();
		try{
			Scanner sc=new Scanner(f).useDelimiter("\\W");
			sal.add(sc.next());
			while(sc.hasNext()) {
				sal.add(sc.next());
			}
			System.out.print(sal.get(sal.size()-1));
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.print("not found");
		}
		
	}
}
