public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    public Deque() {
        elementos = (T[]) new Object[10];
        tamanho = 0;
    }

    
}