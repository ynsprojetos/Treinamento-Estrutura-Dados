package com.projeto.estruturaDados;

import com.Models.MeuObj;

public class AtribuicaoReferencia {

    public static void main(String[] args) {


        // ===================================================================== //
        // ####################### ESTRUTURA DE DADOS ########################## //
        // ===================================================================== //
        //                  ATRIBUIÇÃO E REFERÊNCIA EM JAVA                      //
        // ===================================================================== //

        int a = 1;
        int b = a;


        System.out.println("int a = " + a + " int b = " + b);
        a = 2;
        System.out.println("int a = " + a + " int b = " + b);

         MeuObj objA =  new MeuObj(1);
         MeuObj objB = objA;

        System.out.println("OBJETO A: " + objA + "  -  " + "OBJETO B: " + objB);
        objA.setNum(2);
        System.out.println("OBJETO A: " + objA + "  -  " + "OBJETO B: " + objB);

        // ===================================================================== //


        // ===================================================================== //
    }
}
