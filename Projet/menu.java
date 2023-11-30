import java.util.HashMap;

public class menu {
    

    protected HashMap<String, Integer> menu = new HashMap<String,Integer>(); //
    protected String [] ingredients_necessaires_plat;
    
    public menu(String [] ingredients_necessaires_plat){
        menu.put("Salade Tomate",9);
        menu.put("Salade", 9);
        menu.put("Potage Oignon", 8);
        menu.put("Potage Tomate", 8);
        menu.put("Potage Champignons", 8);
        menu.put("Burger Complet", 15);
        menu.put("Burger sans tomate", 15);
        menu.put("Burger Steak", 15);
        menu.put("Pizza fromage", 12);
        menu.put("Pizza Champignon", 12);
        menu.put("Pizza Chorizo", 12);

        

        this.ingredients_necessaires_plat=ingredients_necessaires_plat;
    }

    public boolean dire_si_plat_disponible(int num_plat,String [] ingredients_necessaires_plat){
        return true;            
    }


}
