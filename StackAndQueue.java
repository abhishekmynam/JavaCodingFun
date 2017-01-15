package hackerRank30DayChallenges;
import java.util.*;

public class StackAndQueue {
	
	LinkedList<Character>  queueLL = new LinkedList<Character>();;
	LinkedList<Character> stacksLL = new LinkedList<Character>();;
	
	public void pushCharacter(char ch) {
		
		stacksLL.addFirst(ch);
		
	}	
	public void enqueueCharacter(char ch){
		
		queueLL.addLast(ch);
	} 
	public char popCharacter(){
		char res= (char) stacksLL.removeFirst();
		System.out.println(res);		//remove(stacksLL.size());
		return res;
	}
	public char dequeueCharacter(){
		char res=(char) queueLL.remove(0);
		System.out.println(res);
		return res;
	} 
	
	

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackAndQueue p = new StackAndQueue();
        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
