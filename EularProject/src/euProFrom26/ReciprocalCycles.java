package euProFrom26;
import java.util.ArrayList;

//Works till 11 
public class ReciprocalCycles {
	public static int max=0;
	public static void main(String args[]) {
		
		
		System.out.println(max);
		div(7);
		
	}
	public static void div(int n) {
		int d1=n;
		int d3=0;
		int d=10;
		boolean stop=false;
		ArrayList<Integer> al=new ArrayList<Integer>();
		int i=0;
		while(stop!=true ) {
			int d2=d/d1;
			d3=d%d1;
			if(d3==0) {
				stop=true;
			}
			//System.out.print(d2);
			al.add(d2);
			
			//
			if(al.get(i)==d2 && al.size()>1) {
				int f3=d3;
				int f=f3*10;
				
				//System.out.println();
				int temp=0;
				for(int j=1;j<al.size();j++) {
					int f2=f/d1;
					f3=f%d1;
					//System.out.println(j);
					if(al.get(j)==f2) {
						f=f3*10;
						f3=0;
					}
					else {
						break;
					}
					
					
					temp=j;
					
				}
				
				if(temp==al.size()-1) {
					stop=true;
					System.out.print(n+" ");
					System.out.println(+(al.size()-1));
					if(max<al.size()-1) {
						max=al.size()-1;
					}
					
				}
			}
			
			d=d3*10;
			d3=0;
			i++;
			
			
		}	
	}

}
