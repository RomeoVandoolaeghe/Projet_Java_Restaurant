

import java.util.Queue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Facture {

   
    public void ajouter_factures(Queue<String>facture){

    
       String plat;
       String[] lignes = new String[facture.size() + 2];
       int indice=0; // Indice pour le tableau de plats
        float total=0;
        
       while(!facture.isEmpty()){

        plat = facture.poll();

        switch(plat){

            case "Pate":
            plat = plat + " prix TTC: " + " 2,30$";
            lignes[indice] = plat; 
            total+=2.30;
            indice++;

            break;

            case "Pizza":     
            plat = plat + " prix TTC: " + " 2,40$";
            lignes[indice] = plat; // Plat avec son prix
            total+=2.40;
            indice++;

            break;

            default:
            plat = plat + " prix TTC:" + " unknown";
            total+=0.00;
            lignes[indice] = plat; // Plat avec son prix
            indice++;
            break;
        }

       }


       total = Math.round(total* 1000.0f) / 1000.0f; // Arrondis à deux chiffres

       lignes[indice] = "Le montant total est de " +total+"$"; // Montant total
       lignes[indice+1] = "-------------------------------";

       
       try(BufferedWriter writer = new BufferedWriter(new FileWriter("Facture.txt",true))){
       
        writer.newLine();
        writer.newLine();

            for(String ligne: lignes){

                writer.write(ligne);
                writer.newLine();
            
            }
        }catch(IOException e){

            e.printStackTrace();
        }      
    }

       }






