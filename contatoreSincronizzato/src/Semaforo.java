public class Semaforo {

    //attributi
    private int valore;

    //metodi
    public Semaforo(){
        this.valore = 1;
    }

    public synchronized void up(){
        this.valore = this.valore + 1;
        notify();
    }

    public synchronized void down(){
        while(this.valore == 0){
            try{ wait(); }
            catch ( InterruptedException e){}
        }

        this.valore = this.valore - 1;
    }
}