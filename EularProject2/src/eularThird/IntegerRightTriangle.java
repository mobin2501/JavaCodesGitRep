package eularThird;

public class IntegerRightTriangle {
	public static void main(String[] args) {
		int max=0;
		int val=0;
		int[] p=new int[1000];
		for(int i=0;i<1000;i++) {
			p[i]=0;
		}
		for(int c=1;c<500;c++) {
			for(int a=1;a<c;a++) {
				for(int b=1;b<c;b++) {
					if(a*a+b*b==c*c && a+b+c<=1000) {
						if(a+b+c==840) {
							System.out.println(a+" "+b+" "+c);
						}
						
						p[a+b+c-1]=p[a+b+c-1]+1;
					}
				}
			}
		}
		for(int i=0;i<1000;i++) {
			if(max<p[i]) {
				max=p[i];
				val=i+1;
			}
		}
		System.out.println(val);
		
	}
}
