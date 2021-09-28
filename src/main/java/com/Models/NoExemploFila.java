package com.Models;

public class NoExemploFila {

    private Object object;
    private NoExemploFila refNo;

    public NoExemploFila(){

    }

    public NoExemploFila(Object object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoExemploFila getRefNo() {
        return refNo;
    }

    public void setRefNo(NoExemploFila refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoExemploFila{" +
                "object=" + object +
                ", refNo=" + refNo +
                '}';
    }
}
