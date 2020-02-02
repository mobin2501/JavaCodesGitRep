package euProFrom26;

public class QuadraticPrimes {
	public static void main(String args[]) {
		for(int n=0;n<40;n++) {
			func(n,1,41);
		}
		
	}
	static void func(int n,int a,int b) {
		int ans=n*n+a*n+b;
	}
}
