package com.company;

public class Salesman extends Employee {
    ///private attributes static first
    private double comisionPercentage;
    private float salesAmount;
    private Celular celularAsignado;
    private double salario;

    public Salesman(int dni, String nombre, String apellido, String email, int telefono, String fechaIngreso, float salarioBase, double comisionPercentage, float salesAmount, Celular celularAsignado) {
        super(dni, nombre, apellido, email, telefono, fechaIngreso, salarioBase);
        setComisionPercentage(comisionPercentage);
        setSalesAmount(salesAmount);
        setCelularAsignado(celularAsignado);
        setSalario();
    }

    public double getComisionPercentage() {
        return comisionPercentage;
    }

    public void setComisionPercentage(double comisionPercentage) {
        this.comisionPercentage = comisionPercentage;
    }

    public float getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(float salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario() {
        salario = calcularSalario();
    }

    public double getComission(){
        return getSalesAmount()*(getComisionPercentage()/100);
    }

    public double calcularSalario() {
        double salario = 0;
        if (super.getSalarioBase() > 0) {
            salario = super.getSalarioBase();
            if (this.getSalesAmount() > 0 && this.getComisionPercentage() > 0) {
                salario = salario + getComission();
            }
        }
        return salario;
    }

    @Override
    public String toString() {
        String base = super.toString();
        String message = "SALESMAN\nComission percentage: %.2f\nSales: %.2f\nComission: %.2f\nSalary: %.2f\n" + getCelularAsignado().toString();

        return base.concat(String.format(message, getComisionPercentage(), getSalesAmount(),getComission(), getSalario()));
    }
}
