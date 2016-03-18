package com.objis.demowebservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.demowebservice.domaine.DemandeFormation;
import com.objis.demowebservice.GestionDemandeFormation;

public final class Client {

    public Client() {
    }

    public static void main(String args[]) throws Exception {
         ClassPathXmlApplicationContext context = 
        	 new ClassPathXmlApplicationContext(new String[] {"com/objis/demowebservice/client/client-beans.xml"});

         GestionDemandeFormation client = (GestionDemandeFormation) context.getBean("commandeClient");
         DemandeFormation demande = new DemandeFormation();
         demande.setName("Paul DURAND");
         demande.setTheme("WEB SERVICES");

        String demandeID = client.traitementDemande(demande);
        String message = (demandeID == null) ? "Demande refusée" : "Demande acceptée; Identifiant de demande " + demandeID;
		System.out.println(message);
            
    }
}