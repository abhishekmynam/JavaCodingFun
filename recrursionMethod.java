package hackerRank30DayChallenges;
import java.util.Scanner;
public class recrursionMethod {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int fact = factorial(N);
		 System.out.println(fact);
		 scan.close();
	    }
	 public static int  retVal =0;
	 public static int factorial(int N){
		 if (N==0) {return retVal;}
		 retVal = N*factorial(N-1);
		 return 1;
	 }
	 
}
