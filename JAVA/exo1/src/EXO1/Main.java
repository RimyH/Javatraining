
package EXO1 ;
public class Main {
    
    public static void main (String[] args) {
        Factorielle fact = new Factorielle() ;
        System.out.println("Factorielle double de 10 = " +
           fact.doubleFactorielle(10)) ;
    
        System.out.println("Factorielle double de 13 = " +
           fact.doubleFactorielle(13)) ;
    
        System.out.println("Factorielle double de 25 = " +
           fact.doubleFactorielle(25)) ;
    
    
           System.out.println("Factorielle Bigint de 10 = " +
           fact.bigIntFactorielle(10)) ;
    
        System.out.println("Factorielle de Bigint 13 = " +
           fact.bigIntFactorielle(13)) ;
    
        System.out.println("Factorielle de Bigint 25 = " +
           fact.bigIntFactorielle(25)) ;
    
    
    
        System.out.println("Factorielle int de 10 = " +
            fact.intFactorielle(10)) ;
    
        System.out.println("Factorielle int de 13 = " +
            fact.intFactorielle(13)) ;
    
        System.out.println("Factorielle int de 25 = " +
            fact.intFactorielle(25)) ;
     }
     
    
}


// Que constatez-vous ? : lorsque on utilise des nombre grand si on utilise int et double le resultat sera incorrect vu quelle ont des taille limite et c'est pour ca q'uon utiliser bigint pour calculer les plus grande factorielle 