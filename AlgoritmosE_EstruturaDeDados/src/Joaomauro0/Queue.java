public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Construtor para inicializar a fila com tamanho fixo
    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Método enqueue: adiciona um elemento ao final da fila
    public void enqueue(int value) {
        if (size == queue.length) {
            throw new RuntimeException("A fila está cheia!");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    // Método dequeue: remove e retorna o elemento do início da fila
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("A fila está vazia!");
        }
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    // Método para exibir o estado da fila
    public void display() {
        if (size == 0) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.print("Estado da fila: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Testando a fila
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.display(); // Deve exibir 5, 10, 15

        System.out.println("Elemento removido: " + queue.dequeue()); // Deve remover 5
        queue.display(); // Deve exibir 10, 15

        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(30);
        queue.display(); // Deve exibir 10, 15, 20, 25, 30
    }
}
