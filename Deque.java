
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    public T getFirst() {
        if(tamanho == 0) {
            throw new IllegalArgumentException("Array está vazio");
        }
        return elementos[0];
    }

}