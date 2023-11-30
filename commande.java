
import java.util.Queue;
import java.util.LinkedList;

public class commande{

    private Queue<String> commande;

    public commande(Queue<String> arg_maQueue){

        this.commande = new LinkedList<>();

        while(!arg_maQueue.isEmpty()){

            commande.add(arg_maQueue.poll()); // Liste avec la commande
        }
    }

    public Queue<String> get_commande(){
  
        for(String produit: commande){

            System.out.println(produit); // Test
        }

        return commande;

    }

}
