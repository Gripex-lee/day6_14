package day6_14;

public class A060 {
	public static void main(String[] args) {
		MyLink list=new MyLink();
		list.addNode(10);
		list.addNode(5);
		list.addNode(20);
		list.addNode(9);
		list.addNode(3);
		list.addNode(2);
		list.printList();
		list.head = list.mergeSort(list.head);
	    list.printList();
	}
}
class MyLink {
    public static Node head = null; // 头节点
    /**
     * 链表中的节点，data代表节点的值，next是指向下一个节点的引用
     */
    public class Node {
        public Node next = null;// 节点的引用，指向下一个节点
        public int data;// 节点的对象，即内容

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 向链表中插入数据
     */
    public void addNode(int d) {
        Node newNode = new Node(d);// 实例化一个节点
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {//将其放到末端
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }
    Node sortedMerge(Node a, Node b) {
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } 
        else{
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
    Node mergeSort(Node h) {
        if (h == null || h.next == null){
            return h;
        }
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;
        middle.next = null;
       
        Node left = mergeSort(h);
        Node right = mergeSort(nextofmiddle);
        Node sortedlist = sortedMerge(left, right);
        
        return sortedlist;
    }
    Node getMiddle(Node h){
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;
         
        while (fastptr != null){
            fastptr = fastptr.next;
            if(fastptr!=null){
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }
}