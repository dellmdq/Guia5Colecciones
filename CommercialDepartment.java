package com.company;

import java.util.ArrayList;

import static java.util.Objects.isNull;

public class CommercialDepartment{
    ///private attributes
    private int codigoDepto;
    private ArrayList<Employee> employeeList;

    ///constructor
    public CommercialDepartment(int codigoDepto) {
        setCodigoDepto(codigoDepto);
        this.employeeList = new ArrayList<>();
    }

    ///setters and getters
    public int getCodigoDepto() {
        return codigoDepto;
    }

    public void setCodigoDepto(int codigoDepto) {
        this.codigoDepto = codigoDepto;
    }

    public ArrayList<Employee> getEmployeeList(){
        return employeeList;
    }

    ///methods
    public void addEmployee(Employee e){
        if(!isNull(e) && !existsEmployee(e.getDni())){
            employeeList.add(e);
        }

    }

    public void removeEmployee(Employee e){
        if(!isNull(e))
            getEmployeeList().remove(e);
    }

    public void showEmployeeList(){
        for(Employee e : getEmployeeList()){
            System.out.println("\n====================\n"+e);
        }
    }

    public boolean existsEmployee(int dni){
        boolean exists=false;
        for(int i=0 ; i<this.employeeList.size() && !exists ; i++){
            if(getEmployeeList().get(i).getDni() == dni)
                exists=true;
        }
        return exists;
    }

    public int getDistributorsAmountMinimunDepartures(int minDepartures){
        int dist=0;
        if(minDepartures>0){
            for(Employee d : employeeList){
                if(d instanceof Distributor && ((Distributor) d).getGoingOutsPerDay()>minDepartures){
                    dist++;
                }
            }
        }
        return dist;
    }


    ///public void applyRaise(double raisePercentage){

    ///public int getSalesmenQuantity();

    ///public int getComisionistsQuantity();

    ///public int getDistributorsQuantity();
}
