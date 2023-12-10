import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Menu {
    
    private LinkedHashMap<String, Integer> menu;
    private LinkedHashMap<String, Integer> plat_ingredient;
    private LinkedHashMap<String, Integer> menu_mise_jour;
    
    public Menu(){

        menu = new LinkedHashMap<String,Integer>();
        plat_ingredient = new LinkedHashMap<String,Integer>();
        menu_mise_jour = new LinkedHashMap<String,Integer>();
        

        menu.put("Salade Tomate",9);
        menu.put("Salade", 9);
        menu.put("Potage Oignion", 8);
        menu.put("Potage Tomate", 8);
        menu.put("Potage Champignons", 8);
        menu.put("Burger Complet", 15);
        menu.put("Burger sans tomate", 15);
        menu.put("Burger Steak", 15);
        menu.put("Pizza fromage", 12);
        menu.put("Pizza Champignon", 12);
        menu.put("Pizza Chorizo", 12);
        menu.put("Limonade", 4);
        menu.put("Cidre Doux", 5);
        menu.put("Bière sans alcool",5);
        menu.put("Jus de Fruit",1);
        menu.put("Verre d'eau",0);

    }


    public LinkedHashMap<String, Integer> find_ingredient(String arg_nom_plat){

        switch (arg_nom_plat) {
            case "Salade Tomate":
                plat_ingredient.put("Salade",1);
                plat_ingredient.put("Tomate",1);
                break;
            case "Salade":
                plat_ingredient.put("Salade",1);
                break;
            case "Potage Oignion":
                plat_ingredient.put("Oignon",3);
                break;
            case "Potage Champignons":
                plat_ingredient.put("Oignon",3);
                break;
            case "Potage Tomate":
                plat_ingredient.put("Tomate",3);
                break;
            case "Burger Complet":
                plat_ingredient.put("Pain",1);
                plat_ingredient.put("Salade",1);
                plat_ingredient.put("Tomate",1);
                plat_ingredient.put("Steak",1);
                break;
            case "Burger sans tomate":
                plat_ingredient.put("Pain",1);
                plat_ingredient.put("Salade",1);
                plat_ingredient.put("Steak",1);
                break;
            case "Burger Steak":
                plat_ingredient.put("Pain",1);
                plat_ingredient.put("Steak",1);
                break;
            case "Pizza fromage":
                plat_ingredient.put("Pate Pizza",1);
                plat_ingredient.put("Tomate",1);
                plat_ingredient.put("Fromage",1);
                break;
             case "Pizza Champignon":
                plat_ingredient.put("Pate Pizza",1);
                plat_ingredient.put("Tomate",1);
                plat_ingredient.put("Fromage",1);
                plat_ingredient.put("Champignon",1);
                break;            
             case "Pizza Chorizo":
                plat_ingredient.put("Pate Pizza",1);
                plat_ingredient.put("Tomate",1);
                plat_ingredient.put("Fromage",1);
                plat_ingredient.put("Chorizo",1);
                break;   
            default:
                break;
        }

        return plat_ingredient;
    }


    public LinkedHashMap<String,Integer> afficherMenu(Ingredients ingredients) {

        System.out.println("Voici le menu du restaurant:");
        Integer num_plat = 0;

    
        for (Entry<String, Integer> entry : menu.entrySet()) {

            String nom = entry.getKey();
            Integer prix = entry.getValue();

            plat_ingredient.clear();
            plat_ingredient = find_ingredient(nom); // Recherche des ingrédients pour le plat
            boolean ingredient_suffisant = true;

            if(prix > 5){ // Il s'agit d'un plat

                for (Entry<String, Integer> entry_2 : plat_ingredient.entrySet()) {
                
                String ingredient = entry_2.getKey();
                Integer quantiteNecessaire = entry_2.getValue();

                if(quantiteNecessaire > ingredients.getQuantite(ingredient)){

                    ingredient_suffisant = false;
                }
            }

            }
    
            if (prix <= 5) {
                System.out.println(nom + ", Prix : " + prix + " euros" +" (Disponible)" + " numéro plat ");
                menu_mise_jour.put(nom,prix);
                num_plat++;
            }else if(prix>5 && ingredient_suffisant ) {
                System.out.println( nom + ", Prix : " + prix + " euros" + " (Disponible)" + " numéro plat ");
                menu_mise_jour.put(nom,prix);
                num_plat++;
            }
        }

        return menu_mise_jour;
    }


}