package EXO5;

public class EXO5 {
    public static void main (String[] args) {

        User u1 = new User("Hanou", "Rimy", (double) 50000);

        User u2 = new User("Hanou", "Rimy", (double) 50000);

        User u3 = new User("Snow","John", (double) 60000);

    
        //avec methode to string on peut afficher comme on veut sinon il va afficher les adrresses
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u2.equals(u3));

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());

//Comment doivent-être leurs valeurs ?  u1 et u2 egaux u3 une addresse differente 


        System.out.println(u1.compareTo(u2));
        System.out.println(u1.compareTo(u3));
        System.out.println(u2.compareTo(u3));
    }
    
}
