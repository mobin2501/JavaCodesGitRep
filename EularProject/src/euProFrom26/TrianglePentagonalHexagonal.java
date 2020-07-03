package euProFrom26;

public class TrianglePentagonalHexagonal {
	public static void main(String[] args) {
		for(long i=286;;i++) {
			if(Pantagonal(Hgen(i))==true && Triangle(Hgen(i))==true) {
				System.out.println(Hgen(i));
				print(Hgen(i));
				break;
			}

		}
		
	}
	static long Tgen(long n) {
		return (long)(n*(n+1)/2);
	}
	static long Hgen(long n) {
		return (long)(n*(2*n-1));
	}
	static void print(long ans) {
		double n=(-1+Math.sqrt(1+8*ans))/2;
		double m=(1+Math.sqrt(1+24*ans))/6;
		double p=(1+Math.sqrt(1+8*ans))/4;
		System.out.println(n+" "+m+" "+p);
	}
	
	static boolean Triangle(long t) { 
		double n=(-1+Math.sqrt(1+8*t))/2;
		if(Math.ceil(n)-n==0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean Pantagonal(long p) {
		double n=(1+Math.sqrt(1+24*p))/6;
		if(Math.ceil(n)-n==0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean Hexagonal(int h) {
		double n=(1+Math.sqrt(1+8*h))/4;
		if(Math.ceil(n)-n==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
