package primes;

import java.math.BigInteger;

public class ProbablePrime {
	public static void main(String[] args) {
		int c=0;
		BigInteger bi=BigInteger.ONE;
		for(int i=2;i<100;i++) {
			bi=bi.add(BigInteger.ONE);
			if(bi.isProbablePrime(1)==true) {
				c++;
			}
			
		}
		System.out.print(c);
		
	}
}
