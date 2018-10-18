package bataille;
import java.util.ArrayList;
import java.util.List;

public class Bataille {

    public static void main(String[] args) {
        
        // Création des joueurs
        Joueur j1 = new Joueur("Nox");
        Joueur j2 = new Joueur("Ceryse");
        
        System.out.println("Le joueur "+j1.getNom()+" va affronter le joueur "+j2.getNom()+" au jeu de la bataille!");
        
        
        // Création du paquet 
        List<Carte> paquet = new ArrayList();
       
        for(int couleur=0; couleur<Carte.getNbCouleur(); couleur++){
            for(int valeur=0; valeur<Carte.getNbValeur(); valeur++){
                paquet.add(new Carte(couleur,valeur));
            }  
        }
        
        // Mélanger le paquet
        List<Carte> paquetMelanger = new ArrayList();
        while(paquetMelanger.size() <52){
            carte = paquet[Math.random(0,paquet.size())];
            paquetMelanger.add(carte);
            paquet.remove(carte);
        }
        
        // Distribuer le paquetMélanger
        for(int i=0; i<paquetMelanger.size(); i++){
            if((i % 2)==0){
                j1.ajouterCarte(paquetMelanger[i]);
            }else{
                j2.ajouterCarte(paquetMelanger[i]);
            }
        }
        
        
        // Comparer
        
        
               
    }   
}
