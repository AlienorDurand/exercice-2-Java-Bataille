package bataille;

public class Bataille {

    public static void main(String[] args) {
        
        // Création des joueurs
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
        
        // Création du paquet 
        Carte[] paquet = new Carte[52] ;
        int compteur = 0; 
        
        for(int a=0; a<Carte.getNbCouleurs(); a++){
            for(int b=0; b<Carte.getNbValeurs(); b++){
                paquet[compteur] = new Carte(a,b);
                /*System.out.println("a"+a);
                System.out.println("b"+b);
                System.out.println("paquet"+paquet[compteur]);*/
                compteur++;
            }  
        }
        
        // Mélanger le paquet
        
        // Comparer
        
               
    }
      
    
}
