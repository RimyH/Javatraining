package EXO8;

public class EXO8 {
    public static void main(String[] args) {
        RegistreJoueurs registre = new RegistreJoueurs();

        registre.addJoueur(new Joueur("Laurent", 1965));
        registre.addJoueur(new Joueur("Marcel", 1968));
        registre.addJoueur(new Joueur("Patrick", 1976));
        registre.addJoueur(new Joueur("Alain", 1970));
        registre.addJoueur(new Joueur("Didier", 1968));

        registre.addJoueur(new Joueur("Steve", 1980));
        registre.addJoueur(new Joueur("Hugo", 1986));
        registre.addJoueur(new Joueur("Djibril", 1992));
        registre.addJoueur(new Joueur("Blaise", 1987));
        registre.addJoueur(new Joueur("Paul", 1993));
        registre.addJoueur(new Joueur("Karim", 1987));

        System.out.println("Liste des joueurs nés dans les années 1970 : " + registre.get(1970));
        System.out.println("Nombre de joueurs nés dans les années 1980 : " + registre.count(1980));
        System.out.println("Nombre total de joueurs : " + registre.count());
        System.out.println("Contenu du registre : \n" + registre);
    } 
}

