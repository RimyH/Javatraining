package EXO11;
//import java.util.Comparator;


public class Person /*implements Comparator<Person>*/ {


    private String FirstName;
    private String LastName;
    private int age;

    //@Override

    //methode 1 
    //comparateur de nom de famille 
    /*public int compare (Person p1, Person p2) {

        return p1.getLastName().compareTo(p2.getLastName());

    }

//comparer firsname si last name sont egaux 
    public int comparefirstname(Person p1, Person p2) {
        int compareLastName = p1.getLastName().compareTo(p2.getLastName());
        if (compareLastName == 0) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
        return compareLastName;
    }*/

//methode 2 
/* 
Comparator<Person> comparatorByLastName = Comparator.comparing(Person::getLastName);

Comparator<String> comparatorLastName = (String o1, String o2) -> o1.compareTo(o2);//2 eme methode 

String o1=this.LastName;
String o2=this.firstName;


Comparator<Person> comparatorByFirstName = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName);



Comparator<Person> comparatorByLastNameThenFirstNameReversed = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName).reversed();
Comparator<Person> comparatorNullsLast = Comparator.nullsLast(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
*/

public Person(String firstName, String lastName, int age) {
    this.FirstName = firstName;
    this.LastName = lastName;
    this.age = age;
}


    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

 



}
