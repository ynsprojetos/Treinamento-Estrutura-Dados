package com.Models;

public class no {

    private String conteudo;
    private no proximoNo;

    public no(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public no getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(no proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
