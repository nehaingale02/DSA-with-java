// Node class representing each element in the linked list
class Node {
    int data;  // Data stored in the node
    Node next; // Pointer to the next node in the list

    // Constructor to create a new node with the given data
    Node(int data) {
        this.data = data;
        this.next = null; // Next is initially null, as there is no next node yet
    }
}

// reverseLL class representing the singly linked list
class reverseLL {
    Node head; // Head of the linked list

    // Method to reverse the linked list
    public void reverseList() {
        // If the list is empty or contains only one element, no need to reverse
        if (head == null || head.next == null) {
            return;
        }

        // Initialize pointers for traversal
        Node prevNode = head;     // Previous node starts as head
        Node currNode = head.next; // Current node starts as the second node

        // Traverse through the list and reverse the links
        while (currNode != null) {
            Node nextNode = currNode.next; // Store the next node temporarily
            currNode.next = prevNode;      // Reverse the current node's pointer

            // Move the pointers one step forward
            prevNode = currNode; // Update prevNode to be the current node
            currNode = nextNode; // Move to the next node in the list
        }

        head.next = null; // Set the old head's next to null (as it becomes the last node)
        head = prevNode;  // Update head to be the last node, which is now the first node
    }

    // Method to add a node with the given data at the end of the list
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty, make the new node the head
            head = newNode;
            return;
        }

        // Otherwise, traverse to the end of the list
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next; // Move to the next node
        }
        currNode.next = newNode; // Add the new node at the end of the list
    }

    // Method to print the elements of the list
    public void printList(){
        if(head == null){ // If the list is empty, print a message
           System.out.println("List is empty");
           return;
        }
        Node currNode = head; // Start with the head node
        while (currNode != null ){
           System.out.print(currNode.data + " --> "); // Print the current node's data
           currNode = currNode.next; // Move to the next node
        }
        System.out.println("NULL"); // Indicate the end of the list
    }

    // Main method to test the reverseLL class
    public static void main(String args[]){
        reverseLL list = new reverseLL(); // Create a new linked list

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3); // Elements are added at the end by default
        list.add(4);

        // Print the original list
        System.out.println("Original List:");
        list.printList();

        // Reverse the linked list
        list.reverseList();

        // Print the reversed list
        System.out.println("Reversed List:");
        list.printList();
    }
}

