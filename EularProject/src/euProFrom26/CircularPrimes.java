package euProFrom26;

//counts 4 as prime . substitute one ;
public class CircularPrimes {
	public static void main(String[] args) {
		int tot=0;
		for(int i=2;i<1000;i++) {
			if(primecheck(i)==true) {
				if(Cir(i)==true) {
					tot++;
					System.out.println(i);
				}
			}	
		}
		System.out.print(tot-1);
		
	}
	public static boolean Cir(int in) {
		boolean cprime=true;
		boolean[] b=new boolean[Integer.toString(in).length()];
		String[] si=new String[Integer.toString(in).length()];
		for(int i=0;i<si.length;i++) {
			si[i]="";
		}
		char[] ci=Integer.toString(in).toCharArray();
		char temp;
		for(int j=0;j<ci.length;j++) {
			si[j]=si[j]+ci[0];
			temp=ci[0];
			for(int i=0;i<ci.length-1;i++) {
				ci[i]=ci[i+1];
				si[j]=si[j]+ci[i];
			}
			ci[ci.length-1]=temp;
			if(primecheck(Integer.parseInt(si[j]))==true) {
				b[j]=true;
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]==false) {
				cprime=false;
				break;
			}
		}
		return cprime;
	}
	static boolean primecheck(int n) {
		boolean prime=false;
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
			prime=false;
		}
		else {
			prime=true;
		}
		return prime;
	}

}
