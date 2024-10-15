package application_algo_tableaux;

public class files {
	private int maxsize;
	private int []QueueArray;
	private int first;
	private int last;
	private int nbre;
	
	private files(int size) {
		maxsize=size;
		QueueArray=new int [maxsize];
		first=0;
		last=-1;
		nbre=0;
	}
	public boolean is_empty() {
		boolean est_vide= false;
		if(nbre==0) {
			est_vide=true;
			System.out.println("file vide");
		}
		return est_vide;
	}
	public boolean est_full() {
		boolean est_full= false;
		if(nbre==maxsize) {
			est_full=true;
			System.out.println("file pleine");
		}
		return est_full;
	}
	public void afficher() {
		for(int i=0; i<=nbre;i++) {
			System.out.println(QueueArray[(first + i) ]); 
		}
	
	}
	public void enfiler(int value) {
		if(est_full()) {
			System.out.println("file pleine");
		}
		last=(last+1);
		QueueArray[last]=value;
		nbre++;
		System.out.println(last + "last");
		System.out.println(first+ "first");
		
	}
	public void defiler() {
		if(is_empty()) {
			System.out.println("file vide");
		}
		first=(first+1);
		nbre--;
	}
	public static void main(String[] args) {
		files queue = new files(20);
		queue.enfiler(10);
	
		queue.enfiler(5);
		/*queue.defiler();
		queue.enfiler(9);
		queue.enfiler(2);
		queue.defiler();
		queue.enfiler(7);
	//	queue.afficher();
		
		queue.enfiler(8);
		queue.defiler();*/
		queue.afficher();
//
	}

}
