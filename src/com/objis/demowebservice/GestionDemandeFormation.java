package com.objis.demowebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.objis.demowebservice.domaine.DemandeFormation;

@WebService
public interface GestionDemandeFormation {
	@WebMethod
	String traitementDemande(DemandeFormation demande);
}
