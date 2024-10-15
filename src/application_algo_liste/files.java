package application_algo_liste;



class file {
    Node head; 
    
    public boolean est_vide() {
    	if(head.next==null) {
    		System.out.println("file vide");
    	}
    	return true;
    }
    	
    
    public void enfiler(int data) {
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
    public void defiler() {
     
     /*  if(est_vide()) {
System.out.println("file vide");
       }else {
    	   Node current=head;
    	   head=current.next;
       }*/
       Node current=head;
	   head=current.next;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Passage au nœud suivant
        }
        System.out.println("null");
    }

	public static void main(String[] args) {
	file NewNode = new file();
	NewNode.enfiler(4);
	NewNode.enfiler(8);
	NewNode.enfiler(9);
	NewNode.enfiler(2);
	NewNode.defiler();
	NewNode.defiler();
	NewNode.display(); 
	
	
	
	

	}

}
