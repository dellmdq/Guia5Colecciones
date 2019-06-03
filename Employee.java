package com.company;

public abstract class Employee {
    ///private attributes
    private static int legajoCount=0;
    private int legajo;
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private String fechaIngreso;
    private float SalarioBase;

    ///constructor
    public Employee(int dni, String nombre, String apellido, String email, int telefono, String fechaIngreso, float salarioBase) {
        this.legajo=setLegajo();
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setTelefono(telefono);
        setFechaIngreso(fechaIngreso);
        setSalarioBase(salarioBase);
    }

    ///sets and gets
    ///id setter
    public static int setLegajo(){
        legajoCount++;
        return legajoCount;
    }

    public int getLegajo(){
        return this.legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public float getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        SalarioBase = salarioBase;
    }

    ///methods
    @Override
    public String toString(){
        String message="\nEMPLEADO\nLegajo: %d\nDNI: %d\nNombre: %s\nApellido: %s\nEmail: %s\nTelefono: %d\nFecha Ingreso: %s\nSalario Base: %.2f\n";

        return String.format(message,getLegajo(),getDni(),getNombre(),getApellido(),getEmail(),getTelefono(),getFechaIngreso(),getSalarioBase());
    }

    @Override
    public boolean equals(Object e){
        boolean flag = false;
        if(e instanceof Employee) {
            flag = this.legajo == ((Employee)e).getLegajo();
        }
        return flag;
    }

    public abstract double calcularSalario();
}
