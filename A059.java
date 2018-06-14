package day6_14;

import java.util.Scanner;

public class A059 {
	public static void main(String[] args) {
		A059 list = new A059();
		Scanner br=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			list.addNode(br.nextInt());
		}
		int k=br.nextInt();
		br.close();
		int x=list.findElem(head, k).data;
		System.out.println(x);
	}
	
    static Node head = null; // 头节点
    /**
     * 链表中的节点，data代表节点的值，next是指向下一个节点的引用
     */
    class Node {
        Node next = null;// 节点的引用，指向下一个节点
        int data;// 节点的对象，即内容

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
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
    public Node findElem(Node head, int k) {
        if (k < 1 || k > this.length()) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k; i++)// 前移k步
            p1 = p1.next;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
