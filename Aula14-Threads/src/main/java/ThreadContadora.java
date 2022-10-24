public class ThreadContadora implements Runnable{
    // Atributos da Thread
    private String nomeThread;

    // Construtor
    public ThreadContadora(String nome){
        this.nomeThread=nome;
    }

    // Método Run - Modela a thread
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(this.nomeThread+" - "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
