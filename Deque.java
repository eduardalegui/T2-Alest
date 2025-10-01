
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    public void addLast(T elemento) {
        
        if (tamanho == elementos.length) {
            throw new IllegalStateException("Deque está cheia!");
        }
        
        elementos[tamanho] = elemento;
        tamanho++;
    }

}