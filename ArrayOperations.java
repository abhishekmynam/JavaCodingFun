package hackerRankDataStructures;
import java.util.*;

public class ArrayOperations {
	 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int arr_i=0; arr_i < n; arr_i++){
        arr[arr_i] = in.nextInt();
    }
    in.close();
    for (int i=n-1; i>=0; i--) System.out.print(arr[i] +" ");
	 
  }
}
