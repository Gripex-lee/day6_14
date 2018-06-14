package day6_14;

import java.util.Scanner;

public class A057 {
	public static void main(String[] args) {
		MyLinka list1=new MyLinka();
		MyLinkb list2=new MyLinkb();
		MyLinkAll list=new MyLinkAll();
		Scanner br=new Scanner(System.in);
        for(int i=0;i<4;i++) {
        	list1.addNode(br.nextInt());
        }
        for(int i=0;i<4;i++) {
        	list2.addNode(br.nextInt());
        }
        list1.printList();
        list2.printList();
        MyLinka.Node a=MyLinka.head;
        MyLinkb.Node b=MyLinkb.head;
        MyLinkAll.Node all=MyLinkAll.head;
        while(a!=null&&b!=null) {
        	list.addNode(a.data);
        	list.addNode(b.data);
        	a=a.next;
        	b=b.next;
        }
        list.printList();
	}
}
class MyLinka {
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
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
}
class MyLinkb {
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
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
}
class MyLinkAll {
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
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
}
