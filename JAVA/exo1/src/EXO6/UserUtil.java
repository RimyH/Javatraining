package EXO6;


import java.util.Arrays;
//import java.util.Objects;

public class UserUtil {

    public static void raise(User[] users, int percentage) {

        for (User user : users) {
            double augmentation = user.getSalaire() * percentage / 100.0;
            user.raise((int) augmentation);
        }

    }

    public static double getMaxSalary(User[] users) {

        double maxSalaire = users[0].getSalaire(); /// la premier valeur
        for (User user : users) {
            if (user.getSalaire() > maxSalaire) {
                maxSalaire = user.getSalaire();
            }
        }
        return maxSalaire;
    }

    public static double getAverageSalary(User[] users) {

        double moySalaire = 0; /// la moyenne = 0 innitialisation

        for (User user : users) {

            moySalaire += user.getSalaire();
        }

        return moySalaire;
    }

   

    public static double getMedianSalary(User[] users) {
        Arrays.sort(users, (user1, user2) -> Double.compare(user1.getSalaire(), user2.getSalaire()));  /////// la methode developpee 
        // Calculer la médiane
        int taille = users.length;
        if (taille % 2 == 0) {
            // Si la taille est paire, moyenne des deux valeurs du milieu
            int index1 = taille / 2 - 1;
            int index2 = taille / 2;
            return (users[index1].getSalaire() + users[index2].getSalaire()) / 2.0;
        } else {
            // Si la taille est impaire, valeur du milieu
            int index = taille / 2;
            return users[index].getSalaire();
        }

    }

}