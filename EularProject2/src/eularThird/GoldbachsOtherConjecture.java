package eularThird;

import java.util.ArrayList;
import java.util.HashMap;

public class GoldbachsOtherConjecture {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args) {
		//ArrayList<Integer> odd=new ArrayList<Integer>();
		HashMap<Integer,Integer> od=new HashMap<Integer,Integer>();
		Reset(b);
		Erat(1000);
		for(int i=2;i<1000;i++) {
			if(b[i]==true) {
				al.add(i);
			}
			else if(i%2!=0) {
				//odd.add(i);
				od.put(i, i);
			}
		}
		for(int i=1;i<al.size();i++) {
			od.remove(al.get(i)+2);
		}
		System.out.println(al);
		System.out.println(od.values().size());
	}
	static boolean[] b=new boolean[1000];
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
