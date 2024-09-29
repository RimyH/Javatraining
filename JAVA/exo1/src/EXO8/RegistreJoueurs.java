package EXO8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistreJoueurs {

    private Map<Integer, List<String>> joueursParDecennie;

    public RegistreJoueurs() {
        joueursParDecennie = new HashMap<Integer, List<String>>();
    }

    public void addJoueur(Joueur joueur) {
        int decennie = joueur.getAnneeDeNaissance() / 10 * 10;
        joueursParDecennie.computeIfAbsent(decennie, k -> new ArrayList<>()).add(joueur.getNom()); //ajoute le joueur à la liste correspondante à la décennie, cree une nouvelle liste si la décennie n'existe pas encore dans la table de hachage.
    }

    public List<String> get(int decennie) {
        return joueursParDecennie.getOrDefault(decennie, new ArrayList<>()); //permet d'obtenir la liste des joueurs nés pendant une décennie donnée. Si la décennie n'existe pas dans la table de hachage, elle retourne une liste vide.
    }

    public int count(int decennie) {
        return get(decennie).size();
    }

    public int count() {
        int total = 0;
        for (List<String> joueurs : joueursParDecennie.values()) {
            total += joueurs.size();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, List<String>> entry : joueursParDecennie.entrySet()) {
            sb.append("Décennie ").append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
}

    



}

