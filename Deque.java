import java.util.Arrays;

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
           @SuppressWarnings("unchecked")
    public T removerPrimeiroElemento(){
        if (tamanho == 0) {
            throw new IllegalArgumentException("Array vazio");
        }
        T elementoRemovido = elementos[0];

      public T removeLast() {
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
    ultimoElemento = elementos[ultimaPosicao];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage() + ". A deque está vazia.");
        }

        return ultimoElemento;
    }

} 

public T visualizarPrimeiroElemento() {
        if (tamanho == 0) {
            throw new IllegalStateException("Deque vazio");
        }
        return elementos[0];
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
  
      public void addLast(T elemento) {
        
        if (tamanho == elementos.length) {
            throw new IllegalStateException("Deque está cheia!");
        }
        
        elementos[tamanho] = elemento;
        tamanho++;
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
  
    public T getFirst() {
        if(tamanho == 0) {
            throw new IllegalArgumentException("Array está vazio");
        }
        return elementos[0];
    }
