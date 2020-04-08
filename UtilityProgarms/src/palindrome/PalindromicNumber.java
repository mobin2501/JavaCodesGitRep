package palindrome;

public class PalindromicNumber {
	public static void main(String[] args) {
		pal(10001);
		
	}
	public static boolean pal(int i) {
		boolean p=false;
		System.out.print(i+" =");
		String str=Integer.toString(i);
		char[] ci=new char[str.length()];
		ci=str.toCharArray();
		if(str.length()%2==0) {
			int c=0;
			int j=0;
			int l=ci.length-1;
			while(j<ci.length/2 && l>ci.length/2-1) {
				if(ci[j]==ci[l]) {
					System.out.print(ci[j]+"|"+ci[l]+" ");
					c++;
				}
				
				j++;
				l--;
			}
			if(c==str.length()/2) {
				System.out.print("P");
			}
		}
		else if(str.length()%2==1){
			int c=0;
			int j=0;
			int l=ci.length-1;
			while(j<ci.length/2 && l>ci.length/2) {
				if(ci[j]==ci[l]) {
					System.out.print(ci[j]+"|"+ci[l]+" ");
					c++;
				}
				j++;
				l--;
			}
			if(c==str.length()/2) {
				System.out.print("P");
			}
		}
		
		
		return p;
	}

}
