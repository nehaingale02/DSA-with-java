//Linkedlist is created from scratch first ,functions performed are insertion , deletion , traversal , print 
class LL{
   Node head;

   private int size;
   LL(){  // CONSTRUCTOR FOR SIZE OF LINKED LIST
      this.size = 0;
   }
   class Node {
      String data;
      Node next;

       // creating node
      Node(String data){ 
         this.data = data;
         this.next = null;
         size++;
      }
   }

   //add first
   public void addFirst(String data){
      Node newNode =  new Node(data);
      if(head == null){
         head = newNode;
         return;
      } 
      newNode.next = head;
      head = newNode;
      
   }

   //add last
   public void addLast(String data){
      Node newNode =  new Node(data);
      if(head == null){
         head = newNode;
         return;
      } 
      Node currNode = head;
      while (currNode.next != null ){
         currNode = currNode.next; //traversing the list 
      }
      currNode.next = newNode;
   }
   public void printList(){
      if(head == null){
         System.out.println("list is empty");
         return;
      }
      Node currNode = head;
      while (currNode != null ){
         System.out.print(currNode.data + " --> ");
         currNode = currNode.next;
      }
      System.out.println("NULL");
   }
   //delete first
   public void delFirst(){
      if(head == null){
         System.out.println("list is empty");
         return;
      } 
      size--;
      head = head.next;
   }
   //delete lastnode

   public void delLast(){
      if(head == null){
         System.out.println("list is empty");
         return;
      } 
      size--;
      if(head.next == null){
         head = null ;
         return;
      }
      
      Node secondLast = head;  // intially my head is pointing to secondlast poiner
      Node lastNode = head.next; // n last node pointer to next of head 
      while (lastNode.next != null ){ 
         lastNode = lastNode.next; // update or traverse
         secondLast = secondLast.next; // update or traversse in list 

      } 
      secondLast.next = null; // secondlast node ka next ko null point kiya so lastnode is deleted

   }

   public int getSize(){
      return size;
   
   }
   public static void main(String[] args) {
      LL list = new LL();
      list.addFirst("a");
      list.addFirst("is");
      list.printList();
      list.addLast("list");
      list.printList();
      list.addFirst("this");
      list.printList();

      list.delFirst();
      list.printList();
      list.delLast();
      list.printList();
      list.addFirst("this");
      list.printList();
      System.out.println(list.getSize());
   }
}