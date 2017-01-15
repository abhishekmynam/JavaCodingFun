package hackerRank30DayChallenges;
import java.util.*;
import java.math.*;

public class evenFibonacciAdd {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long totalNumbers =1;//scan.nextLong();
		for (int i=0; i<totalNumbers ; i++){
			
			BigInteger zeroVal=new BigInteger("0");
			BigInteger total =new BigInteger("0");
            BigInteger number =new BigInteger("100");
            //number.add(BigInteger.valueOf((long) scan.nextDouble()));
            BigInteger curValue=new BigInteger("0");
            BigInteger modVal= new BigInteger("2");
            
            
            for(double j=1; curValue.compareTo(number)==-1||curValue.compareTo(number)==0; j++){
            	if (curValue.mod(modVal).compareTo(zeroVal) ==0) total= total.add(curValue);;
                curValue =getNthFibTerm(j);
            	
            	}
            System.out.println(total);
            }
		System.exit(0);
		scan.close();
		}
    private static final double fibA= (1/Math.sqrt(5));
	private static final double fibB= ((1+Math.sqrt(5))/2);
	private static final double fibC= ((1-Math.sqrt(5))/2);

	public static BigInteger getNthFibTerm(double n){
	    return  BigInteger.valueOf((long) (fibA*(Math.pow(fibB, n)-Math.pow(fibC, n))));
	}
}