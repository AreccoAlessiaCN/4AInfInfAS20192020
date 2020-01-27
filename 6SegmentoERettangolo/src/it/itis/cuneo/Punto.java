package it.itis.cuneo;

/**
 * Created by inf.areccoa1405 on 11/11/2019.
 */
public class Punto {

    //attributi
    private int xPunto;
    private int yPunto;


    //metodi
    //COSTRUTTORI
    public Punto(int x, int y){
        this.xPunto = x;
        this.yPunto = y;
    }

    public Punto(Punto punto){

    }

    //SETTER/GETTER
    public void setXPunto(int x){
        this.xPunto = x;
    }

    public void setYPunto(int y){
        this.yPunto = y;
    }

    public int getXPunto(){
        return xPunto;
    }

    public int getYPunto(){
        return xPunto;
    }
}
