package primes;

//if n is prime or not ...

public class SieveOfEratosthenes2 {
public static void main(String args[]) {
		
		primecheck(99991);
	}
	static void primecheck(int n) {
		boolean[] b=new boolean[n-1];
		for(int i=0;i<b.length;i++) {
			b[i]=true;
		}
		int p=2;
		int i=0;
		while(2*p<n) {
			for(i=2;i*p<=n;i++) {
				b[i*p-2]=false;
			}
			if(b[b.length-1]==false) {
				break;
			}
			while(p<b.length){
				if(b[p-1]==true) {
					p=p+1;
					break;
				}
				else {
					p++;
				}
			}
			
		}
		if(b[b.length-1]==false) {
			System.out.print(n+" is not prime");
		}
		else {
			System.out.print(n+" is prime");
		}
		
	}

}
