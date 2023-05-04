package org.lidem.cfa.garagejee.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String nom;

    @OneToMany(mappedBy = "employe")
    private List<RDV> rdvs;

    // Constructeurs
    public Employe() {
    }

    public Employe(String type, String nom) {
        this.type = type;
        this.nom = nom;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<RDV> getRdvs() {
        return rdvs;
    }

    public void setRdvs(List<RDV> rdvs) {
        this.rdvs = rdvs;
    }
}
