
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

     public T obterERemoverPrimeiro() {
        if (tamanho == 0) {
            return null;
        }

        T primeiro = elementos[0];

        for (int i = 1; i < tamanho; i++) {
            elementos[i - 1] = elementos[i];
        }

        elementos[tamanho - 1] = null;

        tamanho--;

        return primeiro;
    }
}