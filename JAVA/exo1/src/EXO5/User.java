package EXO5;

import java.util.Objects;

public class User implements Comparable <User> {
    

    private String nom;
    private String prenom;
    private double salaire;

    public User (String nom, String prenom, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public  User (String nom, double salaire) {

        this(nom,"",salaire);
        
    }
   //les getters 

      public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }
//les setters 


public void setNom(String nom) {
    this.nom = nom;
}

public void setPrenom(String prenom) {
    this.prenom = prenom;
}

public void setSalaire(double salaire) {
    this.salaire = salaire;
}
   


//salaire
 public void araise(int raise){
        this.salaire = this.salaire + raise;
    }




@Override
public String toString() {
    return "User [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
}

public boolean equals(Object o) {  //o objet passer en argument lorsuqe en utilise equals  , this est lobjet quon va comparer 
    if (o == this)
        return true;
    if (!(o instanceof User)) {
        return false;
    }

    User user = (User) o;  //Cette ligne effectue une conversion de type de o vers User
   
    return Objects.equals(nom, user.nom) && Objects.equals(prenom, user.prenom) && Objects.equals(salaire, user.salaire);

}


@Override
public int hashCode() {
    return Objects.hash(nom, prenom, salaire);

}

@Override
public int compareTo(User o) {
   /* 
    int comparaisonNoms = this.nom.compareTo(o.nom);
        
    
    if (comparaisonNoms != 0) {
            return comparaisonNoms;
        } else {
            return this.prenom.compareTo(o.prenom);
        }
*/

        int nomCompare = this.nom.compareTo(o.nom);
        if (nomCompare == 0) {
            return this.prenom.compareTo(o.prenom);
        } else {
            return nomCompare;
        }

    }


    
}






