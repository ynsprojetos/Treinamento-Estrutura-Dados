package com.projeto.estruturaDados;

import com.Models.NoExemploFila;

public class Fila {

    private NoExemploFila refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public boolean isEmpty(){
        return refNoEntrada == null? true : false;
    }

    public NoExemploFila first(){
        if (!this.isEmpty()){
         NoExemploFila primeiroNo = refNoEntrada;
         while (true){
             if(primeiroNo.getRefNo() != null){
                 primeiroNo = primeiroNo.getRefNo();
             }else{
                 break;
             }
           }
        }
        return null;
    }

    public NoExemploFila dequeue(){
        if (!this.isEmpty()){
            NoExemploFila primeiroNo = refNoEntrada;
            NoExemploFila noAuxiliar = refNoEntrada;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = noAuxiliar;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public void enqueue(NoExemploFila novoNo){
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    @Override
    public String toString() {
      String retorno = "";
      NoExemploFila noAuxiliar = refNoEntrada;

      if (refNoEntrada != null){
          while (true){
              retorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ---->";
              if (noAuxiliar.getRefNo() != null){
                  noAuxiliar = noAuxiliar.getRefNo();
              }else{
                  retorno += "null";
                  break;
              }
          }
      }else{
          retorno = "null";
      }

      return retorno;
    }






    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        minhaFila.enqueue(new NoExemploFila("primeiro"));
        minhaFila.enqueue(new NoExemploFila("segundo"));
        minhaFila.enqueue(new NoExemploFila("terceiro"));
        minhaFila.enqueue(new NoExemploFila("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);
    }


}
