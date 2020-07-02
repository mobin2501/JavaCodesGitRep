package primes;

public class TrialDivision {
	public static void main(String[] args) {
		//6k+1
		
		System.out.print(Check2(2143));
		
		
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
		if(n==2 || n==3) {
			check=true;
		}
		else if(n%2!=0 && n%3 !=0 ) {
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
