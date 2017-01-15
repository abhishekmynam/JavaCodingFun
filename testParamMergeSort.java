package hackerRank30DayChallenges;
import java.util.Scanner;

public class testParamMergeSort {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference1 difference = new Difference1(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}



	class Difference1 {

		private int[] elements;
	  	public int maximumDifference;
	 // Add your code here
	    Difference1(int[] elements){
	        this.elements = elements.clone();
	    }

	    public void computeDifference(){
	        elements = mergeSort(elements);
	        maximumDifference = elements[elements.length-1] - elements[0];
	    }

	    private int[] mergeSort(int[] L){
	        if (L.length == 0)
	            return L;
	        else if (rest(L).length == 0)
	            return new int[]{L[0]};
	        else 
	            return merge(mergeSort(firstHalf(L)), mergeSort(secondHalf(L)));
	    }

	    private int[] merge(int[] L1, int[] L2){
	        if (L1.length == 0)
	            return L2;
	        else if (L2.length == 0)
	            return L1;
	        else if (L1[0] < L2[0]){
	            int[] result = new int[L1.length + L2.length];
	            result[0] = L1[0];
	            int[] combine = merge(rest(L1), L2);
	            System.arraycopy(combine, 0, result, 1, combine.length);
	            return result;
	        }
	        else{
	            int[] result = new int[L1.length + L2.length];
	            result[0] = L2[0];
	            int[] combine = merge(L1, rest(L2));
	            System.arraycopy(combine, 0, result, 1, combine.length);
	            return result;
	        }                 
	    }

	    private int[] rest(int[] L){
	        int[] result = new int[L.length-1];
	        System.arraycopy(L, 1, result, 0, L.length-1);
	        return result;
	    }

	    private int[] firstHalf(int[] L){
	        int[] result = new int[L.length/2];
	        System.arraycopy(L, 0, result, 0, L.length/2);
	        return result;
	    }

	    private int[] secondHalf(int[] L){
	        int newLength = L.length - L.length/2;
	        int[] result = new int[newLength];
	        System.arraycopy(L, L.length/2, result, 0, newLength);
	        return result;
	    }
		}
		
