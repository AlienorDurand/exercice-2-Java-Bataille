package bataille;

public class Bataille {

    public static void main(String[] args) {
        
        // Création des joueurs
        Joueur j1 = new Joueur("Nox");
        Joueur j2 = new Joueur("Ceryse");
        
        System.out.println("Le joueur "+j1.getNom()+" va affronter le joueur "+j2.getNom()+" au jeu de la bataille!");
        
        
        // Création du paquet 
        Carte[] paquet = new Carte[52] ;
        int compteur = 0; 
        
        for(int couleur=0; couleur<Carte.getNbCouleurs(); couleur++){
            for(int valeur=0; valeur<Carte.getNbValeurs(); valeur++){
                paquet[compteur] = new Carte(couleur,valeur);
                compteur++;
            }  
        }
        
        // Mélanger le paquet
        
        
        // Comparer
        
               
    }   
}
