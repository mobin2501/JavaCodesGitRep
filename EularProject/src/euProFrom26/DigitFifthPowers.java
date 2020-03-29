package euProFrom26;

//Tha maximum that can be calculable lies between 5*9^5 and 6*9^5 
// We could've looped it to 6*9^5 but since 10^6 isn't that big number we didn't bother ...
// For n I'd check m*9^n such that ,sum is greater than number ...

public class DigitFifthPowers {
	public static void main(String[] args) {
		int s=0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					for(int l=0;l<=9;l++) {
						for(int m=0;m<=9;m++) {
							for(int n=0;n<=9;n++) {
								int sum=p(i,5)+p(j,5)+p(k,5)+p(l,5)+p(m,5)+p(n,5);
								String num=Integer.toString(i)+Integer.toString(j)+Integer.toString(k)
								+Integer.toString(l)+Integer.toString(m)+Integer.toString(n);
								if(sum==Integer.valueOf(num)) {
									System.out.println(sum+" "+num);
									s=s+sum;
								}
							}
							
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
