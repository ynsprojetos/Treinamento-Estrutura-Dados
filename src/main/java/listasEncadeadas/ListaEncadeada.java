package listasEncadeadas;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

                if(this.isEmpty()){
                    referenciaEntrada = novoNo;
                    return;
                }

                No<T> noAuxiliar = referenciaEntrada;
                for (int i = 0; i < this.size()-1; i++){
                    noAuxiliar = noAuxiliar.getProximoNo();
                }

                noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i< this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }


    public int size(){
        int tamanhoLista = 0;

        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public void validaIndice(int index){
        if (index >= size()){
            throw new IndexOutOfBoundsException("não existe conteudo no indice nformado.");
        }
    }

}
