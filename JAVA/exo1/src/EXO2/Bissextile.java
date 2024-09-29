
package EXO2 ;
public class Bissextile {
    public boolean MthBissextile (int annee){

        // Vérifie si l'année est divisible par 4 mais non divisible par 100, ou divisible par 400

       if (annee % 4 == 0) {
        if (annee % 100 == 0) {
            return annee % 400 == 0;

        } else {
            return true;
        }
    } else {
        return false;
    }
    
    }

}
