/*
=====================================================
LINKED LIST IN JAVA (SLL + DLL) - DSA COMPLETE GUIDE
=====================================================

CONTENTS:
1. Singly Linked List (SLL)
2. Doubly Linked List (DLL)
3. Important Patterns
4. Interview Problems
=====================================================
*/

// =============================
// 1. SINGLY LINKED LIST (SLL)
// =============================

class SinglyLinkedList {

    // Node structure
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // =============================
    // INSERT OPERATIONS
    // =============================

    // Insert at beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        // Step 1: newNode -> head
        newNode.next = head;

        // Step 2: head -> newNode
        head = newNode;
    }

    // Insert at end
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // DRY RUN:
        // temp moves till last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at position (0-based index)
    public void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        // Move till position-1
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // =============================
    // DELETE OPERATIONS
    // =============================

    // Delete from beginning
    public void deleteAtHead() {
        if (head == null) return;

        head = head.next;
    }

    // Delete from end
    public void deleteAtTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Move till second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at position
    public void deleteAtPosition(int pos) {
        if (pos == 0) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    // =============================
    // SEARCH
    // =============================

    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }

        return false;
    }

    // =============================
    // REVERSE (IMPORTANT)
    // =============================

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // store next

            curr.next = prev; // reverse link

            prev = curr; // move prev
            curr = next; // move curr
        }

        return prev;
    }

    // =============================
    // MIDDLE OF LINKED LIST
    // =============================

    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // fast moves 2 steps, slow moves 1
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // =============================
    // CYCLE DETECTION (FLOYD)
    // =============================

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }

    // =============================
    // PRINT
    // =============================

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// =============================
// 2. DOUBLY LINKED LIST (DLL)
// =============================

class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete node
    public void delete(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {

                // Case 1: Head
                if (temp.prev == null) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                }

                // Case 2: Middle/End
                else {
                    temp.prev.next = temp.next;

                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }
                return;
            }
            temp = temp.next;
        }
    }

    // Print forward
    public void printForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// =============================
// 3. IMPORTANT PATTERNS
// =============================

/*
1. Fast & Slow Pointer
   - Find middle
   - Detect cycle

2. Reverse Linked List
   - Iterative (most asked)

3. Two Pointer
   - Remove nth from end

4. Merge Two Sorted Lists

5. Dummy Node Technique
   - Clean code for insertion/deletion
*/

// =============================
// 4. IMPORTANT INTERVIEW PROBLEMS
// =============================

class Problems {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Reverse Linked List (LC 206)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    // Merge Two Sorted Lists (LC 21)
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next;
    }

    // Remove Nth Node From End (LC 19)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}

/*
=============================
TIME COMPLEXITY SUMMARY
=============================
Insert: O(1) (head), O(n) (tail)
Delete: O(1) (head), O(n)
Search: O(n)

=============================
FINAL INTERVIEW TIPS
=============================
✔ Always draw diagram
✔ Handle edge cases (null, single node)
✔ Use dummy node when confused
✔ Practice dry runs

=============================
END OF FILE 🚀
=============================
*/
