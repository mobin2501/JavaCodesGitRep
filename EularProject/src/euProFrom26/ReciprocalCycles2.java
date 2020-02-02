package euProFrom26;
import java.util.ArrayList;

public class ReciprocalCycles2 {
	public static boolean b=false;
	public static int max=0;
	public static void main(String args[]) {
		for(int i=385;i<500;i++) {
			System.out.print(i+" ");
			div(i);
			
			System.out.println();
			
		}
		for(int i=961;i<1000;i++) {
			System.out.print(i+" ");
			div(i);
			
			System.out.println();
			
		}
		for(int i=901;i<959;i++) {
			System.out.print(i+" ");
			div(i);
			
			System.out.println();
			
		}
		
		System.out.println(max);
		
	}
	public static void div(int d1) {
		boolean stop=false;
		ArrayList<Integer> al=new ArrayList<Integer>();
		int c=0;
		int d=1;
		int d3=d%d1;
		int d2=d/d1;
		while(stop!=true) {
			d3=d%d1;
			al.add(d3);
			d2=d/d1;
			d=d3*10;
			if(d3==0) {
				stop=true;
				b=false;
			}
			else {
				b=true;
				if(al.size()>1) {
					c++;
					for(int i=0;i<al.size()-2;i++) {
						if(al.get(i)==al.get(i+1)) {
							stop=true;
							
						}
						else if(al.get(i)==al.get(al.size()-1)) {
							stop=true;
							
						}
							
					}
					
				}
			}
			
			System.out.print(d2);
			if(c>max) {
				max=c;
			}
		}
		System.out.print(" "+c+b);
		
	}

}
