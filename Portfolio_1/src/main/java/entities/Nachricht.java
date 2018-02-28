/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author FSche
 */
@Entity
@Data
class Nachricht implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String vonBenutzer;
    private String anBenutzer;
    private String zuArtikel;
    
    @Lob
    private String text;
    
    @ManyToOne
    private Benutzer benutzer;    
}
