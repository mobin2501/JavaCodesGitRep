package euProFrom26;

import java.util.ArrayList;
import java.util.Collections;

public class PandigitalPrime {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args) {
		int max=0;
		int[] a= {1,2,3,4,5,6,7};
		int n=a.length;
		Perm(a,n);
		for(int i=0;i<al.size();i++) {
			if(PrimeCheck(al.get(i))==true && Pan(al.get(i))){
				if(max<al.get(i)) {
					max=al.get(i);
				}
			}
		}
		System.out.println(max);
	}
	
	static void Perm(int[]	a,int n) {
		if(n==1) {
			al.add(num2(a));
		}
		for(int i=0;i<n;i++) {
			swap(a,i,n);
			Perm(a,n-1);
			swap(a,i,n);
		}
	}
	static void swap(int[] a,int i,int n) {
		int temp=a[i];
		a[i]=a[n-1];
		a[n-1]=temp;
		
	}
	static int num2(int[] a) {
		int nm=0;
		for(int i=0;i<a.length;i++) {
			nm=nm*10+a[i];
		}
		return nm; 
	}
	
	static void num(int n,ArrayList<Character> ch) {
		int c=n%10;
		ch.add((char)(c+48));
		if(c!=0 && (n/c)>1) {
			num((n-c)/10,ch);
		}
	}
	
	static boolean Pan(int n) {
		boolean res=true;
		ArrayList<Character> ch=new ArrayList<Character>();
		num(n,ch);
		Collections.sort(ch);
		for(int i=0;i<ch.size();i++) {
			if(ch.get(i)=='0' || ch.get(i)>(ch.size()+48)) {
				res=false;
				break;
			}
			else if(i<ch.size()-1) {
				if(ch.get(i).equals(ch.get(i+1))){
					res=false;
					break;
				}
			}
		}
		return res;
	}
	
	static boolean PrimeCheck(int n) {
		boolean check=true;
		if(n==2 || n==3) {
			check=true;
		}
		else if(n%2!=0 && n%3 !=0 ) {
			for(int k=5;k*k<=n;k=k+6) {
				if(n%k==0 || n%(k+2)==0) {
					check=false;
				}
			}
		}
		else {
			check=false;
		}
		return check;
	}
	


}
