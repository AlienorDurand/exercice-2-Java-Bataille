package bataille;
import java.util.ArrayList;
import java.util.List;

public class Bataille {

    public static void main(String[] args) {
        
        // Création des joueurs
        Joueur j1 = new Joueur("Nox");
        Joueur j2 = new Joueur("Ceryse");
        
        System.out.println("Le joueur "+j1.getNom()+" va affronter le joueur "+j2.getNom()+" au jeu de la bataille!");
        
        
        // Création d'un paquet de cartes
        List<Carte> paquet = new ArrayList<>();
       
        for(int couleur=0; couleur<Carte.getNbCouleur(); couleur++){
            for(int valeur=0; valeur<Carte.getNbValeur(); valeur++){
                paquet.add(new Carte(couleur,valeur));
            }  
        }
        
        // Création du futur paquet de cartes mélangé
        List<Carte> paquetMelanger = new ArrayList<>();
        
        // Mélanger le paquet : on va choisir un carte au hasard dans le paquet, ce qui va supprimer cette carte du paquet et ajouter cette carte au paquetMelanger
        while(paquetMelanger.size() <52){
            Carte carte =  paquet.remove((int)(Math.random()*paquetMelanger.size()));
            paquetMelanger.add(carte);
        }
        
        // Distribuer le paquetMélanger : on choisi un carte au hasard dans le paquetMelanger, et on distribut la carte tiré aux joueurs une fois sur deux
        for(int i=0; i<paquetMelanger.size(); i++){
            Carte carte = paquetMelanger.get(i);
            if((i % 2)==0){
                j1.ajouter(carte);
            }else{
                j2.ajouter(carte);
            }
        }
        
        // Comparer
        List<Carte> tablePile = new ArrayList<>();
        while(j1.getNbCarte()!=0 || j2.getNbCarte()!=0){
            Carte carteJ1 = j1.tirer();
            Carte carteJ2 = j2.tirer();
            tablePile.add(carteJ1);
            tablePile.add(carteJ2);
            
            int res = carteJ1.comparerCarte(carteJ2);
            if(res < 0){
                for(int i=0; i<tablePile.size(); i++){
                    j2.ajouter(tablePile.get(i));
                }
            }else if(res > 1){
                for(int i=0; i<tablePile.size(); i++){
                    j1.ajouter(tablePile.get(i));
                }
            }else{
                Carte carteCacher1 = j1.tirer();
                Carte carteCacher2 = j2.tirer();
                tablePile.add(carteCacher1);
                tablePile.add(carteCacher2);
            }
        }
        
        // Scores : le joueur qui n'a plus de paquet de carte à perdu, cela apporte donc 1 point à son adversaire
        if(j1.getNbCarte()==0){
            j2.gagner();
            System.out.println("Le joueur "+j2.getNom()+" a gagner 1 point, son score est de "+j2.getScores());
            System.out.println("Le score du joueur "+j1.getNom()+" est de "+j1.getScores());
        }else{
            j1.gagner();
            System.out.println("Le joueur "+j1.getNom()+" a gagner 1 point, son score est de "+j1.getScores());
            System.out.println("Le score du joueur "+j2.getNom()+" est de "+j2.getScores());
        }
        
        
    }   
}
