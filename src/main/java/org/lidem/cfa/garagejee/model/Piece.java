package org.lidem.cfa.garagejee.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private BigDecimal prixUnitaire;
    private int stock;

    @ManyToMany(mappedBy = "pieces")
    private List<Commande> commandes;

    // Constructeurs
    public Piece() {
    }

    public Piece(String nom, String description, BigDecimal prixUnitaire, int stock) {
        this.nom = nom;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
        this.stock = stock;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
