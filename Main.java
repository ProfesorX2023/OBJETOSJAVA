package poo.clases;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        //Class identificador = new Class()

        //Crear un objeto con el constructor vacio
        Vehiculo toyotaYaris = new Vehiculo();

        //Crear un objeto utilizando el constructor con parametros
        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo",2.1,2010,false);

        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

    }
}
