package com.projeto.estruturaDados;

import com.Models.NoExemploPilha;

public class Pilha {


    // ===================================================================== //
    // ####################### ESTRUTURA DE DADOS ########################## //
    // ===================================================================== //
    //                           PILHA EM JAVA                               //
    // ===================================================================== //



 private NoExemploPilha refEntradaPilha;

    public Pilha() {
        this.refEntradaPilha = null;
    }

    public NoExemploPilha top(){
        return refEntradaPilha;
    }

    public void push(NoExemploPilha novoNo){
        NoExemploPilha refAuxiliar = refEntradaPilha;
        refEntradaPilha = novoNo;
        refEntradaPilha.setRefNo(refAuxiliar);
    }

    public NoExemploPilha pop(){
        if(!this.isEmpty()){
            NoExemploPilha noPoped = refEntradaPilha;
            refEntradaPilha = refEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty(){
        return refEntradaPilha == null? true : false;
    }

 @Override
    public String toString(){
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";

        NoExemploPilha noAuxiliar = refEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "===========\n";
        return stringRetorno;
 }



    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new NoExemploPilha(1));
        minhaPilha.push(new NoExemploPilha(2));
        minhaPilha.push(new NoExemploPilha(3));
        minhaPilha.push(new NoExemploPilha(4));
        minhaPilha.push(new NoExemploPilha(5));
        minhaPilha.push(new NoExemploPilha(6));
        minhaPilha.pop();

        // ADICIONANDO
        minhaPilha.push(new NoExemploPilha(99));
        System.out.println(minhaPilha);


    }


}