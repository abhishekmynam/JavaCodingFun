package hackerRank30DayChallenges;
import java.io.*;
public class TorecelliTriangle {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int  a=0, b=0,c=0, sums=0;
        double N=0;
    	try {
		    N = System.in.read ();
			N = 4*N/Math.sqrt(3.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	sums = a+b+c;
    	
        for (a=1 ; sums < N; a++  ){
        	for (b=1; a>=b;b++){
        		for(c=1;b>=c;c++){
        			sums =a+b+c;
        			if (sums==(int)N){
        				System.out.println( a +" "+ b+" "+c );
        			}
        		}
        	}
        }
    }
}
