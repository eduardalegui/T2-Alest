import java.util.Arrays;

public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    public Deque() {
        elementos = (T[]) new Object[10];
        tamanho = 0;
    }

    public void adicionarRegistro(T dado) {
        if (tamanho == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        elementos[tamanho++] = dado;
    }

    public int getTamanho() {
        return tamanho;
    }

    public T getElementos(int i) {
        return elementos[i];
    }
}