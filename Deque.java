
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;    
    }
    public T pollLast(){
        if(tamanho == 0){
            return null;
        }
        T aux = elementos[tamanho - 1];
        elementos[tamanho - 1] = null;
        tamanho--;
            return aux;
    }
}