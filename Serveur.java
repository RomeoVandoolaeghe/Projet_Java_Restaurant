public class Serveur extends Personnel{
    private String nom;
    private String prenom;
    private int salaire;
    private boolean occupee;
    Serveur(Personnel personnel, String nom, String prenom, int salaire, Restaurant resto){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.occupee = false;
        personnel.ajouterEmployes(this, resto);
    }
    public String getNom() {
        return nom;
    }
}