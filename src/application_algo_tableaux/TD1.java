package application_algo_tableaux;

public class TD1 {
public static int  nbre_occ(int T[],int n) {
	int nbre_occ=0;
	int i;
	for(i=0;i<T.length;i++) {
		if(T[i]==n) {
			nbre_occ=nbre_occ+1;
		}
	}
	System.out.println("le nombre d'occurence de"+" "+n+" "+"est"+" "+nbre_occ);
	return nbre_occ;
}
public static float  moyenne(int T[]) {
	
	int somme=0;
	float moyenne=0.0f;
	int i;
	for(i=0;i<T.length;i++) {
		somme=somme+T[i];
	}
	moyenne=(float)somme/T.length;
	System.out.println("la moyenne du taleau est"+" "+moyenne);
	return moyenne;
	
}
public static int minimum(int T[]) {
	
	int i;
	int min=T[1];
	for(i=1;i<T.length;i++) {
		if(min>T[i]) {
			min=T[i];
		}
	}
	System.out.println("le minimun du taleau est"+" "+min);
	return min;
	
}
public static boolean est_triée(int T[]) {
	int i;
	boolean est_triée=false;
	for(i=1;i<T.length-1;i++) {
		if(T[i]<=T[i+1]) {
			est_triée=true;
		}else{est_triée=false;}
	}
	System.out.println(est_triée);
	return est_triée;
	
}
public static int prod_vect(int A[],int B[]) {
	int i,j;
	int prod=0;
	for(i=1;i<A.length-1;i++) {
		for(j=1;j<B.length-1;j++) {
			prod=prod+(A[i]*B[j]);
		}
	}
	System.out.println("le produit des deux vecteur est"+" "+prod);
	return prod;
}
public static void find(int a, int b, int c) {
    int nbre1, nbre2;
    for (a = 0; a <= 10; a++) {
        for (b = 0; b <= 10; b++) {
            for (c = 0; c <= 10; c++) {
                nbre1 = (a * a * a + b * b * b + c * c * c);
                nbre2 = a * 100 + b * 10 + c;

                if (nbre1 == nbre2) {
                    System.out.println("Values: a = " + a + ", b = " + b + ", c = " + c);
                }
            }
        }
    }
}


public static String[] decalage(String D[]) {
    if (D.length == 0) {
        return D; 
    }
    System.out.println("Tableau original :");
    for (String s : D) {
        System.out.println(s);
    }
   String temp = D[0];

    for (int i = 0; i < D.length - 1; i++) {
        D[i] = D[i + 1];
    }

    D[D.length - 1] = temp;
    System.out.println("Tableau modifié :");
    for (String s : D) {
        System.out.println(s);
    }

    return D; 
}
public static int prod_mat(int E[][],int F[][], int[][] prod) {
	int i,j,k;
	
	if (E.length!=F.length) {
		System.out.println("les deux tableaux doivent avoir la meme dimention");
	}
	for (i = 0; i < E.length ; i++) {
		for (j = 0; j < E.length ; j++) {
			
			prod[i][j]=0;
			for (k = 0; k<E.length; k++) {
				prod[i][j]+=E[i][k]*F[k][j];
			}
		}
	}
	 System.out.println("le produit des deux matrice est :");
	
	        System.out.print(prod[0][0]);
	        System.out.print(" ");
	        System.out.print(prod[0][1]);
	        System.out.print(" ");
	        System.out.print(prod[0][2]);
	        System.out.println(" ");
	        System.out.print(prod[1][0]);
	        System.out.print(" ");
	        System.out.print(prod[1][1]);
	        System.out.print(" ");
	        System.out.print(prod[1][2]);
	        System.out.println(" ");
	        System.out.print(prod[2][0]);
	        System.out.print(" ");
	        System.out.print(prod[2][1]);
	        System.out.print(" ");
	        System.out.print(" ");
	        System.out.print(prod[2][2]);
	        
	        System.out.print(" ");
	  
	return prod [2][1];
	
}
public static int ecart(int T[],int H[]) {
	int i,j;
	int max=0;
	for (i = 0; i < H.length ; i++) {
		H[i]=0;
	}
	for (i = 0; i < T.length-1 ; i++) {
		H[i]=T[i+1]-T[i];

		H[H.length-2]=T[T.length-2]-T[T.length-1];
		if(H[i]<0) {
			H[i]=H[i]*(-1);
		}
	}
	
	
	for (i = 0; i < H.length ; i++) {
		
		if(max<H[i]) {
			max=H[i];
		}
	}
	System.out.println("le plus grand ecart entre deux nombre consecutif est"+" "+max);
	return max;
}

	public static void main(String[] args) {

int T[]=new int [10];
int H[]=new int [10];
int A[]={1,5,6};
int B[]={4,9,5};
int C[]= {1,1,1}; 
int E[][]= {{1,5,6},{4,9,5},{1,3,5}};
int F[][]= {{4,7,6},{2,8,5},{4,9,5}};
int G[][]= {{0,0,0},{0,0,0},{0,0,0}};
String D[]= {"A","B","C","D","E"};

T[1]=1;
T[2]=2;
T[3]=112;
T[4]=3;
T[5]=1;
T[6]=1;
T[7]=4;
T[8]=2;
T[9]=1;

nbre_occ(T,1);
moyenne(T);
minimum(T);
est_triée(T);
prod_vect(A,B);
//find(1,1,1);
decalage(D);
prod_mat(E,F,G);
ecart(T,H);
	}

}
