package EXO7;

//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;

public class EXO7 {
    public static void main(String[] args) {

        Equipe equipe = new Equipe();

        Joueur joueur1 = new Joueur("Rimy", 25);
        Joueur joueur2 = new Joueur("Ibra", 24);
        Joueur joueur3 = new Joueur("Bobo", 24);
        Joueur joueur4 = new Joueur("Zuc", 25);
        Joueur joueur5 = new Joueur("Madi", 24);


//test methode addjoueur  equipe 1 
        equipe.addJoueur(joueur1);
        equipe.addJoueur(joueur2);
        equipe.addJoueur(joueur3);
        equipe.addJoueur(joueur4);
        equipe.addJoueur(joueur5);
//equipe.afficherJoueurs();
        System.out.println("l'equipe 1 est : " + equipe );

//EQUIPE 2
        Equipe equipe2 = new Equipe();
        Joueur joueur6 = new Joueur("tetoz", 24);

        equipe2.addJoueur(joueur2);
        equipe2.addJoueur(joueur3);
        equipe2.addJoueur(joueur6);
        //equipe2.afficherJoueurs();
        System.out.println("l'equipe 2 est : " + equipe2 );

//EQUIPE 3 Limiter :
        EquipeLimite equipe3 = new EquipeLimite(3); // Limite à 3 joueurs
        // Ajout de joueurs à l'équipe 3 
        equipe3.addJoueur(joueur1);
        equipe3.addJoueur(joueur2);
        equipe3.addJoueur(joueur3);
        equipe3.addJoueur(joueur4); // Celui-ci ne sera pas ajouté car dépasse la limite
        equipe3.addJoueur(joueur5); // Celui-ci ne sera pas ajouté car dépasse la limite
        System.out.println("l'equipe 3 est : " + equipe3 );
//EQUIPE 4 LIMITER 
EquipeLimite equipe4 = new EquipeLimite(1);
equipe4.addJoueur(joueur4);
equipe4.addJoueur(joueur5);// Celui-ci ne sera pas ajouté car dépasse la limite
System.out.println("l'equipe 4 est : " + equipe4 );


// Fusion des équipes 1 et 2 
equipe.addAllEquipe(equipe2);

// Après fusion des equipe 1 et 2 
System.out.println("Équipe 1 après fusion :");
equipe.afficherJoueurs();


//test methode remove joueur

        equipe.removeJoueur(joueur1);
        equipe.removeJoueur(joueur4);

        System.out.println("le joueur enlever est : " + joueur1 );
        System.out.println("le joueur enlever est : " + joueur4 );
        //equipe.afficherJoueurs();
        
//test methode si le joueur est present

boolean joueurPresent=equipe.isJoueurPresent(joueur4);
boolean joueurPresent2=equipe.isJoueurPresent(joueur2);
System.out.println("Est-ce que Zuc est dans l'équipe ? " + joueurPresent);
System.out.println("Est-ce que Ibra est dans l'équipe ? " + joueurPresent2);
//equipe.afficherJoueurs();

//test equals hashcode et compare to 
        System.out.println("Les joueurs sont-ils égaux ? " + joueur1.equals(joueur2));
// Test de la méthode compareTo
        System.out.println("Comparaison des joueurs : " + joueur1.compareTo(joueur2));
// Test de la méthode hashCode
        System.out.println("HashCode joueur1 : " + joueur1.hashCode());
        System.out.println("HashCode joueur2 : " + joueur2.hashCode());

// Test de la méthode getNombreJoueurs()
System.out.println("Nombre de joueurs dans l'équipe : " + equipe.getNombreJoueurs());
System.out.println("Nombre de joueurs dans l'équipe : " + equipe2.getNombreJoueurs());

// Test de la méthode getMoyenneAge()
System.out.println("Moyenne d'âge dans l'équipe 1 : " + equipe.getMoyenneAge());
//System.out.println("Moyenne d'âge dans l'équipe 2 : " + equipe2.getMoyenneAge());

//teste EQUIPE LIMITE 

        // Test de la méthode getNombreJoueurs()
        System.out.println("Nombre de joueurs dans l'équipe 3 : " + equipe3.getNombreJoueurs());

        // Test de la méthode getMoyenneAge()
        System.out.println("Moyenne d'âge dans l'équipe 3 : " + equipe3.getMoyenneAge());


        // Fusion des équipes 3 et 4
equipe3.addAllEquipelimite(equipe4);

// Après fusion des equipe 1 et 2 
System.out.println("Équipe 3 après fusion :");
equipe3.afficherJoueurs();

// Test de la méthode getNombreJoueurs() apres fusion 
System.out.println("Nombre de joueurs dans l'équipe 3 apres fusion : " + equipe3.getNombreJoueurs());

    }

}

//}