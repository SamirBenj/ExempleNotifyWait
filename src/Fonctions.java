public class Fonctions {
    String T;
    boolean Vide = true;

    synchronized void produire(String t) {
        if(Vide = false) {//!vide
            System.out.println("Le producteur attent");
            try{
                wait();
            }catch (InterruptedException e ){}
        }
        T=t;
        System.out.println("le producteur produit" +T);
    }
    synchronized void consommer(){
        if(Vide == true){//vide
            System.out.println("La consommation attend");
            try {
                wait();
            }catch (InterruptedException e){}
        }
        System.out.println("Le consommateur consomme" + T);
        Vide =true;
        notify();
    }
}
