package com.Models;

public class NoExemploPilha {

    private int dado;
    private NoExemploPilha refNo = null;

    public NoExemploPilha() {
    }

    public NoExemploPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoExemploPilha getRefNo() {
        return refNo;
    }

    public void setRefNo(NoExemploPilha reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "NoExemploPilha{" +
                "dado=" + dado +
                '}';
    }
}
