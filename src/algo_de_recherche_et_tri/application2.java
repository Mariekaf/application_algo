package algo_de_recherche_et_tri;

public class application2 {
	public static int rech_seq(int T[],int val) {
		
		for(int i=0;i<T.length;i++) {
			if(T[i]==val) {return i+1;
			}
		}
		return -1;
	}
	public static int rech_dich(int T[],int val) {
		int min=0;
		int max=T.length-1;
		int mil=(min+max)/2;
		while(val!=T[mil ]&& min<=max) {
			mil=(min+max)/2;
			if(val<T[mil]) {
				max=mil-1;
			}else {
				min=mil+1;
			}
			if(val==T[mil]) {return mil+1;}
		}
		return -1;
	}
	public static int rech_dich_rec(int T[],int val,int min,int max) {
	
		int mil=(min+max)/2;
		if(val==T[mil]) {return mil+1;}else {
			if(val<T[mil]) {
			
				return rech_dich_rec(T, val, 0,mil-1);
			}else if(val>T[mil]) {
			
				return rech_dich_rec(T, val, mil+1,T.length-1);
			}
			
		}  
		return -1;
	}

	public static void afficher2(int T[],int val) {
		int position= rech_dich( T, val);
		if(position!=-1) {
			System.out.println("la valeur"+" "+val+" "+"se trouve à la position"+" "+position);
		}else {System.out.println("la valeur n2 se trouve pas dans le tableau");}
	}
	public static void afficher3(int T[],int val) {
		int position= rech_dich_rec( T, val,0,T.length-1);
		if(position!=-1) {
			System.out.println("la valeur"+" "+val+" "+"se trouve à la position"+" "+position);
		}else {System.out.println("la valeur n2 se trouve pas dans le tableau");}
	}
		
		
	
	public static void afficher(int T[],int val) {
		int position= rech_seq( T, val);
		if(position!=-1) {
			System.out.println("la valeur"+" "+val+" "+"se trouve à la position"+" "+position);
		}else {System.out.println("la valeur nr se trouve pas dans le tableau");}
	}
	public static void main(String[] args) {
	int T[]={1,2,3,4,5,6,7,8,9};
	
	afficher(T, 6);
	afficher2(T, 6);
	afficher3(T, 6);
	}
}
