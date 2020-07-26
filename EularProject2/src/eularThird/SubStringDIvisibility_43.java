package eularThird;

import java.util.ArrayList;

public class SubStringDIvisibility_43 {
	static ArrayList<Long> al=new ArrayList<Long>();
	public static void main(String[] args) {
		long sum=0;
		long[] a= {0,1,2,3,4,5,6,7,8,9};
		int n=a.length;
		permutation(a,n);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			sum=sum+al.get(i);
			//System.out.println(al.get(i));
		}
		System.out.println(sum);
	}
	static void permutation(long[] a,int n) {
		if(n==1) {
			if(check(a)) {
				al.add(num(a));
			}
		}
		for(int i=0;i<n;i++) {
			swap(a,i,n);
			permutation(a,n-1);
			swap(a,i,n);
			
		}
	}
	static void swap(long[] a,int i,int n) {
		long temp=a[i];
		a[i]=a[n-1];
		a[n-1]=temp;
	}
	static long num(long[] a) {
		long nm=0;
		for(int i=0;i<a.length;i++) {
			nm=nm*10+a[i];
		}
		return nm;
	}
	static boolean check(long[] a) {
		boolean ch=false;
		if(a[3]%2==0) {
			if((a[2]+a[3]+a[4])%3==0) {
				if(a[5]==0 || a[5]==5) {
					long n=100*a[4]+10*a[5]+a[6];
					if(n%7==0) {
						long m=100*a[5]+10*a[6]+a[7];
						if(m%11==0) {
							long k=100*a[6]+10*a[7]+a[8];
							if(k%13==0) {
								long l=100*a[7]+10*a[8]+a[9];
								if(l%17==0) {
									ch=true;
								}
							}
						}
					}
				}
			}
			
		}
		else {
			ch=false;
		}
		return ch;
	}

}
