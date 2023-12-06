
public class Main {
 
    public static void main(String[] args) {

    // Table du restaurant
    table t1 =  new table(0,6);


    // Association client à une table
    client c1 = new client(6);  
    t1.associer_serveur("Serveur 1",c1.getNbrClients()); 

    // Création de la commande
    commande co1 = new commande(t1.commander());
    
    // Registre de facture (+1 facture)
    Facture f1 =new Facture();
    f1.ajouter_factures(co1.get_commande());

    }

    
}
