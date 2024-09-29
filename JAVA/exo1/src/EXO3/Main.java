package EXO3;

public class Main {
    
    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();

        String[] phrases = {
            "Rions noir",
            "Esope reste ici et se repose",
            "Elu par cette crapule",
            "Et la marine va venir a Malte",
            "Severe, dissuasive, je vis aussi de reves"
        };

        for (String phrase : phrases) {
            if (palindromeChecker.palindrome(phrase)) {
                System.out.println("\"" + phrase + "\"" + " est un palindrome.");
            } else {
                System.out.println("\"" + phrase + "\"" + " n'est pas un palindrome.");
            }
        }
    }
}

