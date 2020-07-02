package euProFrom26;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CodedTriangleNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count=0;
		//System.out.println((int)'A'-64);
		System.out.println(check("SKY"));
		File f=new File("H:\\Eular\\p042_words.txt");
		ArrayList<String> sal=new ArrayList<String>();
		try{
			Scanner sc=new Scanner(f).useDelimiter("\\W");
			sal.add(sc.next());
			while(sc.hasNext()) {
				sal.add(sc.next());
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.print("not found");
		}
		for(int i=0;i<sal.size();i++) {
			if(check(sal.get(i))==true){
				count++;
			}
		}
		System.out.println(count);
	}
	static boolean check(String str) {
		char[] c=str.toCharArray();
		int t=0;
		for(int j=0;j<c.length;j++) {
			//System.out.print(c[j]+" ");
			//System.out.print((int)c[j]-64);
			//System.out.println();
			t=t+((int)c[j]-64);
		}
		//System.out.println(t);
		
		double a=-.5+(.5*Math.sqrt(1+(8*t)));
		
		//System.out.print(a);
		if(a>0 && Math.ceil(a)-a==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
