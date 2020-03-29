package euProFrom26;

import java.math.BigInteger;

public class SelfPower {
	public static void main(String[] args) {
		BigInteger sum=BigInteger.ZERO;
		BigInteger l=BigInteger.TEN;
		l=l.multiply(BigInteger.TEN);
		l=l.multiply(BigInteger.TEN);
		
		BigInteger i=BigInteger.ONE;
		while(i.compareTo(l)!=1) {
			sum=sum.add(p(i));
			i=i.add(BigInteger.ONE);
		}
		
		//sum=p(l);
		System.out.println(sum);
		String sumstr=sum.toString();
		System.out.println(sumstr.substring(sumstr.length()-10, sumstr.length()));
	}
	public static BigInteger p(BigInteger a) {
		BigInteger m=a;
		BigInteger i=BigInteger.ONE;
		while(i.compareTo(m)==-1) {
			a=a.multiply(m);
			i=i.add(BigInteger.ONE);
		}
		
		return a;
	}

}
