/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author FSche
 */
@Entity
@Data
class Anzeige implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private ArtDerAnzeige art;
    private String titel;
    
    @Lob
    private String beschreibung;
    private Date einstellungsdatum;
    private Date erstellungsdatum;
    
    @Column(scale = 2)
    private long preisvorstellung;
    private ArtDesPreises artDesPreises;
    private int postleitzahl;
    private String ort;
    
    @ManyToOne
    private Benutzer benutzer;

    @ManyToMany(mappedBy = "anzeigen")
    private List<Benutzer> list_benutzer;
    
    @OneToMany(mappedBy = "anzeige")
    private List<Foto> fotos;
    
    @ManyToMany(mappedBy = "anzeigen")
    private List<Kategorie> kategorien;
}
