package eularThird;

import java.util.ArrayList;

public class GoldbachsOtherConjecture {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args) {
		Reset(b);
		Erat(100);
		for(int i=2;i<100;i++) {
			if(b[i]==true) {
				al.add(i);
			}
		}
		System.out.println(al);
	}
	static boolean[] b=new boolean[100];
	static void Erat(int n) {
		int p=2;
		while(p<n/2) {
			for(int i=2;p*i<n;i++) {
				b[p*i]=false;
			}
			for(int i=p;;i++) {
				if(b[i]==true && i>p) {
					p=i;
					break;
				}
			}
		}
	}
	static void Reset(boolean[] b) {
		for(int i=0;i<b.length;i++) {
			b[i]=true;
		}
	}

}
