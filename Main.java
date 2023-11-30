
public class Main {
 
    public static void main(String[] args) {

    // Tables du restaurant
    table t1 =  new table(0,6);


    // Association client à une table
    client c1 = new client(6);  
    t1.associer_serveur("Serveur 1",c1.getNbrClients()); 

    // Création de la commande
    commande co1 = new commande(t1.commander());
    co1.get_commande();

    }

    
}
