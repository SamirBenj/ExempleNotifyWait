public class Producteur extends Thread {

    Fonctions f;
    public  Producteur(Fonctions f){
        this.f =f;

    }
    public void run(){
        f.produire("message 1");
        f.produire("message 2");
        try {
            sleep(500);
        }catch (InterruptedException e){}
        f.produire("message 3");
    }
}
