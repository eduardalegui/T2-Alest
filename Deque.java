import java.util.Arrays;

public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    @SuppressWarnings("unchecked")
    public T removerPrimeiroElemento(){
        if (tamanho == 0) {
            throw new IllegalArgumentException("Array vazio");
        }
        T elementoRemovido = elementos[0];

        T[] novoArray = Arrays.copyOfRange(elementos, 1, elementos.length);
        elementos = novoArray;
        tamanho--;

        return elementoRemovido;
    }
}
/* Não sei se a melhor abortagem é essa, que remove completamente, ou apenas nullificar 
o primeiro elemento, como em: (sem contar o lançamento de excessão)

T elementoRemovido = elementos[0];
elementos[0] = null;
tamanho--;
return elementoRemovido;

*/