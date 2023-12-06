import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class table {
    
    private int idTable;
    private String nom_serveur;
    private int nbrePlaces;
    private int placeoccuper;
    private boolean occuper_table;
    private static List<table> instances = new ArrayList<>(); // Liste des tables


    table(int arg_idTable,int arg_nbrePlaces){

        this.idTable = arg_idTable;
        this.nom_serveur = "Pas de serveur";
        this.nbrePlaces = arg_nbrePlaces;
        this.occuper_table = false;
        this.placeoccuper = 0;
        instances.add(this); // Tableau avec les tables
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

    public Queue<String> commander(){

        int clients_table = placeoccuper;
        Queue<String>liste_commande = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);


            for(int i=0;i<clients_table;i++){
                System.out.println("Vos choix de boisson ?");
                String boisson = scanner.nextLine();
                liste_commande.add(boisson);

            }

            for(int i=0;i<clients_table;i++){

                System.out.println("Vos choix de plats ?");
                String repas = scanner.nextLine();
                liste_commande.add(repas);
            }

            scanner.close(); 
            return liste_commande;
    }

   

}
