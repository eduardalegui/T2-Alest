
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    public void inserirNaPrimeiraPosicao(T dado){
        if(tamanho == 145){
            throw new ArrayIndexOutOfBoundsException("Array está cheia");
        }
        for(int i = 0; i<=tamanho; i++){
            T a = elementos[i];
            elementos[0]=dado;
            elementos[i+1]= a;
        }
        tamanho++;
    }
}