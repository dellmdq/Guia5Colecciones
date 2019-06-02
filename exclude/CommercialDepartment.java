package com.company;

import java.util.ArrayList;

public class CommercialDepartment{
    ///private attributes
    private int codigoDepto;
    private ArrayList<Employee> employees;

    ///constructor
    public CommercialDepartment(int codigoDepto, ArrayList<Employee> employees) {
        setCodigoDepto(codigoDepto);
        employees = new ArrayList<>();
    }

    ///setters and getters
    public int getCodigoDepto() {
        return codigoDepto;
    }

    public void setCodigoDepto(int codigoDepto) {
        this.codigoDepto = codigoDepto;
    }

    ///methods
    @Override
    public String toString() {
        return "CommercialDepartment{" +
                "codigoDepto=" + codigoDepto +
                ", employees=" + employees +
                '}';
    }

    ///public double applyRaise();

    ///public int getSalesmenQuantity();

    ///public int getComisionistsQuantity();

    ///public int getDistributorsQuantity();
}
