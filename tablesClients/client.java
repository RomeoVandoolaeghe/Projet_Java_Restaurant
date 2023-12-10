package tablesClients;

public class client {

    protected int nbrClients;

    public client(int argnbrClients){
        this.nbrClients = argnbrClients;
        System.out.println(argnbrClients + " arrivent aux restaurants !");
    }

    public int getNbrClients() {
        return nbrClients;
    }
    
}
