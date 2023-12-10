import java.util.LinkedHashMap;
import java.util.Map;


public class Ingredients {
    private Map<String, Integer> ingredientsMap;

    public Ingredients() {
        ingredientsMap = new LinkedHashMap<>();
        ingredientsMap.put("Salade", 0);
        ingredientsMap.put("Tomate", 10);
        ingredientsMap.put("Oignon", 10);
        ingredientsMap.put("Champignon", 10);
        ingredientsMap.put("Pain", 10);
        ingredientsMap.put("Steak", 10);
        ingredientsMap.put("Pate Pizza", 10);
        ingredientsMap.put("Fromage", 10);
        ingredientsMap.put("Chorizo", 10);
    }


    public Map<String,Integer> getMap(){

        return ingredientsMap;

    }

    public Integer getQuantite(String arg_nom) {
        return ingredientsMap.getOrDefault(arg_nom, 0); // Retourne 0 si la clé n'est pas trouvée.
    }
    

    public void modifierIngredients(Map<String, Integer> ingredientsAEnlever) {

        for (Map.Entry<String, Integer> entry : ingredientsAEnlever.entrySet()) {
            String ingredient = entry.getKey();
            int quantiteAEnlever = entry.getValue();

            if (ingredientsMap.containsKey(ingredient)) {
                int quantiteActuelle = ingredientsMap.get(ingredient);
                int nouvelleQuantite = quantiteActuelle - quantiteAEnlever;

                if (nouvelleQuantite < 0) {
                    System.out.println("Quantité insuffisante de " + ingredient + " : " + quantiteActuelle);
                } else {
                    ingredientsMap.put(ingredient, nouvelleQuantite);
                    System.out.println("Quantité de " + ingredient + " mise à jour : " + nouvelleQuantite);
                }
            } else {
                System.out.println("Ingrédient inconnu : " + ingredient);
            }
        }
    }


}

