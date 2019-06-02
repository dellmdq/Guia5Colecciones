package com.company;


public class Distributor extends Employee {
    private int goingOutsPerDay;
    private Celular celularAsignado;
    private float goingOutPay;
    private double salario;

    public Distributor(int dni, String nombre, String apellido, String email, int telefono, String fechaIngreso, float salarioBase, int goingOutsPerDay, Celular celularAsignado,float goingOutPay) {
        super(dni, nombre, apellido, email, telefono, fechaIngreso, salarioBase);
        setGoingOutsPerDay(goingOutsPerDay);
        setCelularAsignado(celularAsignado);
        setGoingOutPay(goingOutPay);
        setSalario();
    }

    public int getGoingOutsPerDay() {
        return goingOutsPerDay;
    }

    public void setGoingOutsPerDay(int goingOutsPerDay) {
        this.goingOutsPerDay = goingOutsPerDay;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }

    public float getGoingOutPay() {
        return goingOutPay;
    }

    public void setGoingOutPay(float goingOutPay) {
        this.goingOutPay = goingOutPay;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = this.calcularSalario();
    }

    @Override
    public String toString() {
        String base=super.toString();
        String message="DISTRIBUTOR\nDepartures per day: %d\nGoing Out Pay: %.2f\nSalario: %.2f\n"+getCelularAsignado().toString();
        return base.concat(String.format(message,getGoingOutsPerDay(),getGoingOutPay(),getSalario()));
    }

    public double calcularSalario() {
        float salario=0;

        if (this.goingOutsPerDay > 0)
            salario=super.getSalarioBase()+this.getGoingOutsPerDay()*this.getGoingOutPay();
        return salario;
    }

    public void llamar(){
        System.out.println("Llamando...");
    }

    public void atender(){
        System.out.println("Atendiendo...");
    }
}

