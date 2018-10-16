package bataille;

public class Joueur {
    
    // Attributs
    private int cartes[];
    private int scores = 0;
    
    // Methodes
    public int tirer(){
        int res = cartes[0];
        cartes[1] = cartes[0];
        return res;
    }
    
    public void ajouter(int a){
        cartes[cartes.length+1] = a;
    }
    
    public int gagner(){
        return scores+1 ;
    }
}
