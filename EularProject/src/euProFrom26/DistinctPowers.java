package euProFrom26;

import java.util.ArrayList;
import java.util.Collections;
import java.math.BigInteger;

public class DistinctPowers {
	public static void main(String[] args) {
		ArrayList<BigInteger> al=new ArrayList<BigInteger>();
		BigInteger a=BigInteger.ONE;
		a=a.add(BigInteger.ONE);
		BigInteger c=BigInteger.TEN;
		c=c.multiply(BigInteger.TEN);
		while(a.compareTo(c)!=1) {
			for(int b=2;b<=100;b++) {
				//System.out.println(a+"^"+b+"="+p(a,b));
				al.add(p(a,b));
			}
			a=a.add(BigInteger.ONE);
		}
			
		Collections.sort(al);
		System.out.println(al);
		for(int i=0;i<al.size()-1;i++) {
			if(al.get(i).compareTo(al.get(i+1))==0) {
				
				al.remove(i);
				i--;
			}
		}
		System.out.print(al);
	}
	public static BigInteger p(BigInteger a,int b) {
		BigInteger m=a;
		for(int i=1;i<b;i++) {
			a=a.multiply(m);
		}
		return a;
	}

}
