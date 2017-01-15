package hackerRank30DayChallenges;

public class GenericsPrinting {
	public static <t> void printArray(t[] arrayParam){
		for (t element:arrayParam ) System.out.print(element+" ");
		System.out.println();
	}
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
