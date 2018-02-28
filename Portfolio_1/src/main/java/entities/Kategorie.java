/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
class Kategorie {

    private static final long serialVersionUID = 1L;
    @Id
    private String slug;

    private String name;
    
    @ManyToMany(mappedBy = "kategorien")
    private List<Anzeige> anzeigen;
    
    @OneToMany(mappedBy = "kategorie")
    private List<Kategorie> kategorien;
    @ManyToOne
    private Kategorie kategorie;
    
}
