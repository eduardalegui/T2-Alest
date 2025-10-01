
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
