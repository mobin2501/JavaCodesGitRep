package bruteForce;

public class Prime {
	public static void main(String[] args) {
		int count =1;
		for(int i=3;i<10000;i++) {
			if(check(i)==true) {
				count++;
			}
		}
		System.out.print(count);
	}
	static boolean check(int n) {
		boolean isprime=true;
		for(int i=2;i<=Math.ceil(n/2);i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		}
		return isprime;
	}

}
