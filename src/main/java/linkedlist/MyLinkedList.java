package linkedlist;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/20 13:53
 */
public class MyLinkedList {

    class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;


    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.head = null;
    }

    public int size() {
        int count = 0;
        Node countNode = head;
        while (countNode != null) {
            countNode = countNode.next;
            count++;
        }
        return count;
    }


    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        //判断索引有效性
        if (index < 0 || index >= size()) {
            return -1;
        }
        Node cur = head;
        for (int i = 0; i < index && cur.next != null; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        //判断是不是第一个元素
        if (head == null) {
            head = new Node(val);
        } else {
            //注意
            Node newHead = new Node(val);
            newHead.next = head;
            head = newHead;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        //判断是不是第一个元素
        if (head == null) {
            head = new Node(val);
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(val);
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        int count = size();
        //判断index
        if (index <= 0) {
            addAtHead(val);
        } else if (index == count) {
            addAtTail(val);
        } else if (index < count) {
            Node cur = head;
            for (int i = 0; i < index - 1 && cur.next != null; i++) {
                cur = cur.next;
            }
            Node newNode = new Node(val);
            newNode.next = cur.next;
            cur.next = newNode;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        int count = size();
        if (index == 0) {
            head = head.next;
        } else if (index < count) {
            Node cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3, 0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        linkedList.get(4);
        linkedList.addAtHead(4);
        linkedList.addAtIndex(5, 0);
        linkedList.addAtHead(6);
//        linkedList.addAtTail(7);
//        linkedList.addAtHead(9);
//        linkedList.addAtTail(8);
//        linkedList.addAtHead(6);
//        linkedList.addAtHead(0);
//        linkedList.get(5);
//        linkedList.addAtHead(0);
//        linkedList.get(2);
//        linkedList.get(5);
//        linkedList.addAtTail(4);
        System.out.println();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

