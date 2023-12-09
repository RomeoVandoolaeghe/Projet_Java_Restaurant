
public class Main {
 
    public static void main(String[] args) {

    // Table du restaurant
    table t1 =  new table(0,6);
    table t2 =  new table(1,6);
    table t3 =  new table(2,4);
    table t4 =  new table(3,4);

    
    // Arriver de client
    client c1 = new client(4);

    // On choisit une table
    table s1 = t4.dispo_table(c1.getNbrClients());
 
    
    s1.associer_serveur("Serveur 1",c1.getNbrClients()); 

    // Création de la commande
    //commande co1 = new commande(t1.commander());
    
    // Registre de facture (+1 facture)
    //Facture f1 =new Facture();
    //f1.ajouter_factures(co1.get_commande());

    }

    
}
