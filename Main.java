import java.util.Stack;

public class Main {
 
    public static void main(String[] args) {


    /* 

    // Table du restaurant
    table t1 =  new table(0,6);
    table t2 =  new table(1,6);
    table t3 =  new table(2,4);
    table t4 =  new table(3,4);


    // Arriver de client
    client c1 = new client(4);

    // On choisit une table
    table s1 = t4.dispo_table(c1.getNbrClients());
    Stack<Integer> equipe
    s1.associer_serveur("Serveur 1",c1.getNbrClients()); 

    // Création de la commande
    //commande co1 = new commande(t1.commander());
    
    // Registre de facture (+1 facture)
    //Facture f1 =new Facture();
    //f1.ajouter_factures(co1.get_commande());

    */
    Restaurant resto = new Restaurant();
    Personnel equipes = new Personnel();

    Manager Smith = new Manager(equipes, "Smith", "John", 1200, resto);

    Cuisinier Smith2 = new Cuisinier(equipes, "Smith2", "John", 1200, resto);
    Cuisinier Smith3 = new Cuisinier(equipes, "Smith3", "John", 1200, resto);
    Cuisinier Smith4 = new Cuisinier(equipes, "Smith4", "John", 1200, resto);
    Cuisinier Smith5 = new Cuisinier(equipes, "Smith5", "John", 1200, resto);

    Serveur Smith6 = new Serveur(equipes, "Smith6", "John", 1200, resto);
    Serveur Smith7 = new Serveur(equipes, "Smith7", "John", 1200, resto);

    Barman Smith8 = new Barman(equipes, "Smith8", "John", 1200, resto);
    Barman Smith9 = new Barman(equipes, "Smith9", "John", 1200, resto);

  
    resto.setJourCourant("J");

    resto.afficherEquipe1();
    resto.afficherEquipe2();
    resto.estOuvert(equipes);

    }
}
