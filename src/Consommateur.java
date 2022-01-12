public class Consommateur extends Thread{
    Fonctions f;
    public Consommateur(Fonctions f) {
        this.f = f;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0; i<4;i++){
            f.consommer();
        }
    }

}

