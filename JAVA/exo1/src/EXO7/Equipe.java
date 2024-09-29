package EXO7;
import java.util.ArrayList;
import java.util.List;

public class Equipe {

private List<Joueur> joueurs;

public Equipe() {
    this.joueurs = new ArrayList<>();
}
    
public void addJoueur(Joueur joueur) {
    this.joueurs.add(joueur);
}

public boolean removeJoueur(Joueur joueur) {
    return this.joueurs.remove(joueur);
}
//test joueur si il est present 

public boolean isJoueurPresent(Joueur joueur) {
    return this.joueurs.contains(joueur);
}
//affichage des joueurs dans notre liste 

public void afficherJoueurs() {
    System.out.println("Joueurs dans l'équipe :");
    for (Joueur joueur : joueurs) {
        System.out.println(joueur);
    }
}


public void addAllEquipe(Equipe autreEquipe) {
    for (Joueur joueur : autreEquipe.joueurs) {
        if (!this.joueurs.contains(joueur)) {
            this.joueurs.add(joueur);
        }
    }
}


public void clear (){
    this.joueurs.clear();
}


public int getNombreJoueurs() {
    return this.joueurs.size();
}

public double getMoyenneAge() {
    if (this.joueurs.isEmpty()) {
        return 0.0; // Si aucun joueur dans l'équipe, retourne 0 comme moyenne
    }
    double totalAge = 0;
    for (Joueur joueur : this.joueurs) {
        totalAge += joueur.getAge();
    }
    return  totalAge / this.joueurs.size();
}



@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Equipe : ").append(joueurs.size()).append(" joueurs\n");
    for (Joueur joueur : joueurs) {
        sb.append(joueur.toString()).append("\n");
    }
    return sb.toString();
}









}
