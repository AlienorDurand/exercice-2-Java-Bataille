package bataille;

public class Carte {
    
    // Attributs
    // Tableaux statiques de couleurs et valeurs, 
    // et des index qui pointeront dans les tableaux, cela nous permettra facilement de comparer les mains des joueurs
    private static String couleurs[] = {"coeur","pique","trefle","carreau"};
    private static String valeurs[] = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"} ; 
    private int indexCouleur;
    private int indexValeur; 
    
    /**
     * Constructeur des index
     * @param indexCouleur
     * @param indexValeur 
     */
    public Carte(int indexCouleur, int indexValeur) {
        this.indexCouleur = indexCouleur;
        this.indexValeur = indexValeur;
    }
        
    /**
     * Getter index couleur
     * @return indexCouleur
     */
    public int getIndexCouleur() {
        return indexCouleur;
    }
    
    /**
     * Getter index valeur
     * @return indexValeur
     */
    public int getIndexValeur() {
        return indexValeur;
    }

    /**
     * Setter index Couleur 
     * @param indexCouleur 
     */
    public void setIndexCouleur(int indexCouleur) {
        this.indexCouleur = indexCouleur;
    }
    
    /**
     * Setter même si en théorie on ne devrait pas pouvoir changer la valeur donc je les mets en commentaire pour éviter toutes tricheries (ex: créer des AS pour gagner)
     * @param indexValeur 
     */
    /*public void setIndexValeur(int indexValeur) {
        this.indexValeur = indexValeur;
    }*/
    
    /**
     * Méthode qui indique la taille du tableau couleur
     * @return un entier
     */
    public static int getNbCouleur(){
        return couleurs.length;
    }

    /**
     * Méthode qui indique la taille du tableau valeur
     * @return un entier
     */
    public static int getNbValeur(){
        return valeurs.length;
    }
    
    /**
     * Méthode toString pour debug
     * @return une chaîne de caractère 
     */
    @Override
    public String toString() {
        return "Carte{" +"La carte représente un "+ couleurs[this.indexCouleur]+valeurs[this.indexValeur]+ '}';
    }

    /**
     * Méthode qui permet de comparer les indexValeur entre 2 cartes
     * @param uneCarte
     * @return res
     */
    public int comparerCarte(Carte uneCarte){
        
        int res;
        
        if(this.indexValeur< uneCarte.getIndexValeur()){
            res = -1;
        }else if(this.indexValeur > uneCarte.getIndexValeur()){
            res = 1;
        }else{
            res = 0;
        }
        return res;
    }
    
}
