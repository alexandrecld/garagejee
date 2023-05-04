package org.lidem.cfa.garagejee.model;
import javax.persistence.*;


@Entity
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String immatriculation;
    private String modele;
    private String marque;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructeurs
    public Vehicule() {
    }

    public Vehicule(String immatriculation, String modele, String marque, Client client) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.marque = marque;
        this.client = client;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
