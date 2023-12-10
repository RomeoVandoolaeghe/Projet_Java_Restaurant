

import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class table {
    
    private int idTable;
    private String nom_serveur;
    private int nbrePlaces;
    private int placeoccuper;
    private boolean occuper_table;
    private static List<table> tableau = new ArrayList<>(); // Liste des tables


    public table(int arg_idTable,int arg_nbrePlaces){

        this.idTable = arg_idTable;
        this.nom_serveur = "Pas de serveur";
        this.nbrePlaces = arg_nbrePlaces;
        this.occuper_table = false;
        this.placeoccuper = 0;
        tableau.add(this); // Tableau avec les tables
    }

    public int getIdTable() {
        return idTable;
    }

    public int getNbrePlaces() {
        return nbrePlaces;
    }

    public String getNom_serveur() {
        return nom_serveur;
    }

    public int getplaceoccuper(){

        return placeoccuper;
    }

    public boolean getoccuper_table(){

        return occuper_table;

    }


    public List<table> gettableautable(){

        return tableau;
    }

    public void liberer_table(){

        this.nom_serveur = "Pas de Table";
        this.occuper_table = false;
        this.placeoccuper = 0;

    }



    public void associer_serveur(String arg_nom_serveur,int arg_placeoccuper){

        this.nom_serveur = arg_nom_serveur;
        this.occuper_table = true;
        this.placeoccuper = arg_placeoccuper;

        
    }



    public table dispo_table(int arg_nombres_clients){

        table TableChoisis = null;
        int minPlacesRestantes = Integer.MAX_VALUE;
        

        for (table instance : tableau) {

            int places = instance.getNbrePlaces();
            int placesRestantes = places - arg_nombres_clients;

            if (!instance.getoccuper_table() && places >= arg_nombres_clients && placesRestantes < minPlacesRestantes) {

                minPlacesRestantes = placesRestantes;
                TableChoisis = instance;
           
            }
        }

        if (TableChoisis == null) {
            
            System.out.println("Plus de tables disponibles pour " + arg_nombres_clients + " clients.");
        }else{

            System.out.println("La table n° "+ TableChoisis.getIdTable() +" va etre associé "+ "avec " + (TableChoisis.getNbrePlaces() - arg_nombres_clients) + " restantes.");
        }

        return TableChoisis;
    }


    public Queue<String> commander_plat(LinkedHashMap<String, Integer> argMap,int arg_nbrclients) {
      
        Queue<String> commande_final = new LinkedList<>();
        int clients_table =arg_nbrclients ; // Remplacez ceci par le nombre de clients
        Scanner scanner = new Scanner(System.in); // Création d'une instance de Scanner
        String repas = "";


             for(int e=0;e<clients_table;e++){

                System.out.println("Quel plat désirez vous ?");
                repas = scanner.nextLine();

                if(argMap.containsKey(repas)){

                    commande_final.add(repas);

                }else{
                    do{

                        System.out.println("Quel plat désirez vous ?");
                        repas = scanner.nextLine();

                    }while(argMap.containsKey(repas));

                    commande_final.add(repas);
                }

                System.out.println("Quel plat désirez vous?");
                 repas = scanner.nextLine();
             }
         
         scanner.close();

         for(String element : commande_final) {
            System.out.println(element);
        }

        return commande_final;
    

    }


     public Queue<String> commander_boisson(LinkedHashMap<String, Integer> argMap,int arg_nbrclients) {
      
        Queue<String> commande_final = new LinkedList<>();
        int clients_table =arg_nbrclients ; // Remplacez ceci par le nombre de clients
        Scanner scanner = new Scanner(System.in); // Création d'une instance de Scanner
        String repas = "";


             for(int e=0;e<clients_table;e++){

                System.out.println("Quel boisson désirez vous ?");
                repas = scanner.nextLine();

                if(argMap.containsKey(repas)){

                    commande_final.add(repas);

                }else{
                    do{

                        System.out.println("Quel plat désirez vous ?");
                        repas = scanner.nextLine();

                    }while(argMap.containsKey(repas));

                    commande_final.add(repas);
                }

                System.out.println("Quel plat désirez vous?");
                 repas = scanner.nextLine();
             }
         
         scanner.close();

         for(String element : commande_final) {
            System.out.println(element);
        }

        return commande_final;
    

    }

}


