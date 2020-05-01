package euProFrom26;

import java.util.Arrays;

public class PandigitalPrime {
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			/*if(Pan(i)==true && Check(i)) {
				System.out.println();
				System.out.println(i);
			}*/
			System.out.println(Pan(i));
		}
	}
	static boolean Check(int n) {
		boolean check=true;
		if(n==1 || n==0) {
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
	static boolean Pan(int n) {
		boolean check=true;
		String s=Integer.toString(n);
		System.out.print(s+" ");
		int[] ar=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			ar[i]=Integer.valueOf(s.charAt(i))-48;
		}
		//Arrays.sort(ar);
		for(int i=0;i<s.length();i++) {
			if(ar[i]<=s.length()) {
				check=true;
			}
			else {
				check=false;
				break;
			}
		}
		
		return check;
	}

}
