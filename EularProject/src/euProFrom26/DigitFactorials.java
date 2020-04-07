package euProFrom26;

//It is mathematically proved that the maximum number is less than 9999999 Since 9999999 is greater than 7*9!
public class DigitFactorials {
	public static long sum=0;
	public static void main(String[] args) {
		long sum2=0;
		for(long i=1;i<9999999;i++) {
			sum=0;
			funct(i);
			if(i==sum) {
				sum2=sum2+sum;
				System.out.print(i);
				System.out.println();
			}			
		}
		System.out.println(sum2-3);
	}
    //The function is opposite .
	//Also 1!+2! and 2!+1! are same
	public static void funct(long i) {
		sum=sum+fact(i%10);
		if(i/10>0) {
			funct(i/10);	
		}
		
	}
	public static long fact(long i) {
		long a=1;
		for(int j=1;j<=i;j++) {
			a=a*j;
		}
		return a;
	}
	
	
}
