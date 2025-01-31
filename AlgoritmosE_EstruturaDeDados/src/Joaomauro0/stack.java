package Joaomauro0;

public class stack {
    private int[] stack;
    private int top;

    // Construtor para inicializar a pilha com tamanho fixo
    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    // Método push: adiciona um elemento ao topo da pilha
    public void push(int value) {
        if (top == stack.length - 1) {
            throw new StackOverflowError("A pilha está cheia!");
        }
        stack[++top] = value;
    }

    // Método pop: remove e retorna o elemento do topo da pilha
    public int pop() {
        if (top == -1) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return stack[top--];
    }

    // Método para exibir o estado da pilha
    public void display() {
        if (top == -1) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.print("Estado da pilha: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Testando a pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Deve exibir 10, 20, 30

        System.out.println("Elemento removido: " + stack.pop()); // Deve remover 30
        stack.display(); // Deve exibir 10, 20
    }
}
