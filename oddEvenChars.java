package hackerRank30DayChallenges;
import java.util.*;

public class oddEvenChars {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
	        for (int i = 0; i < T; i++) {
	            String str = sc.next();
	            int k=0;
	            String strOdd =str.substring(0,1) ;
	            String strEven= str.substring(1,2);
	            for(int j=2; j<str.length();j++){
	                if(k==0) {
	                    k=1;
	                     strOdd =strOdd+str.substring(j,j+1);
	                }
	                else{
	                    k=0;
	                     strEven =strEven+str.substring(j,j+1);
	                }
	            }
	            System.out.println(strOdd +" "+strEven);
	    }
	        sc.close();
	}
}
	
