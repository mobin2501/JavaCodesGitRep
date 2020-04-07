package euProFrom26;

//Brute Force ... 
public class CoinSums {
	public static void main(String[] args) {
		int total=0;
		int c1,c2,c5,c10,c20,c50,c100,c200;
		for(c1=0;c1<=200;c1++) {
			for(c2=0;c2<=100;c2++) {
				for(c5=0;c5<=40;c5++) {
					for(c10=0;c10<=20;c10++) {
						for(c20=0;c20<=10;c20++) {
							for(c50=0;c50<=4;c50++) {
								for(c100=0;c100<=2;c100++) {
									for(c200=0;c200<=1;c200++) {
										int num=c1*1+c2*2+c5*5+c10*10+c20*20+c50*50+
												c100*100+c200*200;
										if(num==200) {
											total++;
										}
									}
								}
							}
							
						}
					}
				}
			}
		}
		System.out.print(total);
	}
	

}
