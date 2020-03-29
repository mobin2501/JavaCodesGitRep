package euProFrom26;

public class DigitFactorials {
	public static void main(String[] args) {
		ret(145,0);
		
		
	}
	public static int fact(int a) {
		int l=a;
		for(int i=2;i<l;i++) {
			a=a*i;
		}
		return a ;
	}
	
	public static int ret(int a, int sum) {
		
		if(a%10!=0 ) {
			sum=fact(a%10);
			System.out.print(sum+" + ");
			ret(a/10,fact(a%10));
		}
		else if(a%10==0 && a/10!=0){
			System.out.print(1+" + ");
			ret(a/10,1);
		}
		
		return sum;
	}

}
