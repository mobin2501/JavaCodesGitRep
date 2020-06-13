package euProFrom26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PandigitalProduct {
	static int sum=0;
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		long sum=0;
		for(int i=10;i<=99;i++) {
			for(int j=100;j<=999;j++) {
				if(Pandigital(i,j)==true) {
					al.add(i*j);
					System.out.println(i+" "+j+" "+i*j);
				}
			}
		}
		for(int i=2;i<=9;i++) {
			for(int j=1000;j<=9999;j++) {
				if(Pandigital(i,j)==true) {
					al.add(i*j);
					System.out.println(i+" "+j+" "+i*j);
				}
			}
		}
		Collections.sort(al);
		
		for(int i=0;i<al.size()-1;i++){
			if(al.get(i).equals(al.get(i+1))) {
				al.remove(al.get(i));
			}
		}
		
		for(int i=0;i<al.size();i++) {
			sum=sum+al.get(i);
		}
		System.out.print(sum);
	}
	
	public static boolean Pandigital(int n,int m) {
		boolean r=true;
		int p=n*m;
		char[] c=(Integer.toString(n)+Integer.toString(m)+Integer.toString(p)).toCharArray();
		Arrays.sort(c);
		
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1] || c[i]=='0') {
				r=false;
				break;
			}
		}
		return r;
	}

}
