package euProFrom26;

import java.util.Arrays;

//since n>1 so the maximum the number can be is 5 digit

public class PandigitalMultiples {
	public static void main(String[] args) {
		long l=0;
		for(int i=1;i<100000;i++) {
			String str="";
			int j=1;
			while(str.length()<9) {
				int p=i*j;
				str=str+p;
				j++;
			}
			if(Pan(str)==true) {
				if(l<Integer.parseInt(str)) {
					l=Integer.parseInt(str);
				}
			}
		}
		System.out.print(l);
	}
	static boolean Pan(String str) {
		boolean r=false;
		char[] c=str.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length-1;i++) {
			if(c.length==9 && c[i]!='0' && c[i]!=c[i+1] ) {
				r=true;
				
			}
			else {
				r=false;
				break;
			}
		}
		return r;
	}

}
