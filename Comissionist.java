package com.company;

public class Comissionist extends Employee {
    private int deliveryAmount;
    private float payPerDelivery;
    private double salario;

    public Comissionist(int dni, String nombre, String apellido, String email, int telefono, String fechaIngreso, float salarioBase, int deliveryAmount,float payPerDelivery) {
        super(dni, nombre, apellido, email, telefono, fechaIngreso, salarioBase);
        setDeliveryAmount(deliveryAmount);
        setPayPerDelivery(payPerDelivery);
        setSalario();
    }

    public int getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(int deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public float getPayPerDelivery() {
        return payPerDelivery;
    }

    public void setPayPerDelivery(float payPerDelivery) {
        this.payPerDelivery = payPerDelivery;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario=super.getSalarioBase()+this.getDeliveryAmount()*this.getPayPerDelivery();
    }

    @Override
    public String toString() {
        String base=super.toString();
        String message="COMISSIONIST\nDelivery Amount: %d\nPay Per Delivery: %.2f\nSalary: %.2f";

        return base.concat(String.format((message),getDeliveryAmount(),getPayPerDelivery(),getSalario()));
    }

    public double calcularSalario(){
        float salario=0;
        if(this.deliveryAmount>0 && this.payPerDelivery>0){
            salario=super.getSalarioBase()+this.deliveryAmount*this.getPayPerDelivery();
        }
        return salario;
    }
}
