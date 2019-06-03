package com.company;

public class Celular {
    private static int idCount=0;
    private int id;
    private String modelo;
    private String marca;
    private int numero;

    public Celular(String modelo, String marca, int numero){
        this.id=getIdCount();
        setModelo(modelo);
        setMarca(marca);
        setNumero(numero);
    }

    public int getId() {
        return id;
    }

    public static int getIdCount() {
        idCount++;
        return idCount;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        String message="CELULAR\nId: %d\nModelo: %s\nMarca:%s\nNumero: %d";

        return String.format(message,getId(),getModelo(),getMarca(),getNumero());
    }

    @Override
    public boolean equals(Object obj){
        boolean equals=false;
        if(obj instanceof Celular){
            equals=this.numero==((Celular)obj).getNumero();
        }
        return equals;
    }

}
