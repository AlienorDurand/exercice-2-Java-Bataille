package bataille;

public class Carte {
    
    // Attributs
    private static String couleurs[] = {"coeur","pique","trefle","carreau"};
    private static String valeurs[] = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"} ; 
    private int indexCouleur;
    private int indexValeur; 
    
    // Constructeur
    public Carte(int indexCouleur, int indexValeur) {
        this.indexCouleur = indexCouleur;
        this.indexValeur = indexValeur;
    }
        
    // Getter
    public int getIndexCouleur() {
        return indexCouleur;
    }

    public int getIndexValeur() {
        return indexValeur;
    }

    /* Setter même si en théorie on ne devrait pas pouvoir changer les cartes donc je les mets en commentaire pour éviter toutes tricheries (ex: créer des AS pour gagner)
    public void setIndexCouleur(int indexCouleur) {
        this.indexCouleur = indexCouleur;
    }

    public void setIndexValeur(int indexValeur) {
        this.indexValeur = indexValeur;
    }*/
    
    // Méthode qui indique la taille du tableau
    public static int getNbCouleur(){
        return couleurs.length;
    }

    public static int getNbValeur(){
        return valeurs.length;
    }
    
    // Debug
    @Override
    public String toString() {
        return "Carte{" +"La carte représente un "+ couleurs[this.indexCouleur]+valeurs[this.indexValeur]+ '}';
    }

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
