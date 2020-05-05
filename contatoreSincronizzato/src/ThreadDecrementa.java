public class ThreadDecrementa extends Thread {

    //attributi

    private Semaforo sem;
    private String nome;
    private Base cContatore;
    private int variabileComodo;
    private int volte;

    //metodi
    public ThreadDecrementa(Base base, Semaforo semaforo, String mioNome){
        sem = semaforo;
        nome = mioNome;
        cContatore = base;
    }

    public ThreadDecrementa() {

    }

    public void run(){
        sem.down();
        decrementaContatore();
        sem.up();
    }

    public void decrementaContatore(){
        if(cContatore.contatore == 0){
            return;
        }

        variabileComodo = cContatore.getContatore();
        variabileComodo = variabileComodo - 1;

        cContatore.setContatore(variabileComodo);

        if(nome == "THREAD1") {
            cContatore.contatoreTh1 = cContatore.contatoreTh1 + 1;
            volte = cContatore.contatoreTh1;
        }   else if(nome == "THREAD2") {
            cContatore.contatoreTh2 = cContatore.contatoreTh2 + 1;
        }   else if(nome == "THREAD3") {
            cContatore.contatoreTh3 = cContatore.contatoreTh3 + 1;
        }

        System.out.println("[" + nome + "] --> volta = " + volte );
        System.out.println("[" + nome + "] --> contatore = " + variabileComodo);
    }
}
