package LinkedList;
 public class pooja {   
    public static void display(Node head){ 
    Node temp=head; 
while(temp!=null){ 
    System.out.println(temp.data+" " ); 
    temp=temp.next;
} System.out.println();
    }   
public static Node insertAtHead(Node head,int x){ 
    Node t=new Node(35); 
    t.next=head; 
    head.prev=t; 
    head=t; 
    return head;
}  
public static boolean isPalindrome(Node head,Node tail){ 
    Node h=head; 
    Node t=tail; 
     while(h!=t){ 
        if(h.data!=t.data) 
        return false; 
        h=h.next; 
        t=t.prev;
     } return true;

    }


//public static void insertAtTail(Node tail,int x){ 
  //  Node t=new Node(90); 
//tail.next=t;  
//t.prev=tail; 
//tail=t;  
//return tail;/

//}
 public static void displayreverse(Node tail){ 
        Node temp=tail; 
        while(temp!=null){ 
            System.out.println(temp.data ) ;
            temp=temp.prev; 
        }  
    
    System.out.println();
    
    }  
    /////// occupied more space;
     public static void displayrandom(Node random){ 
        Node temp=random; 
        while(temp.prev!=null){ 
            temp=temp.prev;
        } 
        while(temp!=null){  
            System.out.println(temp.data ) ;
            temp=temp.next; 

        }

     }
    public static class Node{ 
        int data; 
        Node next; 
        Node prev; 
    Node(int data){ 
        this.data=data;
    }}
    
         public static void main(String[] args) { 
       Node a=new Node(1);  
       Node b=new Node(2);  
       Node c=new Node(3);  
       Node d=new Node(3); 
       Node e=new Node(2);  
       Node f=new Node(1);   
       a.next=b; 
       b.prev=a; 
       b.next=c; 
       c.prev=b; 
       c.next=d;  
       d.prev=c;
       d.next=e;  
       e.prev=d;
       e.next=f; 
       f.prev=e; 
       f.next=null;
       
//display(a); 
//displayreverse(f);
//displayrandom(c); 
//Node newHead=insertAtHead(a,30); 
//display(newHead); 
//Node newHead=insertAtTail() 
System.out.print(isPalindrome(a,f));

    }
}

