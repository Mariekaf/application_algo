package application_algo_tableaux;

public class piles {
	
		private int maxsize;
		private int []QueueArray;
		private int first;
		private int last;
		private int nbre;
		
		private piles(int size) {
			maxsize=size;
			QueueArray=new int [maxsize];
			first=-1;
		
			nbre=0;
		}
		public boolean is_empty() {
			boolean est_vide= false;
			if(nbre==0) {
				est_vide=true;
				System.out.println("pile vide");
			}
			return est_vide;
		}
		public boolean est_full() {
			boolean est_full= false;
			if(nbre==maxsize) {
				est_full=true;
				System.out.println("pile pleine");
			}
			return est_full;
		}
		public void afficher() {
			for(int i=0; i<=nbre;i++) {
				System.out.println(QueueArray[( i) ]); 
			}
		
		}
		public void depiler() {
			if(is_empty()) {
				System.out.println("file pleine");
			}
			first=(first-1);
			
			nbre--;
		}
		public void empiler(int value) {
			if(est_full()) {
				System.out.println("file vide");
			}
			first++;
			QueueArray[first]=value;
			nbre++;
		}
		public static void main(String[] args) {
			piles P1 = new piles(20);
			P1.empiler(10);
		
			P1.empiler(5);
		    P1.depiler();
			P1.empiler(9);
			P1.empiler(2);
			P1.depiler();
			P1.empiler(7);
		//	P1.afficher();
			
			P1.empiler(8);
			P1.depiler();
			P1.depiler();
			P1.afficher();
	//
		}

	}

