package EXO9;
import java.util.function.Predicate;

public class EXO9 {
    public static void main(String[] args) {

        Predicate<String> testpredicate = s -> s.length()>4;
        Predicate<String> testpredicateempty = s -> !s.isEmpty();
        Predicate<String> testpredicatedebutj = s -> s.startsWith("J");
        Predicate<String> testpredicateegale = s -> s.length()==5;
        Predicate<String> teststartwithjandlength = testpredicatedebutj.and(testpredicateegale);


        //test 
        System.out.println(testpredicate.test("Bonjour")); // true
        System.out.println(testpredicateempty.test(""));//false
        System.out.println(testpredicatedebutj.test("Job"));//true
        System.out.println(testpredicateegale.test("Rimy")); // false
        System.out.println(teststartwithjandlength.test("Jimyy")); // true 


    }


}
