public class Personnel{
    private int nbrCuisiniers1 = 0;
    private int nbrServeurs1 = 0;
    private int nbrManagers1 = 0;
    private int nbrBarman1 = 0;

    private int nbrCuisiniers2 = 0;
    private int nbrServeurs2 = 0;
    private int nbrManagers2 = 0;
    private int nbrBarman2 = 0;

    //Surcharge de la fonction ajouterEmployes
    public void ajouterEmployes(Barman newGuy, Restaurant resto){
        if(nbrBarman1 < 1){
            this.nbrBarman1 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(1, newGuy.getNom(), "Barman");
        }
        else if(nbrBarman2 < 1){
            this.nbrBarman2 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(2, newGuy.getNom(), "Barman");
        }          
        else{
            System.out.println("Il y a déjà suffisament de barman.");
        }  
    }
    public void ajouterEmployes(Manager newGuy, Restaurant resto){
        if(nbrManagers1 < 1){
            this.nbrManagers1 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(1, newGuy.getNom(), "Manager");
        }
        else if(nbrManagers2 < 1){
            this.nbrManagers2 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(2, newGuy.getNom(), "Manager");
        }          
        else{
            System.out.println("Il y a déjà suffisament de managers.");
        }  
    }
    public void ajouterEmployes(Serveur newGuy, Restaurant resto){
        if(nbrServeurs1 < 2){
            this.nbrServeurs1 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(1, newGuy.getNom(), "Serveur");
        }
        else if(nbrServeurs2 < 2){
            this.nbrServeurs2 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(2, newGuy.getNom(), "Serveur");
        }          
        else{
            System.out.println("Il y a déjà suffisament de serveurs.");
        }  
    }
    public void ajouterEmployes(Cuisinier newGuy, Restaurant resto){
        if(nbrCuisiniers1 < 4){
            this.nbrCuisiniers1 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(1, newGuy.getNom(), "Cuisinier");
        }
        else if(nbrCuisiniers2 < 4){
            this.nbrCuisiniers2 += 1;
            resto.ajoutListePersonnel(newGuy.getNom(), newGuy);
            resto.ajoutEq(2, newGuy.getNom(), "Cuisinier");
        }          
        else{
            System.out.println("Il y a déjà suffisament de cuisiniers.");
        }  
    }
    
    public boolean equipe1Prete(String jourCourant){
        if(this.nbrBarman1 >= 1 && this.nbrCuisiniers1 >= 4 && (this.nbrManagers1 >= 1 || this.nbrManagers2 >= 1) && this.nbrServeurs1 >= 2){
            System.out.println("Aujourd'hui ("+jourCourant+"), le restaurant est ouvert !");
            System.out.println();
            return true;
        }
        else{
            
            System.out.println("Aujourd'hui ("+jourCourant+"), le restaurant est fermé !");
            System.out.println();
            return false;
        }
    }
    public boolean equipe2Prete(String jourCourant){
        if(this.nbrBarman2 >= 1 && this.nbrCuisiniers2 >= 4 && (this.nbrManagers1 >= 1 || this.nbrManagers2 >= 1) && this.nbrServeurs2 >= 2){
            System.out.println("Aujourd'hui ("+jourCourant+"), le restaurant est ouvert !");
            System.out.println();
            return true;
        }
        else{
            System.out.println("Aujourd'hui ("+jourCourant+"), le restaurant est fermé !");
            System.out.println();
            return false;
        }
    }
}