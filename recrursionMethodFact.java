package hackerRank30DayChallenges;
import java.util.Scanner;

public class recrursionMethodFact {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int facto = fact(N);
		 System.out.println(facto);
		 scan.close();
	    }
	 public static int fact(int n)
	    {
	       int result;
	       if(n==0 || n==1)
	         return 1;

	       result = fact(n-1) * n;
	       return result;
	    }
}
