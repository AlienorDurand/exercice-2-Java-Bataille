package bataille;

public class Joueur {
    
    // Attributs
    private int cartes[];
    private int scores = 0;
    private String nom;
    
    // Constructeur 
    public Joueur(String nom){
        this.nom = nom;
    }
    
    // Get
    public String getNom(){
    return this.nom;
}
    // Methodes
    public int tirer(){
       return 0; 
    }
    
    public void ajouter(int a){
        ;
    }
    
    public int gagner(){
        return scores+1 ;
    }
}
