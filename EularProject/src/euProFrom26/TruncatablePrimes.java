package euProFrom26;

public class TruncatablePrimes {
	public static void main(String[] args) {
		int n=10;
		int count=11;
		int sum=0;
		while(count>0) {
			boolean b=true;
			if(Check(n)==true) {
				String str=Integer.toString(n);
				for(int i=1;i<str.length();i++) {
					int in=Integer.valueOf(str.substring(i,str.length()));
					if(Check(in)!=true) {
						b=false;
						break;
					}
				}
				for(int i=str.length()-1;i>0;i--) {
					if(b==false) {
						break;
					}
					int in=Integer.valueOf(str.substring(0,i));
					if(Check(in)!=true) {
						b=false;
						break;
					}
				}
				if(b==true) {
					//System.out.println(n);
					count--;
					sum=sum+n;
				}
			}
			n++;
		}
		System.out.print(sum);
	}
	static boolean Check(int n) {
		boolean check=true;
		if(n==0 || n==1) {
			check=false;
		}
		else if(n==2 || n==3) {
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
