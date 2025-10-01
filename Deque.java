
public class Deque<T> {
    private T[] elementos; // Array que armazena os dados
    private int tamanho; // Quantidade de elementos na lista

    @SuppressWarnings("unchecked")
    public Deque() {
        elementos = (T[]) new Object[145];
        tamanho = 0;
    }

    public T retornaUltimoElemento(){
        T ultimoElemento = null;
        
        try{
            int ultimaPosicao = tamanho - 1;

            ultimoElemento = elementos[ultimaPosicao];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage() + ". A deque está vazia.");
        }

        return ultimoElemento;
    }

} 