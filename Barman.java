public class Barman extends Personnel {
    private String nom;
    private String prenom;
    private int salaire;
    Barman(Personnel personnel, String nom, String prenom, int salaire, Restaurant resto){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        personnel.ajouterEmployes(this, resto);
    }
    public String getNom() {
        return nom;
    }
    
}