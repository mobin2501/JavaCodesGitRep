package primes;

public class CheckprimeBruteForce {
	public static void main(String[] args) {
		long s=System.nanoTime();
		int count=0;
		int n=10000;
		for(int i=2;i<n;i++) {
			if(Check(i)==true) {
				count++;
			}
		}
		System.out.println(count);
		long f=System.nanoTime();
		System.out.println(f-s);
		
	}
	static boolean Check(int n) {
		boolean check=true;
		int m= (int)Math.sqrt(n);
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				check=false;
			}
		}
		return check;
	}

}
