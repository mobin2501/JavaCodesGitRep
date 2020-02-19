package primes;

import java.util.ArrayList;
import java.util.*;

public class SieveOfEratosthenes {
	public static void main(String args[]) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=2;i<100;i++) {
			map.put(i, i);
		}
		int p=2;
		for( int i=2;p*i<100;i++) {
			map.remove(p*i,p*i);
		}
		System.out.println(map.size());
		System.out.print(map);
	}

}
