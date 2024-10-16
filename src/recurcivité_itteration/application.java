package recurcivité_itteration;

public class application {

	
	public static int somme(int a, int b) {
		
		for(int i=1;i<=b;i++) {
			a=a+1;
		}
		System.out.println("la somme est"+a);
		return a;
	}

	public static int somme2(int a, int b) {
		do
			a=a+1;
		while(b--!=1);
		System.out.println("la somme est"+" "+a+" "+b);
		return a;
	}
	public static int somme_rec(int a, int b) {
		if(b==0) {
			System.out.println("la somme est"+a);
			return a;
		}else {
			return somme_rec(a+1,b-1);
		}
		
	}
	public static int facto(int n) {
		int fact=1;
		int a=n;
		if(a==0||a==1) {
			return a;
		}else {
			
			for(int i=1;i<=a;i++) {
				
				fact=fact*i;
				
				
			
			}
		
		}
		System.out.println("le factoriel de"+" "+n+" "+"est"+" "+fact );
		return fact;
	}
	public static int facto2(int n) {
		int fact=1;
		int a=n;
		if(a==0||a==1) {
			return a;
		}else {
			
			for(int i=n;i>1;i--) {
				
				fact=fact*i;
			
			
			}
		
		}
		System.out.println("le factoriel de"+" "+n+" "+"est"+" "+fact );
		return fact;
	}
	public static int facto_rec(int n) {
		int fact=1;
		if(n==0||n==1) {
			return 1; 
		}else {
			
			fact=facto_rec(n-1)*n;
				
			
		
		}
		System.out.println("le factoriel de"+" "+n+" "+"est"+" "+fact );
		return fact;
	}
	public static boolean premier(int n) {
	
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
				
			}
			return true;
			
		
	}
	public static int somme_carre_premier(int n) {
		int som=0;
		for(int i=1;i<=n;i++) {
			if(premier(i)) {
				
				System.out.println("i:"+i);
				som =som+(i*i);
				int a=i*i;
				System.out.println("i*i="+a);
				System.out.println("som"+som);
			}
			
		}
		System.out.println(som);
		return n;
	}
	public static boolean premier(int n,int i) {
		 i=(int) Math.sqrt(n);
		while(i>1) {
			if(n==1) {
				return true;
			}else {
				if(n%i==0) {
					return false;
				}
				premier(n,i-1);
			}
		}
		return true;
	}
	 
	public static void afficher(int n) {
		int i=1;
		if(premier(n,i)) {
			System.out.println("il s'agit d'un nombre peremier");
		}else{System.out.println("il ne s'agit pas d'un nombre premier");}
		
	}

	
	public static void main(String[] args) {
		somme(2,5);
		somme2(2,5);
		somme_rec(2,5);
		facto(12);
		facto2(12);
		facto_rec(12);
		somme_carre_premier(9);
		afficher(3);
		

	}

}
