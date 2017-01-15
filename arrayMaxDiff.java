package hackerRank30DayChallenges;
import java.util.*;
public class arrayMaxDiff {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}



	class Difference {

		private int[] elements;
	  	public int maximumDifference;
	  	Difference (int[] array) {
	  	   elements = array;
	  	 }
	  	
	  	
	  	
	  	public void computeDifference(){
	  		int maxNum = elements[0], minNum = elements[0];
	  		for (int i=1;i <elements.length;i++)
	  		{
	  			if (elements[i] > maxNum) maxNum=elements[i];
	  			else if ((elements[i] < minNum)) minNum =elements[i]; 
	  		}
	  		
	  		maximumDifference =  Math.abs(maxNum - minNum);
	  	}
		
		}
		
