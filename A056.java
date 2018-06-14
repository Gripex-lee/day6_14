package day6_14;

import java.util.Scanner;

public class A056 {
	public static void main(String[] args) {
		Link list = new Link();
		Scanner br=new Scanner(System.in);
        for(int i=0;i<7;i++) {
        	list.addNode(br.nextInt());
        }
        list.printList();
        list.printOddList();
        list.printEvenList();
	}
}
class Link {
    public static Node head = null; // 头节点
    /*
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
    public void printOddList() {//奇数
    	Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            if(tmp.next!=null) {
            	tmp = tmp.next;
            }
            tmp=tmp.next;
        }
        System.out.println("null");
    }
    public void printEvenList() {//偶数
    	Node tmp = head.next;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            if(tmp.next!=null) {
            	tmp = tmp.next;
            }
            tmp=tmp.next;
        }
        System.out.println("null");
    }
}