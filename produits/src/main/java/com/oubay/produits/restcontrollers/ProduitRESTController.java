package com.oubay.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oubay.produits.entities.produit;
import com.oubay.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
public class ProduitRESTController {
	@Autowired
	ProduitService produitService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	List<produit> getAllProduits()
	{
		return produitService.getAllProduits();
		
	}

}
