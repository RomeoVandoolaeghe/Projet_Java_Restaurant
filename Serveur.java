public class Serveur extends Personnel{
    private String nom;
    private String prenom;
    private int salaire;
    private int nbrTablesAssignees = 0;//Nombre de tables dont il doit s'occuper
    private Boolean occupe = false;

    Serveur(Personnel personnel, String nom, String prenom, int salaire, Restaurant resto){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        personnel.ajouterEmployes(this, resto);
    }
    public String getNom() {
        return nom;
    }


    public void enleveTable(){
        this.nbrTablesAssignees -= 1;
        this.occupe = false;
    }
    public void nouvelleTableAssignees(int nbrTables){
        if(nbrTablesAssignees < nbrTables/2){// Si 4 tables par ex, s'il a moins de 2 tables assignées on lui en assigne une autre, l'autre serveur s'occupera des 2 autres tables
            this.nbrTablesAssignees += 1;
        }
        else{
            this.occupe = true;
        }
    }
    public Boolean estOccupe(){
        return this.occupe;
    }
}
