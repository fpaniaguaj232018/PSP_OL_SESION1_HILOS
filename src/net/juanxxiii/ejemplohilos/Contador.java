package net.juanxxiii.ejemplohilos;

public class Contador extends Thread {
    int limite;
    public Contador(int limite){
        this.limite=limite;
    }
    @Override
    public void run() {
        for(int i=0;i<limite;i++){
            System.out.println(i +" de "+ limite);
        }
        System.out.println("********************");
        System.out.println("FIN CONTADOR:" + limite);
        System.out.println("********************");
    }
}
