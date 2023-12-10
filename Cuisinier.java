import java.util.Queue;

public class Cuisinier extends Personnel {
    private String nom;
    private String prenom;
    private int salaire;
    private boolean estOccupe = false;
    Cuisinier(Personnel personnel, String nom, String prenom, int salaire, Restaurant resto){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        personnel.ajouterEmployes(this, resto);
    }
    public String getNom() {
        return nom;
    }

    public boolean estOccupe(){
 
        return estOccupe;
    }

     public void travail(Queue <String> arg_Queue,Menu arg_menu, Ingredients liste){

        System.out.println("Avez vous terminer les plats");
        while (!arg_Queue.isEmpty()) {
        
            String element = arg_Queue.poll(); // Supression du plat car terminé
            liste.modifierIngredients(arg_menu.find_ingredient_sub(element)); // Supression de l'ingrédients.

            }
        }

    }

