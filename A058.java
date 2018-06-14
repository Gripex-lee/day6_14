package day6_14;

import java.util.Scanner;

public class A058 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		A058 list = new A058();
		for(int i=0;i<5;i++) {
			list.addNode(br.nextInt());
		}
        list.ReverseIteratively(head);
        list.printList();
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

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
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
    public Node ReverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;//第二轮：pNext=head.next.next
            if (pNext == null) {  //如果到最后了就把头与之调换
                pReversedHead = pNode;
            }
            pNode.next = pPrev;  //pNode.next=null
            pPrev = pNode;       //pPrev=head
            pNode = pNext;       //pNode=head.next
        }
        this.head = pReversedHead;
        return this.head;
    }
}
