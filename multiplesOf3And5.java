package hackerRank30DayChallenges;

public class multiplesOf3And5 {

	public static void main(String[] args) {
		long totalNumbers = 1;
		for (long i =0 ; i < totalNumbers ; i++){
			long N =10;
			N-=1;
			long curVal =0;
			long mul3 = (long)Math.floor(N/3);
			curVal = mul3*(mul3+1)*3/2;
			long mul5 = (long)Math.floor(N/5);
			mul5=mul5*(mul5+1)*5/2;
			long mul15 = (long)Math.floor(N/15);
			mul15 = mul15*(mul15+1)*15/2;
			mul5 =mul5-mul15;
			curVal+= mul5;
			
			System.out.println(curVal);
			
		}
	}

}
