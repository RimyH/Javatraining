package EXO7;

import java.util.ArrayList;
import java.util.List;

/*addJoueur a été modifiée pour vérifier si l'équipe n'a pas atteint sa capacité maximale avant d'ajouter un nouveau joueur
 addAllEquipe qui utilise maintenant la méthode addJoueur pour ajouter chaque joueur de l'autre équipe, en respectant la limitation du nombre de joueurs.
 */
public class EquipeLimite {
    
    private List<Joueur> joueurs;
    private int nombreMax;

    public EquipeLimite(int nombreMax) {
        this.joueurs = new ArrayList<>();
        this.nombreMax = nombreMax;
    }

    public void addJoueur(Joueur joueur) {
        if (this.joueurs.size() < this.nombreMax) {
            this.joueurs.add(joueur);
        } else {
            System.out.println("L'équipe est déjà pleine, impossible d'ajouter un nouveau joueur.");
        }
    }

    public boolean removeJoueur(Joueur joueur) {
        return this.joueurs.remove(joueur);
    }

    public boolean isJoueurPresent(Joueur joueur) {
        return this.joueurs.contains(joueur);
    }

    public void afficherJoueurs() {
        System.out.println("Joueurs dans l'équipe :");
        for (Joueur joueur : joueurs) {
            System.out.println(joueur);
        }
    }

    public void addAllEquipelimite(EquipeLimite autreEquipe) {
        for (Joueur joueur : autreEquipe.joueurs) {
           // Utilise la méthode addJoueur pour ajouter chaque joueur
            if (!this.joueurs.contains(joueur)) {
                this.addJoueur(joueur);
            }
        }
    }

    public void clear() {
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
        return totalAge / this.joueurs.size();
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




