package eularThird;

import java.util.ArrayList;

public class DistinctPrimeFactors {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args) {
		
		Reset(b);
		Erat(1000000);
		for(int i=2;i<b.length;i++) {
			if(b[i]==true) {
				al.add(i);
			}
		}
		//System.out.println(al);
		for(int i=2;i<1000000-3;i++) {
			//System.out.print(i+"= ");
			if(PrimeFactor(i)==true && PrimeFactor(i+1)==true && PrimeFactor(i+2)==true && PrimeFactor(i+3)) {
				System.out.print(i);
				break;
			}
			//System.out.println();
		}
		
	}
	static boolean[] b=new boolean[1000000];
	static void Erat(int n) {
		int p=2;
		while(p<n/2) {
			for(int i=2;p*i<n;i++) {
				b[p*i]=false;
			}
			for(int i=p;;i++) {
				if(b[i]==true && i>p) {
					p=i;
					break;
				}
			}
		}
	}
	static void Reset(boolean[] b) {
		for(int i=0;i<b.length;i++) {
			b[i]=true;
		}
	}
	static boolean PrimeFactor(int n) {
		int i=0;
		int a=0; 
		int c=0;
		while(al.get(i)<=n) {
			
			if(n%al.get(i)==0) {
				if(a!=al.get(i)) {
					c++;
				}
				n=n/al.get(i);
				//System.out.print(al.get(i)+" ");
				a=al.get(i);
			}
			else if(n%al.get(i)!=0) {
				i++;
			}
			
		}
		if(c==4) {
			return true;
		}
		else {
			return false;
		}
	}

}
