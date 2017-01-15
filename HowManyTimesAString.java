package hackerRankDataStructures;
import java.util.*;
public class HowManyTimesAString {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		List<String> strMainData= new ArrayList<>(); 
		List<String> strSearch = new ArrayList<>();
		
		int n1=in.nextInt();
		for (int i=0; i<n1;i++) strMainData.add(in.next());
			
		int n2=in.nextInt();
		for (int i=0; i<n2;i++ )strSearch.add(in.next());

		in.close();
		
		for(String srch:strSearch){
			int count=0;
			for(String elem:strMainData){
				if(srch.equals(elem))count++;
			}
			System.out.println(count);
		}	
	}

}
