package org.lidem.cfa.garagejee.model;
import java.util.List;
import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private boolean isActive;

    @OneToMany(mappedBy = "client")
    private List<RDV> rdvs;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    // Constructeurs
    public Client() {
    }

    public Client(String nom, String adresse, boolean isActive) {
        this.nom = nom;
        this.adresse = adresse;
        this.isActive = isActive;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<RDV> getRdvs() {
        return rdvs;
    }

    public void setRdvs(List<RDV> rdvs) {
        this.rdvs = rdvs;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
