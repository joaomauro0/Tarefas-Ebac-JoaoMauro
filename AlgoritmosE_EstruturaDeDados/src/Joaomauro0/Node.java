class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;

    // Construtor
    public LinkedList() {
        this.head = null;
    }

    // Método push: adiciona um nó ao fim da lista
    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Método pop: remove e retorna o nó no fim da lista
    public int pop() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia!");
        }

        if (head.next == null) {
            int value = head.data;
            head = null;
            return value;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        int value = temp.next.data;
        temp.next = null;
        return value;
    }

    // Método para exibir o estado da lista
    public void display() {
        if (head == null) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.print("Estado da lista: ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Testando a lista encadeada
        list.push(1);
        list.push(2);
        list.push(3);
        list.display(); // Deve exibir 1 -> 2 -> 3 -> null

        System.out.println("Elemento removido: " + list.pop()); // Deve remover 3
        list.display(); // Deve exibir 1 -> 2 -> null
    }
}
