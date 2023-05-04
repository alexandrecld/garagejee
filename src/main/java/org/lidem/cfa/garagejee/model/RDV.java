package org.lidem.cfa.garagejee.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RDV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime checkIn;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructeurs
    public RDV() {
    }

    public RDV(LocalDateTime checkIn, Employe employe, Client client) {
        this.checkIn = checkIn;
        this.employe = employe;
        this.client = client;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
