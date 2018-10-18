package bataille;
import java.util.ArrayList;

public class Joueur {
    
    // Attributs
    private ArrayList cartes = new ArrayList() ;
    private int scores = 0;
    private String nom;
    
    // Constructeur 
    public Joueur(String nom){
        this.nom = nom;
    }
    
    // Accesseur nom
    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    // Methodes
    public int tirer(){
       return 0; 
    }
    
    public void ajouter(Carte carte){
        cartes.add(carte);
    }
    
    public int gagner(){
        scores = scores +1;
        return scores ;
    }
}
