package hackerRank30DayChallenges;
import java.util.*;
public class CalculatorInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator1(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
interface AdvancedArithmetic{
	   int divisorSum(int n);
	}
class Calculator1  implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int k=0;
		if(n==1) k=1;
		else
		{for (int i=1;i*i<n;i++){
			if(n%i==0){
				k=k+i+n/i;
			}
		}
		}
		return k;
	}
	
}