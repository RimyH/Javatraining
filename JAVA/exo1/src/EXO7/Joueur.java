package EXO7;
import java.util.Objects;
public class Joueur implements Comparable <Joueur> {
    
        private String nom;
        private int age;

        public Joueur(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }
    
        // Getters et setters
        public String getNom() {
            return nom;
        }
    
        public void setNom(String nom) {
            this.nom = nom;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }

        
        @Override
        public String toString() {
            return "Joueur [nom=" + nom + ", age=" + age + "]";
        }

        @Override

public boolean equals(Object o) {  //o objet passer en argument lorsuqe en utilise equals  , this est lobjet quon va comparer 
    if (o == this)
        return true;
    if (!(o instanceof Joueur)) {
        return false;
    }
    Joueur joueur = (Joueur) o;  //Cette ligne effectue une conversion de type de o vers User
    return Objects.equals(nom, joueur.nom) &&  Objects.equals(age, joueur.age);
}
       
@Override
public int hashCode() {
    return Objects.hash(nom,age);

}

@Override
public int compareTo(Joueur autreJoueur) {
    return this.nom.compareTo(autreJoueur.getNom());
}
        
    
}
