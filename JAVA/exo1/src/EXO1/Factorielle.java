package EXO1;
import java.math.BigInteger;

public class Factorielle {

    public int  intFactorielle(int n) {

        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;         //resultat multiplier par i a chaque iteration 
        }
        return resultat;
    
    }
    
    public double doubleFactorielle(int n) { 
    
        double resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;         //resultat multiplier par i a chaque iteration 
        }
        return resultat;
    
    }
    
    public BigInteger bigIntFactorielle(int n) {   //methode qui permet de depasser la taille de int vu qu'elle est grande en la manipule (des chaine de caractere ) genre avec des methode .
    
        BigInteger resultat = BigInteger.ONE;     //resultat egale a 1 en tant qu'objet BigInteger
        for (int i = 1; i <= n; i++) {
            resultat = resultat.multiply(BigInteger.valueOf(i));
        }
        return resultat;
    }
    

}
