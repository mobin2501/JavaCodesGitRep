package euProFrom26;

public class NumberSpiralDiagonals {
	public static void main(String[] args) {
		int sum=0;
		int n=1001; // n*n diagonal number
		int sum1=1;
		for(int i=0;i<n/2;i++) {
			sum1=sum1+(2+i*8);
			sum=sum+sum1;
			System.out.println(sum1);
		}
		int sum2=1;
		for(int i=0;i<n/2;i++) {
			sum2=sum2+(4+i*8);
			sum=sum+sum2;
			System.out.println(sum2);
		}
		int sum3=1;
		for(int i=0;i<n/2;i++) {
			sum3=sum3+(6+i*8);
			sum=sum+sum3;
			System.out.println(sum3);
		}
		int sum4=1;
		for(int i=0;i<n/2;i++) {
			sum4=sum4+(8+i*8);
			sum=sum+sum4;
			System.out.println(sum4);
		}
		System.out.print(sum+1);
		
	}

}