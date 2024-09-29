package EXO6;

public class EXO6 {
    
      public static void main(String[] args) {
    
        User[] users = {
            new User("bel", "ibrahim", 2000),
            new User("hanou", "rimy", 4000),
            new User("ez", "pz", 5000),
            new User("camara", "kevin", 1000),
            new User("toto", "tuto", 7000)
        };

        
       
        UserUtil.raise(users, 10);
        
        
        double maxSalaire = UserUtil.getMaxSalary(users);
        System.out.println("Le salaire le plus élevé est : " + maxSalaire);

        
        double moySalaire = UserUtil.getAverageSalary(users);
        System.out.println("La moyenne des salaires est : " + moySalaire);

        
        double medianSalaire = UserUtil.getMedianSalary(users);
        System.out.println("La médiane des salaires est : " + medianSalaire);
    }



    }
 

