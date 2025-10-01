
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    public T removerUltimoElemento() {
        T t = null;
        try {
            t = elementos[tamanho - 1];
        } catch(Exception e) {
            System.out.println("O array está vazio");
            System.out.println("Erro: " + e.getMessage());
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        return t;
    }
}