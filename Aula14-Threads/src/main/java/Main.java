public class Main {
    public static void main(String[] args) {
        // Criando Threads contadoras
        ThreadContadora tc1=new ThreadContadora("Thread1");
        ThreadContadora tc2=new ThreadContadora("Thread2");
        ThreadContadora tc3=new ThreadContadora("Thread3");

        // Criando Threads
        Thread t1=new Thread(tc1);
        Thread t2=new Thread(tc2);
        Thread t3=new Thread(tc3);

        // Executando as Threads
        t1.start();
        t2.start();
        t3.start();

    }
}
