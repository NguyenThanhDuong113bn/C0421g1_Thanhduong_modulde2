package _10_dsa_danh_sach.baitap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

public class MyLinkedList<E> {
    private class   Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;          //phan tu dau tien cua danh sach
    private int numNodes = 0;    //so luong phan tu trong danh sach

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        //Khai bao 1 bien la temp tro den gia tri head
        Node temp = head;
        //Bien head se nhan gia trị là 1 Node moi
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        temp.next.next = null;
        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException(" Error index :" + index);
        }
        Node temp = head;
        Object data;

        if (index == 0) {
            data = temp.data;
            head = head.next;

        } else {
            for (int i = 0; i < index -1  && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;

        }
        numNodes--;
        return (E) data;

    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);

            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }

        }

        return false;
    }
}



