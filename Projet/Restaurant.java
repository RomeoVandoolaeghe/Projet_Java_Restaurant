import java.nio.file.Path;
import java.util.HashMap;

public class Restaurant {
    private HashMap<String, Integer> reserve = new HashMap<>();//De la forme : "Tomate" = 3 
    private String[] factures;//De la forme : [1] => "lien_vers_facture1"
    private int nbrFactures = 0;
    private Table[] tables = new Table[10];
    private HashMap<String, Personnel> employes = new HashMap<>();
    private int nbrCuisiniers = 0;
    private int nbrServeurs = 0;
    private int nbrManagers = 0;
    private int nbrBarman = 0;
    public Boolean ouvert = false;

    public void ajouterEmployes(Personnel personne){
        this.employes.put(personne.nom, personne);
    }
    public void supprimerEmployes(String personne){
        this.employes.remove(personne);
    }
    public void supprimerFactures(){
        this.factures.clear();
    }
    public void ouverture(){
        if(nbrBarman >= 1 && nbrCuisiniers >= 4 && nbrManagers >= 1 && nbrServeurs >= 2){
            this.ouvert = true;
        }
    }
    public void fermeture(){
        this.ouvert = false;
    }
    public HashMap<String, Integer> getReserve(){
        return this.reserve;
    }
    public void ajouterFacture(String path){
        this.factures[nbrFactures] = path;
        this.nbrFactures += 1;
    }

}


