package bataille;
import java.util.ArrayList;
import java.util.List;


public class Joueur {
    
    // Attributs
    // Un tableau de cartes qui correspond au paquet de carte du joueur, son score et son nom
    private ArrayList<Carte> cartes = new ArrayList<>() ;
    private int scores = 0;
    private String nom;
    
    /**
     * Constructeur du nom du joueur
     * @param nom 
     */
    public Joueur(String nom){
        this.nom = nom;
    }
    
    /**
     * Getter nom
     * @return nom
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Setter nom
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * Méthodes tirer une carte parmis le tableau de cartes du joueur
     * @return la 1ère carte du paquet du joueur, tout en la supprimant du tableau, car après la manche il faudra ajouter cette carte à la fin du paquet du joeueur gagnant
     */
    public Carte tirer(){
       return this.cartes.remove(0); 
    }
    
    /**
     * Ajoute une carte à la fin du tableau de cartes de joueur
     * @param carte 
     */
    public void ajouter(Carte carte){
        this.cartes.add(carte);
    }
    
     /**
     * Ajoute une List à une autre List
     * @param pileDeCarte 
     */
    public void ajouter(List<Carte> pileDeCarte){
        this.cartes.addAll(pileDeCarte);
    }
    
    /**
     * Incrémente le score d'un joueur
     * @return scores
     */
    public int gagner(){
        this.scores = this.scores +1;
        return scores ;
    }
    
    /**
     * Retourne la taille du tableau de cartes
     * @return int
     */
    public int getNbCarte(){
        return cartes.size() ;
    }

    /**
     * Retourne le score
     * @return scores
     */
    public int getScores() {
        return scores;
    }
    
}
