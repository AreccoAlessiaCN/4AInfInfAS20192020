public class Base extends ThreadDecrementa {

    //attributi
    public int contatore;
    public int contatoreTh1;
    public int contatoreTh2;
    public int contatoreTh3;

    //metodi


    public Base(Base base, Semaforo semaforo, String mioNome, int contatore, int contatoreTh1, int contatoreTh2, int contatoreTh3) {
        super(base, semaforo, mioNome);
        this.contatore = contatore;
        this.contatoreTh1 = contatoreTh1;
        this.contatoreTh2 = contatoreTh2;
        this.contatoreTh3 = contatoreTh3;
    }

    public Base(int contatore){
        super();
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    public static void main(String[] args) {

        Base base = new Base(20);

        System.out.println("Creazione dei thread.");
        Semaforo semaforo = new Semaforo();

        while(base.getContatore() > 0){
            ThreadDecrementa thread1 = new ThreadDecrementa(base, semaforo, "THREAD1");
            ThreadDecrementa thread2 = new ThreadDecrementa(base, semaforo, "THREAD2");
            ThreadDecrementa thread3 = new ThreadDecrementa(base, semaforo, "THREAD3");

            thread1.start();
            thread2.start();
            thread3.start();

            try {
                thread1.join();
                thread2.join();
                thread3.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("\nRisultati: " +
                    "\n[THREAD1] -->" + base.contatoreTh1 +
                    "\n[THREAD2] -->" + base.contatoreTh2 +
                    "\n[THREAD3] -->" + base.contatoreTh3);

        }

    }
}
