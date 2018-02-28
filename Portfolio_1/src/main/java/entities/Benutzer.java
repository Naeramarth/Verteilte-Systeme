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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author FSche
 */
@Entity
@Data
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String benutzername;
    
    private String passwortHash;
    private String vorname;
    private String nachname;
    private String strasse;
    private String hausnummer; //String weil zb 2a auch mgl ist
    private int postleitzahl;
    private String ort;
    private String land;
    private String eMail;
    private String telefonnummer;
    
    @OneToMany(mappedBy = "benutzer")
    private List<Nachricht> nachrichten;
    
    @OneToMany(mappedBy = "benutzer")
    private List<Anzeige> anzeige;
    
    @ManyToMany(mappedBy = "list_benutzer")
    private List<Anzeige> anzeigen;
    
}
