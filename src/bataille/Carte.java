package bataille;

public class Carte {
    
    // Attributs
    private static String couleur[] = {"coeur","pique","trefle","carreau"};
    private static String valeur[] = {"2","3","4","5","6","7","8","9","10","V","D","R","A"} ; 
    private int indexCouleur;
    private int indexValeur;
    
    public boolean comparerCarte(int indexA){
        boolean res;
        
        if(this.indexValeur > indexA){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    
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

    // Setter
    public void setIndexCouleur(int indexCouleur) {
        this.indexCouleur = indexCouleur;
    }

    public void setIndexValeur(int indexValeur) {
        this.indexValeur = indexValeur;
    }
    
    // Méthode qui indique la taille du tableau
    public static int getNbCouleurs(){
        return couleur.length;
    }

    public static int getNbValeurs(){
        return valeur.length;
    }
    
    // Debug
    @Override
    public String toString() {
        return "Carte{" + ", indexCouleur=" + indexCouleur + ", indexValeur=" + indexValeur + '}';
    }

    //Comparateur
    
}
