/***/
package com.company;

public class Main {

    public static void main(String[] args) {
        ////TESTING AREA
        System.out.println("Preguntas: 1) salario final de cada clase deberia ir en la super o en las derivadas?");
        /**
        Employee e=new Employee(123,"pepe","parada","pepe@gmail.com",2235,"01-12-19",10000);
        System.out.println(e);
        Celular c=new Celular("1100","nokia",223);
        System.out.println(c);
        Celular c1=new Celular("1100","nokia",223);
        System.out.println(c1);
        Employee e2=new Distributor(123,"tito","gomez","titogomez@gmail.com",444,"231299",20000,5,c1);
        System.out.println(e2);
         *//**
        Celular c1=new Celular("1100","nokia",223);
        Distributor d=new Distributor(31,"pablo","garcia","pablo@garcia.com",444,"101019",20000,20,c1,200);
        System.out.println(d);
        */
         /**
        Celular c1=new Celular("1100","nokia",223);
        Comissionist com1=new Comissionist(13131,"fabe","perez","fabi@perez.com",4545,"13.11.19",15000,32,100);
        System.out.println(com1);
        */
        Celular c1=new Celular("1100","nokia",223);
        Salesman s=new Salesman(111,"Jorgito","Chorizo","jgarca@ladri.com.ar",3333,"12.03.05",30000,2.5,2000000,c1);
        System.out.println(s);
        ///FIN DE AREA TESTING

    }
}
