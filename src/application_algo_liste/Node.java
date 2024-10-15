package application_algo_liste;

class Node {
    int data; // Donnée du nœud
    Node next; // Référence au nœud suivant
    Node prev;

    // Constructeur
    Node(int data) {
        this.data = data;
        this.next = null;
      
    }
}
class LinkedList {
    Node head; // Premier nœud de la liste

    // Méthode pour ajouter un nœud à la fin de la liste
    public void add_fin(int data) {
       Node NewNode=new Node(data);
       if(head==null) {
    	   head=NewNode;
       }else {
    	   Node current=head;
    	   int index=0;
    	   while(current.next!=null) {
    		   current=current.next;
    		   index++;
    	   }
    	  NewNode.next=null;
    	  current.next=NewNode;
       }
    }
    

    // Méthode pour ajouter un nœud en debut de la liste
    public void add_deb(int data) {
       Node NewNode= new Node(data);
       if(head==null) {
    	   head=NewNode;
       }else {
    	   NewNode.next=head;
    	   head=NewNode;
       }
    }
    // Méthode pour ajouter un nœud au milieu de la liste
    public void add_mil(int data,int position) {
       Node NewNode= new Node(data);
       if(head==null) {
    	   head=NewNode;
    	  
       }else {
    	   if (position == 0) {
               NewNode.next = head;
               head = NewNode;
              
           }
    	   Node current=head;
    	   if (current == null) {
               System.out.println("Position hors limites, ajout à la fin de la liste.");}
    	  
    	 int i=0;
		while(i<position-1 && current.next!=null) {
			current=current.next;
    		 i++;
    	 }  
		NewNode.next=current.next;
		current.next=NewNode;
       }
    }
    // Méthode pour afficher la liste
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Passage au nœud suivant
        }
        System.out.println("null");
    }
 // Méthode pour supprimer le premier element de la liste
    public void free_deb() {
 
        if(head==null) {
     	  System.out.println("la liste est vide");
        }else {
        	 Node current=head;
        	 head=current.next;
        }
    }
    public void free_fin() {
    	 
        if(head==null) {
     	  System.out.println("la liste est vide");
        }else {
        	Node current=head;
            Node previous=null;
        	int index=0;
     	   while(current.next!=null) {
     		   previous=current;
     		   current=current.next;
     		   index++;
     	   }
     	previous.next=null;
        }
    }
    public void free_data(int data) {
    	Node current=head;
    	Node previous=null;
    	int index=1;
    	while(current!=null && current.data!=data) {
    		previous=current;
    		current=current.next;
    		index ++;
    	}
    	previous.next=current.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add_fin(10);
        list.add_fin(20);
        list.add_fin(30);
        list.add_deb(5);
        list.add_mil(38,2);
        list.add_fin(90);
        list.add_deb(72);
        list.add_mil(12,2);
        list.add_fin(40);
        list.add_deb(9);
        list.add_mil(29,9);
       list.free_deb();
       list.free_data(10);
      list.free_fin();
        
        list.display(); 
    }
}