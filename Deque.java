
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    public boolean InsercaoPrimeiraPosisao(T dado) {
        if(tamanho == 145) {
            return false;
        }
        for(int i = 0; i <= tamanho; i++) {
            T d = elementos[i];
            elementos[0] = dado;
            elementos[i + 1] = d;
        }
        tamanho++;
        return true;
    }
}