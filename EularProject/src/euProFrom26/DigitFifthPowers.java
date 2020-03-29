package euProFrom26;

public class DigitFifthPowers {
	public static void main(String[] args) {
		int s=0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					for(int l=0;l<=9;l++) {
						int sum=p(i,4)+p(j,4)+p(k,4)+p(l,4);
						String num=Integer.toString(i)+Integer.toString(j)+Integer.toString(k)+Integer.toString(l);
						if(sum==Integer.valueOf(num)) {
							System.out.println(sum+" "+num);
							s=s+sum;
						}
						
					}
				}
			}
		}
		System.out.print(s-1);
	}
	public static int p(int a,int b) {
		return (int) Math.pow(a, b);
	}


}
