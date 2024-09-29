package EXO11;
import java.util.Comparator;

public class EXO11 {
    
    public static void main(String[] args) {

      Comparator<String> compareParLongueur = Comparator.comparingInt(String::length);

      Comparator<String> comparatorLengthString = (String o1, String o2) -> o1.compareTo(o2);//2 eme methode 

String o1="rimyy";
String o2="rimyyyyy";


//test 
System.out.println(compareParLongueur.compare("Bonjour", "Hellooo")); // 0 (même longueur)
System.out.println(compareParLongueur.compare("B", "Hi")); // -1 ("Bonjour" plus long que "Hi")
System.out.println(compareParLongueur.compare("Bonjour", "Hi")); // 1 ("Bonjour" plus long que "Hi")

System.out.println(comparatorLengthString.compare(o1,o2)); //2eme methode 




//partie 2 

Person person1 = new Person ("ibrahim", "bel", 24); 
Person person2 = new Person ("rimy", "bel", 25); 

Comparator<Person> comparatorByLastName = Comparator.comparing(Person::getLastName);
Comparator<Person> comparatorByFirstName = comparatorByLastName.thenComparing(Person::getFirstName);
Comparator<Person> comparatorByLastNameThenFirstNameReversed =  comparatorByFirstName.reversed();
Comparator<Person> comparatorNullsLast = Comparator.nullsLast(comparatorByFirstName);

//test partie 2 
System.out.println("Comparaison par nom de famille :");
System.out.println(comparatorByLastName.compare(person1,person2));
System.out.println("Comparaison par nom de famille puis prénom :");
System.out.println(comparatorByFirstName.compare(person1, person2)); // Comparaison nom/prénom  resultat -9 
System.out.println();

System.out.println("Comparaison inverse par nom de famille puis prénom inverse :");
System.out.println(comparatorByLastNameThenFirstNameReversed.compare(person2, person1)); // Comparaison nom/prénom en ordre inverse


    }


}


