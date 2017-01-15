package hackerRank30DayChallenges;
import java.util.*;

public class StringToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try
        {
        	int intVal = Integer.parseInt(S);
        	System.out.println(intVal);
        }
        catch(NumberFormatException e) {
        	System.out.println("Bad String");
        }
        in.close();
    }
}

