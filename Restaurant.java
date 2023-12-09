import java.util.Stack;
import java.util.HashMap;

enum Jour{
    MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE //Fermé Lundi
}

public class Restaurant {
    private HashMap<String, Personnel> listePersonnel = new HashMap<>();

    private Stack<String> listeEq1 = new Stack<>();//Liste équipe 1
    private Stack<String> listeEq2 = new Stack<>();//Liste équipe 2

    private String jourCourant = "Ma";
    public Boolean ouvert = false;


    public void ajoutListePersonnel(String nom, Personnel newGuy) {// 1 ou 2
        this.listePersonnel.put(nom, newGuy);
        
    }
    public void ajoutEq(int numEquipe, String nom, String job){
        if(numEquipe == 1){//equipe 1
            this.listeEq1.push(nom+"("+job+")");
        }
        else{//equipe 2
            this.listeEq2.push(nom+"("+job+")");
        }
    }
    public void supprimerEmployes(String nom, Personnel perso){
        this.listePersonnel.remove(nom);
    }
    public void afficherEquipe1(){
        Stack<String> listeEq = (Stack<String>)this.listeEq1.clone();
        System.out.println("Equipe 1 :");
        while(!listeEq.empty()){
            System.out.println(listeEq.pop());
        }
        System.out.println();
    }
    public void afficherEquipe2(){
        Stack<String> listeEq = (Stack<String>)this.listeEq2.clone();
        System.out.println("Equipe 2 :");
        while(!listeEq.empty()){
            System.out.println(listeEq.pop());
        }
        System.out.println();
    }

    public void estOuvert(Personnel equipes){
        if(this.jourCourant == "Ma" || this.jourCourant == "Me" || this.jourCourant == "S"){//Equipe 1
            this.ouvert = equipes.equipe1Prete(this.jourCourant);
        }
        else if(this.jourCourant == "L"){// Toujours fermé le lundi
            this.ouvert = false;
            System.out.println("Aujourd'hui ("+jourCourant+"), le restaurant est fermé !");
            System.out.println();
        }
        else{//Equipe 2
            this.ouvert = equipes.equipe2Prete(this.jourCourant);
        }
    }
    public void setJourCourant(String jourCourant) {
        this.jourCourant = jourCourant;
    }
    public void fermeture(){
        this.ouvert = false;
    }


}