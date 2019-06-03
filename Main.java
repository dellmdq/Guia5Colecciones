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
        *//*
        Celular c1=new Celular("1100","nokia",223);
        Salesman s=new Salesman(111,"Jorgito","Chorizo","jgarca@ladri.com.ar",3333,"12.03.05",30000,2.5,2000000,c1);
        System.out.println(s);
        */
        ///FIN DE AREA TESTING

        ///celulares
        Celular cel1=new Celular("J7","Samsung",2235345);
        Celular cel2=new Celular("1100","nokia",115342938);
        Celular cel3=new Celular("g8","lg",226645643);
        Celular cel4=new Celular("7","iphone",243249985);
        Celular cel5=new Celular("115","motorola",22354003);
        Celular cel6=new Celular("z5","sony",113454398);
        Celular cel7=new Celular("h5","huawei",22363542);
        Celular cel8=new Celular("gt cookie","htc",3445532);
        Celular cel9=new Celular("hola","google",22356743);
        Celular cel10=new Celular("x","motorola",2234521);


        ///vendedores
        Employee salesMan1=new Salesman(0,"pepe","gonez","cacamail",444,"010119",15000,4,20000,cel1);
        Employee salesMan2=new Salesman(1,"tito","garcia","titoq@cacamail.com",2231,"010119",8500,7.5,40000,cel2);
        Employee salesMan3=new Salesman(2,"jorgito","perez","jperez@mail.com",5321,"010119",21000,5.5,120000,cel3);
        Employee salesMan4=new Salesman(3,"horacio","guarani","vivaelchupi@vino.com",223453,"010119",15000,2.5,50000,cel4);
        Employee salesMan5=new Salesman(4,"pedrito","jota","pedrito@pt.com",22312,"010119",15000,5.9,35000,cel5);
        ///distribuidores
        Employee dist1=new Distributor(6,"fabian","garcia","fb@huevero.com",4758745,"010119",18000,24,cel6,100);
        Employee dist2=new Distributor(7,"fede","guevara","guevarapt@bostitaperdio.com",478548,"010119",22000,50,cel7,32) ;
        Employee dist3=new Distributor(8,"gabriel","mitsula","gabimitsu@futbol.com",49593,"010119",2500,20,cel8,15);
        Employee dist4=new Distributor(9,"matias","ringa","racinguita@delgol.com",3412139,"010119",17000,43,cel9,12);
        Employee dist5=new Distributor(10,"topo","yiyo","topo@yiyo.com",495823,"010119",14500,1,cel10,16);
        ///comisionita
        Employee com1=new Comissionist(11,"guille","guenchul","mirameeldedo@bola.com",45211,"010119",11500,34,120);
        Employee com2=new Comissionist(12,"dario","benedetto","eloptimistadelpalo@bostita.com",42421,"010119",11250,55,20);
        Employee com3=new Comissionist(13,"alberto","eltio","eltioalberto@riverplatense.com",334951,"010119",31000,23,50);
        Employee com4=new Comissionist(14,"pablo","perez","pechofrio@bostita.com.bol",3951,"010119",34000,90,23);
        Employee com5=new Comissionist(15,"walter","diaz","wdiaz@email.com",499514,"010119",12000,28,45);

        CommercialDepartment comDepto=new CommercialDepartment(1);

        comDepto.addEmployee(salesMan1);
        comDepto.addEmployee(salesMan2);
        comDepto.addEmployee(salesMan3);
        comDepto.addEmployee(salesMan4);
        comDepto.addEmployee(salesMan5);
        comDepto.addEmployee(dist1);
        comDepto.addEmployee(dist2);
        comDepto.addEmployee(dist3);
        comDepto.addEmployee(dist4);
        comDepto.addEmployee(dist5);
        comDepto.addEmployee(com1);
        comDepto.addEmployee(com2);
        comDepto.addEmployee(com3);
        comDepto.addEmployee(com4);
        comDepto.addEmployee(com5);

        comDepto.showEmployeeList();

        int dist=comDepto.getDistributorsAmountMinimunDepartures(5);
        System.out.println(dist);

    }
}
