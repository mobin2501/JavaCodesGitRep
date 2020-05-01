package euProFrom26;

public class CircularPrimes {
	public static void main(String[] args) {
		int c=0;
		for(int i=2;i<1000000;i++) {
			if(Check(i)==true && Circle(i)==true) {
				c++;
			}
		}
		System.out.println(c);
	}
	static boolean Check(int n) {
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
	static boolean Circle(int n) {
		boolean check=true;
		String s=Integer.toString(n);
		String[] str=new String[s.length()-1];
		for(int i=0;i<str.length;i++) {
			str[i]="";
		}
		char[] c= s.toCharArray();
		for(int j=0;j<str.length;j++) {
			char temp=c[0];
			for(int i=0;i<s.length()-1;i++) {
				c[i]=c[i+1];
				str[j]=str[j]+c[i];
			}
			c[c.length-1]=temp;
			str[j]=str[j]+temp;
			if(Check(Integer.valueOf(str[j]))!=true) {
				check=false;
				break;
			}
		}
		return check;
	}
}
