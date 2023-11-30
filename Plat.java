package Restaurant;
import java.util.ArrayList;

import Restaurant.Ingredients;


public class Plat {
    //attributs
    private String nom;
    private ArrayList<Ingredients> ingredients;
    private double prix;


    //constructeur du plat
    public Plat(String nom, ArrayList<Ingredients> ingredients, double prix) {
    this.nom = nom;
    this.ingredients = ingredients;
    this.prix = prix;
    }

    public String getNom() { //getter du nom du plat
        return nom;
    }

    public ArrayList<Ingredients> getIngredients() { //getter des ingredients du plat
        return ingredients;
    }

    public double getPrix() { //getter du prix du plat
        return prix;
    }

}



