package poo.clases;

public class Vehiculo {

    //1. atributos
    String modelo;
    String fabricante;
    //Double ccc;  //Tipo envoltorio con la letra mayúscula permite valores no null
    double ccc;
    int year;
    boolean sport;
    int speed;

    //2. Constructores
    public Vehiculo(){

    }

    //Sobrecarga de fuciones
    public Vehiculo(String fabricante, String modelo, double ccc, int year, boolean sport){
        //parametro
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ccc = ccc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;


    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //3. Métodos (Comportamiento)
    public void acelerar(int cantidad){
        this.speed += cantidad;
    }

    //getter y setter

    //to String


}
