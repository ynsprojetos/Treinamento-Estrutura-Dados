package com.projetoNo;

public class no {
  private String conteudo;

    public no(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(no proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo='" + conteudo + '\'' +
                ", proximoNo=" + proximoNo +
                '}';
    }

    public no getProximoNo() {
        return proximoNo;
    }

    private no proximoNo;
}
