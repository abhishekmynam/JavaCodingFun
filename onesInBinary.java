package hackerRank30DayChallenges;
import java.util.*;
public class onesInBinary {

	public static void main(String[] args) 
		{
		    Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int j1=0;
		        int j2=0;
		        int j=1, k=0;
		        //int[] arrOne;
		        for (int i=n; i>0 ; i/=2){
		        	j2=j1;
		        	j1=i%2;
		        	if (j1==1 && j2==1) 
		        		{j++;
		        		if(k<j)
	                	{k=j;}}
		            else
		                {if(k<j)
		                	{k=j;}
		                 j=1;
		                
		            }
		        }
		        
		        System.out.println(k);
		        in.close();
			}


}
