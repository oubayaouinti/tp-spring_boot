package com.oubay.produits;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oubay.produits.entities.produit;
import com.oubay.produits.service.ProduitService;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {

	
	@Autowired
	ProduitService produitService;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitService.saveProduit(new produit("PC Dell", 2600.0, new Date()));
		produitService.saveProduit(new produit("PC Asus", 2800.0, new Date()));
		produitService.saveProduit(new produit("Imprimante Epson", 900.0, new Date()));		
	}

}
