package hackerRank30DayChallenges;


public class LinkedListClass {
	nodeScratch  head;
	int count;
	
	public void LinkedList(nodeScratch nextNode){
		head = nextNode;
		count =1;
	}
	
	public void addNode (int newData){
		nodeScratch curData = new nodeScratch(newData);
		nodeScratch curAddr = head;
		while(curAddr.getNext()!=null){
			curAddr =curAddr.getNext();
		}
		curAddr.setNext(curData);
		count++;
	}
	
	public int getData (int index){
		
		if (index<0) return -1;
		
		nodeScratch curAddr = head;
		
		for(int i=0 ; i<index ; i++) curAddr = curAddr.getNext();
		
		return curAddr.getData();
	}
	
	public int size() {return count;}
	
	public boolean isEmpty() {return head==null;}
	
	public void remove(){
		nodeScratch curAddr= head;
		
		while (curAddr.getNext().getNext()!=null) curAddr=curAddr.getNext();
		
		curAddr.setNext(null);
		count--;
	}
	
	public static void main(String[] args){
		nodeScratch firstNode = new nodeScratch(123);
		LinkedListClass ll = new LinkedListClass();
		ll.LinkedList(firstNode);
		ll.addNode(1234);
		ll.addNode(12345);
		ll.addNode(123456);
		ll.addNode(1234567);
		ll.addNode(12345678);
		ll.addNode(123456789);
		ll.addNode(1234567890);
		
		
		
	}
}

