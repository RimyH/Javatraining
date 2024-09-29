package EXO3;

public class Palindrome {
    
    public boolean palindrome(String phrase) {

        // Supprime la ponctuation et les espaces de la phrase et la convertir en minuscules
        String phraseSansPonctuation = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();  // supprime la ponctuation et les espaces en utilisant une expression régulière ("[^a-zA-Z]" signifie "tout sauf les lettres de l'alphabet") . Ensuite, elle convertit la phrase en minuscules en utilisant la méthode toLowerCase()
        
        // Vérifie si la phrase est un palindrome en la comparant avec son inversion
        String phraseInverse = new StringBuilder(phraseSansPonctuation).reverse().toString();
        return phraseSansPonctuation.equals(phraseInverse);
    }

}
