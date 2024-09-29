package EXO4;

public class Anagramme {
    

   public boolean isAnagramme(String s1, String s2) {

    // Convertit les phrases en tableaux de caractères
    char[] s1Chars = s1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
    char[] s2Chars = s2.replaceAll("[\\s]", "").toLowerCase().toCharArray();
    
    // Trie les tableaux de caractères
    java.util.Arrays.sort(s1Chars);
    java.util.Arrays.sort(s2Chars);
    
    // Vérifie si les tableaux triés sont égaux
    return java.util.Arrays.equals(s1Chars, s2Chars);
   }
}
