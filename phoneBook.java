package hackerRank30DayChallenges;
import java.util.*;


public class phoneBook {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer entries= phoneBook.get(s);
            if (entries!=null){
            	System.out.println(s+" = "+entries);
            }
            else System.out.println("Not found");
            	
        }
        in.close();
    }
}
