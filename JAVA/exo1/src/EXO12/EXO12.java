package EXO12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;



public class EXO12 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");



// Affichage du contenu de words avec forEach()

        System.out.println("Contenu de words :");
        words.forEach(System.out::println);

// Retirer les mots de longueur paire de la liste
List<String> wordsAfterPaireRemoval = new ArrayList<>(words);
wordsAfterPaireRemoval.removeIf(word -> word.length() % 2 == 0);
//test 
System.out.println("\nContenu de words après suppression des mots de longueur paire :");
wordsAfterPaireRemoval.forEach(System.out::println);


// Mettre en majuscule chaque élément de la liste
List<String> wordsInUpperCase = new ArrayList<>(words);
wordsInUpperCase.replaceAll(String::toUpperCase);  //relaceALL(string type du word , touppercase la methode )
//test 
System.out.println("\n Majuscule chaque élément de la liste :");
wordsInUpperCase.forEach(System.out::println);


// Predicate pour vérifier si un mot commence par une voyelle
Predicate<String> startsWithVoyelle = word -> "aeiou".contains(String.valueOf(word.toLowerCase().charAt(0)));
// Mettre en majuscule uniquement les mots commençant par une voyelle
words.replaceAll(word -> startsWithVoyelle.test(word) ? word.toUpperCase() : word);
 // Affichage de words après la mise en majuscule des mots commençant par une voyelle
 System.out.println("\nContenu de words après mise en majuscule des mots commençant par une voyelle :");
 words.forEach(System.out::println);


// Comparator pour comparer les mots par longueur
  Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
// Trier la liste par longueur des mots
words.sort(lengthComparator);
System.out.println("\nContenu final de words après le tri :");
words.forEach(System.out::println);


List<String> wordsTriAlph = new ArrayList<>(words);
Comparator<String> triordrealphabetique = lengthComparator.thenComparing(String::compareTo);

wordsTriAlph.sort(triordrealphabetique);
// Affichage du contenu final de la liste words après le tri
System.out.println("\nContenu final de words après le tri avec alphabet :");
wordsTriAlph.forEach(System.out::println);






    }



    
}
