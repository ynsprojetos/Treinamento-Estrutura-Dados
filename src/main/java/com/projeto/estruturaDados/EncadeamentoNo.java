package com.projeto.estruturaDados;
import com.Models.no;

public class EncadeamentoNo {
    public static void main(String[] args) {

        // ===================================================================== //
        // ####################### ESTRUTURA DE DADOS ########################## //
        // ===================================================================== //
        //                     ENCADEAMENTO DE NÓ EM JAVA                        //
        // ===================================================================== //


        no no1 =  new no("conteudo no1");

        no no2 =  new no("conteudo no2");

        no1.setProximoNo(no2);

        no no3 =  new no("conteudo no3");
        no2.setProximoNo(no2);

        no no4 =  new no("conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
    }
}
