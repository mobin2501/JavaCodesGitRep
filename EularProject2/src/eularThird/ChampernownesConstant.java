package eularThird;
import java.util.ArrayList;

public class ChampernownesConstant {
	ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String args[]) {
		int a=0;
		for(int i=0;i<100;i++) {
			a++;
			print(a);
			System.out.println();
		}
		
	}
	static void print(int a) {
		if(a/10<1) {
			System.out.print(a);
		}
		else {
			print(a/10);
			print(a%10);
		}
	}

}
