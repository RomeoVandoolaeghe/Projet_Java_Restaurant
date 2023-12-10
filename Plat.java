import java.util.LinkedHashMap;
import java.util.Map;

public class Plat {

    private Map<String, Integer> plat_ingredient;
    private String nom_plat;
    private boolean isReady;

   
    public Plat(String arg_nom_Plats){
        plat_ingredient = new LinkedHashMap<>();
        this.nom_plat = arg_nom_Plats;
        this.isReady = false;
    }


    public void Ready(){

        isReady = true;
    }
}