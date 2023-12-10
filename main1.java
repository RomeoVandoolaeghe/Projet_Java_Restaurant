import tablesClients.table;

import java.util.LinkedHashMap;
import java.util.Queue;

import tablesClients.client;

public class main1 {
    public static void main(String[] args) {
        Restaurant resto = new Restaurant();
        Personnel equipes = new Personnel();
 
        table t1 =  new table(0,6);
        table t2 =  new table(1,6);
        table t3 =  new table(2,4);
        table t4 =  new table(3,4);
        int nbrTables = 4;

        Manager Smith = new Manager(equipes, "Smith", "John", 1200, resto);

        Cuisinier Smith2 = new Cuisinier(equipes, "Smith2", "John", 1200, resto);
        Cuisinier Smith3 = new Cuisinier(equipes, "Smith3", "John", 1200, resto);
        Cuisinier Smith4 = new Cuisinier(equipes, "Smith4", "John", 1200, resto);
        Cuisinier Smith5 = new Cuisinier(equipes, "Smith5", "John", 1200, resto);

        Serveur Smith6 = new Serveur(equipes, "Smith6", "John", 1200, resto);
        Serveur Smith7 = new Serveur(equipes, "Smith7", "John", 1200, resto);

        Barman Smith8 = new Barman(equipes, "Smith8", "John", 1200, resto);
        Barman Smith9 = new Barman(equipes, "Smith9", "John", 1200, resto);


        // Arrivée de client
        client c1 = new client(4);
    
        // On choisit une table
        table s1 = t4.dispo_table(c1.getNbrClients());

        if(!Smith6.estOccupe()){//S'il est pas occupé
            Smith6.nouvelleTableAssignees(nbrTables);
            s1.associer_serveur(Smith6.getNom(),c1.getNbrClients());
        }
        else{
            Smith7.nouvelleTableAssignees(nbrTables);
            s1.associer_serveur(Smith7.getNom(),c1.getNbrClients());
        }
   
        resto.setJourCourant("Ma");
        resto.afficherEquipe1();
        resto.afficherEquipe2();
        resto.estOuvert(equipes);


        Ingredients reserve = new Ingredients(); // Réserve d'ingrédient
        Menu menu= new Menu(); // Menu

       LinkedHashMap<String,Integer> m1 = menu.afficherMenu(reserve);// Affiche menu

      t1.commander_plat(m1);





    }
}
