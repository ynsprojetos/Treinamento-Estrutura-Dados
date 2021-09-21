package com.projetoNo;

public class Main {
    public static void main(String[] args) {
        no no1 =  new no("no1");

        no no2 =  new no("no2");

        no1.setProximoNo(no2);

        no no3 =  new no("no3");
        no2.setProximoNo(no2);

        no no4 =  new no("no4");
        no3.setProximoNo(no4);

        System.out.println(no1);

    }
}
