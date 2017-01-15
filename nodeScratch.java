package hackerRank30DayChallenges;


	public class nodeScratch{
		nodeScratch next;
		int data;
		
		public nodeScratch(int newData){
			data = newData;
			next = null;
		}
		public nodeScratch(int newData, nodeScratch nextNode){
			data = newData;
			next = nextNode;
		}
		public nodeScratch getNext() {
			return next;
		}
		public void setNext(nodeScratch next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
	}
