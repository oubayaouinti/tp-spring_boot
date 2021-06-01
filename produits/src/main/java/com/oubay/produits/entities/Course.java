package com.oubay.produits.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCourse;
	private String nomCourse;
	private Double prixCourse;
	private Date dateCreation;
	
	
	@ManyToOne
	private Categorie categorie;
	
	
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(String nomCourse, Double prixCourse, Date dateCreation) {
		super();
		this.nomCourse = nomCourse;
		this.prixCourse = prixCourse;
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the idProduit
	 */
	public Long getIdCourse() {
		return idCourse;
	}
	/**
	 * @param idProduit the idProduit to set
	 */
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
	/**
	 * @return the nomProduit
	 */
	public String getNomProduit() {
		return nomCourse;
	}
	/**
	 * @param nomProduit the nomProduit to set
	 */
	public void setNomCourse(String nomCourse) {
		this.nomCourse = nomCourse;
	}
	/**
	 * @return the prixProduit
	 */
	public Double getPrixCourse() {
		return prixCourse;
	}
	/**
	 * @param prixProduit the prixProduit to set
	 */
	public void setPrixCourse(Double prixCourse) {
		this.prixCourse = prixCourse;
	}
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", nomCourse=" + nomCourse + ", prixCourse=" + prixCourse
				+ ", dateCreation=" + dateCreation + "]";
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	

}
