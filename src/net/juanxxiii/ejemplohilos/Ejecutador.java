package net.juanxxiii.ejemplohilos;

public class Ejecutador {
    public static void main(String[] args) {
        System.out.println("INICIANDO EJECUCION");
        Contador c1 = new Contador(10000);
        Contador c2 = new Contador(10);
        Contador c3 = new Contador(30);
        Contador c4 = new Contador(1000);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
