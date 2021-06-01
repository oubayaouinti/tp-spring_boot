package com.oubay.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.oubay.produits.entities.produit;
import com.oubay.produits.repos.ProduitRepository;
@Service
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	ProduitRepository produitRepository;
	
	
	
	@Override
	public produit saveProduit(produit p) {
		
		return produitRepository.save(p);
	}

	@Override
	public produit updateProduit(produit p) {
		
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(produit p) {
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public List<produit> getAllProduits() {
		return produitRepository.findAll();
		 
	}

	@Override
	public Page<produit> getAllProduitsParPage(int page, int size) {
		return produitRepository.findAll(PageRequest.of(page, size));
	}

}
