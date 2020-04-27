package primes;
import java.util.ArrayList;
import java.util.Collections;

// how many primes from a to n...
public class SieveOfEratosthenes {
	static int n=100;
	static Boolean[] al=new Boolean[n];
	static int p=2;
	public static void main(String args[]) {
		for(int i=0;i<n;i++) {
			al[i]=true	;
		}
		func(n);
		ArrayList<Boolean> AL=new ArrayList<Boolean>();
		Collections.addAll(AL, al);
		int a=0;
		for(int i=2;i<AL.size();i++) {
			if(AL.get(i)==true) {
				//System.out.println(i); // would print the prime numbers...
				a++;
			}
			
		}
		System.out.print(a);
		
		
	}
	public static void func(int n) {
		while(p<n/2) {
			for(int i=2;p*i<n;i++) {
				al[p*i]=false;
			}
			
			for(int i=p;;i++) {
				if(al[i]==true && i>p) {
					p=i;
					break;
				}
			}
			
		}
		
	}

}
