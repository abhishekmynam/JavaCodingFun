package hackerRank30DayChallenges;
import java.util.*;
public class reverseArray {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        int[] arr2 = new int[n];
	        for(int i=0; i < n; i++){
	            int j = in.nextInt();
	            arr[i] = j;
	            arr2[n-i-1] =j;
	        }
	        System.out.println("hello ");
	        for (int k=0; k < n; k++){
	            int valInt =arr2[k];
	            String val = String.valueOf(valInt);
	            System.out.println(val+" ");
	        }
	        in.close();
	        in.close();

	}

}
