package hackerRank30DayChallenges;
import java.util.*;


public class hourGlassMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int curVal=0, sumVal=-324;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < 4; i++){
        	for(int j=0; j < 4; j++){
        		curVal = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        		if(curVal>sumVal) sumVal=curVal;
        	}
        	
        }
        in.close();
        System.out.print(sumVal);
    }
}
