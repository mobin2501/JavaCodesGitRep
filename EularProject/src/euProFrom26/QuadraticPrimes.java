package euProFrom26;

public class QuadraticPrimes {
	public static void main(String args[]) {
		int ln=0;
		int la=0;
		int lb=0;
		for(int b=2;b<=1000;b++) {
			if(primecheck(b)==true) {
				for(int a=-999;a<1000;a++) {
					int m=1;
					for(;;) {
						if((m*m+a*m+b)>1 && primecheck(m*m+a*m+b)==true) {
							m++;
						}
						else {
							break;
						}
					}
					if(m>ln) {
						ln=m-1;
						la=a;
						lb=b;
					}
				}
			}
		}
		for(int b=-1000;b<-1;b++) {
			if(primecheck(Math.abs(b))==true) {
				for(int a=-999;a<1000;a++) {
					int m=1;
					for(;;) {
						if((m*m+a*m+b)>1 && primecheck(m*m+a*m+b)==true) {
							m++;
						}
						else {
							break;
						}
					}
					if(m>ln) {
						ln=m-1;
						la=a;
						lb=b;
					}
					
				}
			}
		}
		
		System.out.print("n^2"+la+"n+"+lb+" is the function where 1<=n<="+ln);
		
	}
	static boolean primecheck(int n) {
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
		return b[b.length-1];
	}
}
