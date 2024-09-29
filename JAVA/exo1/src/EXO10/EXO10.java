package EXO10;

//import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.BiFunction;


public class EXO10 {
    public static void main(String[] args) {

     //T the type of function argument   function <T,R>
     //R the type of function result
Function<String,String> stringToUperCase = s -> s.toUpperCase();
Function<String,String> stringTosame = s -> (s != null) ? s : ""  ;    
Function<String,Integer> stringLength = s -> (s != null) ? s.length() : 0 ;   // variable = (condition) ? valeur_si_vrai : valeur_si_faux;                    
                                                                             //en gros si c'est vrai fait s.length | sinon si faux s = 0 
String chaine = "Rimy";

Function<String,String> entreParentheses= s -> (s != null) ? "("+ s + ")" : "("+ ")"    ; // en gros si on donne une chaine elle affiche une chaine entre parenthese sinon elle affiche uniquement les parenthese

BiFunction<String, String, Integer> positionDeuxiemeChaine = (s1, s2) -> (s1 != null && s2 != null) ? s1.indexOf(s2) : -1;

Function<String,Integer> reponse6 =  s -> positionDeuxiemeChaine.apply("abcdefghi", s);


//test avec apply 

System.out.println(stringToUperCase.apply("Bonjour")); // "BONJOUR

System.out.println(stringToUperCase.apply(chaine)); // "RIMY

System.out.println(stringTosame.apply("")); // vide

System.out.println(stringLength.apply("rimyhanou")); // "9

System.out.println(stringLength.apply("")); // "0

System.out.println(entreParentheses.apply("rimy")); // " resultat (rimy)
System.out.println(entreParentheses.apply("")); // " resultat ()

System.out.println(positionDeuxiemeChaine.apply("Bonjour", "nj")); // " resultat 2 eme position
System.out.println(positionDeuxiemeChaine.apply("Rimy", "hn")); // " resultat -1 


System.out.println(reponse6.apply("ghi")); // " resultat 6 compte les 2 caracter davant 
System.out.println(reponse6.apply("yo")); // " resultat -1

    }




}
