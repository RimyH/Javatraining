package EXO2 ;
public class Main {
    
    public static void main (String[] args) {
        Bissextile bissextileChecker = new Bissextile();

        System.out.println("1900 est bissextile : " + bissextileChecker.MthBissextile(1900));
        System.out.println("1901 est bissextile : " + bissextileChecker.MthBissextile(1901));
        System.out.println("1996 est bissextile : " + bissextileChecker.MthBissextile(1996));
        System.out.println("2000 est bissextile : " + bissextileChecker.MthBissextile(2000));
          
    }
}


