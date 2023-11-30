package Restaurant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Restaurant.Plat;





public class Menu {
    
    //attributs
    private ArrayList<Plat> plats;

    //constructeur du menu
    public Menu() {
        this.plats = new ArrayList<>();
    }

    
    //méthode pour ajouter un plat dans le menu
    public void ajouterPlat(Plat plat) {
        plats.add(plat);
    }

    //méthode qui affiche le menu
    public void afficherMenu() {
        System.out.println("Menu du restaurant :");
        for (Plat plat : plats) {
            System.out.println("Nom du plat : " + plat.getNom());
            System.out.println("Ingrédients : " + plat.getIngredients());
            System.out.println("Prix : " + plat.getPrix() + " €\n");
        }
    }


    public static void main(String[] args){
        Plat plat2 = new Plat("Salade Tomate", new ArrayList<>(List.of(Ingredients.SALADE, Ingredients.TOMATE)), 8.99);

        Menu menu = new Menu();

        menu.ajouterPlat(plat2);
        menu.afficherMenu();
    }




}
