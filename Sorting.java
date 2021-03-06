package hackerRank30DayChallenges;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        int totalSwap=0;
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            totalSwap+=numberOfSwaps;
        	numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int aj=a[j];
                    a[j]=a[j + 1];
                    a[j+1]=aj;
                    numberOfSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+totalSwap+" swaps" );
        System.out.println("First Element: "+a[0] );
        System.out.println("Last Element: "+a[n-1] );
    }

}
