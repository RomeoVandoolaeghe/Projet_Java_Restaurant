public class main1 {
    public static void main(String[] args) {
        Restaurant resto = new Restaurant();
        Personnel equipes = new Personnel();

        Manager Smith = new Manager(equipes, "Smith", "John", 1200, resto);

        Cuisinier Smith2 = new Cuisinier(equipes, "Smith2", "John", 1200, resto);
        Cuisinier Smith3 = new Cuisinier(equipes, "Smith3", "John", 1200, resto);
        Cuisinier Smith4 = new Cuisinier(equipes, "Smith4", "John", 1200, resto);
        Cuisinier Smith5 = new Cuisinier(equipes, "Smith5", "John", 1200, resto);

        Serveur Smith6 = new Serveur(equipes, "Smith6", "John", 1200, resto);
        Serveur Smith7 = new Serveur(equipes, "Smith7", "John", 1200, resto);

        Barman Smith8 = new Barman(equipes, "Smith8", "John", 1200, resto);
        Barman Smith9 = new Barman(equipes, "Smith9", "John", 1200, resto);

        resto.afficherEquipe1();
        resto.afficherEquipe2();
        resto.estOuvert(equipes);

        //Lundi : L => Toujours fermé
        //Mardi : Ma
        //Mercredi : Me
        //Jeudi : J
        //Vendredi : V
        //Samedi : S
        //Dimanche : D
        resto.setJourCourant("J");

        resto.afficherEquipe1();
        resto.afficherEquipe2();
        resto.estOuvert(equipes);
    }
}
