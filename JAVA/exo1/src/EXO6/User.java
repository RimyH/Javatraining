package EXO6;



//import java.util.Arrays;
import java.util.Objects;

public class User implements Comparable <User> {
    

    /// comme des variable privé 
    private String nom;
    private String prenom;
    private double salaire;


    public User(String nom, String prenom,double salaire) { 

        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
    }

    public User(String nom, double salaire) { 
        this(nom, "", salaire); // Appel le premier const et  le prénom --- chaîne vide
        
    }


    /// getters 
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }
    ////setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    ///// augmentation du salaire 

    public void raise (int raise) {
        this.salaire +=raise;
    }


    //// sqt 6 pour faire un affichage par défaut .
    @Override
    public String toString() {
        return "User : nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ".";
    }

    
    
    //// sqt 7 pour faire la comparaison .
   
    @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return Objects.equals(nom, user.nom) && Objects.equals(prenom, user.prenom);
        }
        

    @Override      //// il faut utilise hash ,,, plutot que super hash car e dernier compare les adresses .... 
    public int hashCode() {
        return Objects.hash(nom, prenom, salaire);
    }


    //// pour comparer tout les alphabes de deux nom.....  qst 10

    @Override
    public int compareTo(User user) {
        
        int comparaisonNom = this.nom.compareTo(user.nom);
    
        if (comparaisonNom == 0) { // Si les noms sont différents, retourne la comparaison des noms
            return this.prenom.compareTo(user.prenom);
        }else {
            return comparaisonNom; // Si les noms sont les mêmes, compare les prénoms
        }
       
    }


}