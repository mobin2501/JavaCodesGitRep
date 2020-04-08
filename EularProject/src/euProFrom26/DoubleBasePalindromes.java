package euProFrom26;

public class DoubleBasePalindromes {
	static String[] str=new String[1000000];
	static String s="";
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<str.length;i++) {
			str[i]="";
		}
		for(int i=1;i<1000000;i++) {
			s="";
			if(Pal(i)==true) {
				
				Bin(i);
				str[i-1]=str[i-1]+s;
				
				if(Pal2(str[i-1])==true){
					System.out.println();
					System.out.print(i+" =");
					System.out.print(str[i-1]);
					sum=sum+i;
				}
			}
		}
		System.out.println();
		System.out.println(sum);
	}
	public static void Bin(int i) {
		if(i!=0) {
			Bin(i/2);
			s=s+(char)i%2;
		}
	}
	public static boolean Pal(int i) {
		boolean p=false;
		String str=Integer.toString(i);
		char[] ci=new char[str.length()];
		ci=str.toCharArray();
		if(str.length()%2==0) {
			int c=0;
			int j=0;
			int l=ci.length-1;
			while(j<ci.length/2 && l>ci.length/2-1) {
				if(ci[j]==ci[l]) {
					c++;
				}
				j++;
				l--;
			}
			if(c==str.length()/2) {
				p=true;
			}
		}
		else if(str.length()%2==1){
			int c=0;
			int j=0;
			int l=ci.length-1;
			while(j<ci.length/2 && l>ci.length/2) {
				if(ci[j]==ci[l]) {
					c++;
				}
				j++;
				l--;
			}
			if(c==str.length()/2) {
				p=true;
			}
		}
		return p;

	}
	public static boolean Pal2(String i) {
		boolean p=false;
		String str=i;
		char[] ci=new char[str.length()];
		ci=str.toCharArray();
		if(str.length()%2==0) {
			int c=0;
			int j=0;
			int l=ci.length-1;
			while(j<ci.length/2 && l>ci.length/2-1) {
				if(ci[j]==ci[l]) {
					c++;
				}
				j++;
				l--;
			}
			if(c==str.length()/2) {
				p=true;
			}
		}
		else if(str.length()%2==1){
			int c=0;
			int j=0;
			int l=ci.length-1;
			while(j<ci.length/2 && l>ci.length/2) {
				if(ci[j]==ci[l]) {
					c++;
				}
				j++;
				l--;
			}
			if(c==str.length()/2) {
				p=true;
			}
		}
		return p;

	}
	
}