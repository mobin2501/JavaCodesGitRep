package primes;

import java.math.BigInteger;

// using java BigInteger.isProbablePrime
public class ProbablePrime {
	public static void main(String[] args) {
		int n=97;
		BigInteger bi=BigInteger.valueOf(n);
		if(bi.isProbablePrime(1)==true) {
			System.out.print("Prime");
		}
	}
}
