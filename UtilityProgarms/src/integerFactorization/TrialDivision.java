package integerFactorization;

import java.util.ArrayList;

public class TrialDivision {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n=12;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				al.add(i);
			}
		}
	}

}
