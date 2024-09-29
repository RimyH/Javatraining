package EXO4;

public class Main {
    
    public static void main(String[] args) {
        Anagramme anagrammecheck = new Anagramme();

        String[] phrase1 = {"Paul","Telecom" ,"Bonjour le Monde" };
        String[] phrase2 = {"Ngolo","Galilee" ,"Hello world" };

        String[] phrase3 = {"Galilee","Serveur" ,"Boris Vian","La foret amazonienne"};
        String[] phrase4 = {"egaille","reveurs" ,"Bison ravi" , "La zone enorme fanait"};


        // Vérification des anagrammes pour les  phrases 1 et 2
        for (int i = 0; i < phrase1.length; i++) {
            boolean estAnagramme = anagrammecheck.isAnagramme(phrase1[i], phrase2[i]);
            System.out.println(phrase1[i] + " et " + phrase2[i] + " : " + estAnagramme);
        }

        // Vérification des anagrammes pour les  phrases 3 et 4
        for (int i = 0; i < phrase3.length; i++) {
            boolean estAnagramme = anagrammecheck.isAnagramme(phrase3[i], phrase4[i]);
            System.out.println(phrase3[i] + " et " + phrase4[i] + " : " + estAnagramme);
        }

}


}