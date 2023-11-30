public class Serveur extends Personnel{
    private String nom;
    private String prenom;
    private int salaire;
    Serveur(Personnel personnel, String nom, String prenom, int salaire, Restaurant resto){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        personnel.ajouterEmployes(this, resto);
    }
    public String getNom() {
        return nom;
    }
}
