package primes;

//

public class SieveOfEratosthenes2 {
	public static void main(String args[]) {
		int count=0;
		for(int i=2;i<100;i++) {
			if(primecheck(i)==true) {
				count++;
				System.out.println(i);
			}
		}
		System.out.print(count);
	}
	static boolean primecheck(int n) {
		boolean[] b=new boolean[n-1];
		for(int i=0;i<b.length;i++) {
			b[i]=true;
		}
		int p=2;
		int i=0;
		while(2*p<=n) {
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
		return b[b.length-1];
	}

}
