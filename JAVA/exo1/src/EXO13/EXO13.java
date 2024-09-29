package EXO13;
//package org.tpjava2324.hanou-rimy.serie5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;

public class EXO13 {

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");

        // Mettre les valeurs de la table en majuscule
        map.replaceAll((key, value) -> value.toUpperCase());

        // Affichage de la table après la mise en majuscule
        map.forEach((key, value) -> System.out.println(key + " : " + value));



        List<Integer> keys = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Vérification et remplacement  des valeurs null dans la map
        for (Integer key : keys) {
            map.putIfAbsent(key, "");
        }

        // Affichage de la table après modification
        map.forEach((key, value) -> System.out.println(key + " : " + value));


        // 2 eme methode On Utilise ComputeIfAbsent

        keys.forEach(key -> map.computeIfAbsent(key, k -> ""));
        // Affichage de la table 
        System.out.println("\nDeuxieme Methode ComputeIfAbsent :");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        /////////////////////////////// TABLE de HASHAGE

        
        List<String> words = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine", "ten", "eleven", "twelve");

        Map<Integer, List<String>> wordMap = new HashMap<>();

        words.forEach(word -> wordMap.computeIfAbsent(
            word.length(), k -> new ArrayList<>())
            .add(word));

        // Affichage du contenu de wordMap
        System.out.println("");
        wordMap.forEach((key, value) -> System.out.println(key + " : " + value));



        ////// Table de hashage avec des  valeurs String
        Map<Integer, String> concatenatedMap = new HashMap<>();

        words.forEach(word -> {
            int length = word.length();
            concatenatedMap.merge(length, word, (prev, next) -> prev + ", " + next);
        });

        // Affichage du contenu de concatenatedMap
        System.out.println("");
        concatenatedMap.forEach((key, value) -> System.out.println(key + " : " + value));

    }




       }




    

    





