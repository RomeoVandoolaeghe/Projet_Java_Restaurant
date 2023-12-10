import java.util.Queue;

public class Barman extends Personnel {
    private String nom;
    private String prenom;
    private int salaire;
    private boolean estOccupe;
    Barman(Personnel personnel, String nom, String prenom, int salaire, Restaurant resto){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.estOccupe = false;
        personnel.ajouterEmployes(this, resto);
    }
    public String getNom() {
        return nom;
    }

    public boolean estOccupe(){
        return estOccupe;
    }

    public void travail(Queue <String> arg_Queue){

        System.out.println("Avez vous terminer les boissons");
        while (!arg_Queue.isEmpty()) {
        
            String element = arg_Queue.poll(); 
            System.out.println(element + " vient d'être terminer");
        }

    }
    
}
