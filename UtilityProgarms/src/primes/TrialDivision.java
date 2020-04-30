package primes;

public class TrialDivision {
	public static void main(String[] args) {
		long s=System.nanoTime();
		int count=1;// m
		count=2; //6k+1
		int n=100;
		for(int i=2;i<n;i++) {
			if(Check2(i)==true) {
				count++;
			}
		}
		System.out.println(count);
		long f=System.nanoTime();
		System.out.println(f-s);
		
	}
	//using 2 and all odd numbers ...
	static boolean Check(int n) {
		boolean check=true;
		int m= (int)Math.sqrt(n);
		if(n%2==0) {
			check=false;
		}
		else {
			for(int i=3;i<=m;i=i+2) {
				if(n%i==0 ) {
					check=false;
				}
			}
		}
		
		return check;
	}
	//using 6k+1
	static boolean Check2(int n) {
		boolean check=true;
		int m= (int)Math.sqrt(n);
		if(n%2!=0 && n%3 !=0 ) {
			for(int k=5;k*k<=n;k=k+6) {
				if(n%k==0 || n%(k+2)==0) {
					check=false;
				}
			}
		}
		else {
			check=false;
		}
		return check;
	}

}
