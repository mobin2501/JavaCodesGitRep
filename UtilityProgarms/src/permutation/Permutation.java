package permutation;
import java.util.ArrayList;



//Remove Technique
public class Permutation {
	public static ArrayList<Integer> al=new ArrayList<Integer>();
	static int count=0;
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int n=a.length;
		Perm(a,n);
		System.out.print(al.size());
	}
	static void Perm(int[]	a,int n) {
		if(n==1) {
			al.add(num2(a));
			count++;
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
	
	
}
