/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "films", catalog = "tpear", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Films.findAll", query = "SELECT f FROM Films f"),
    @NamedQuery(name = "Films.findByDate", query = "SELECT f FROM Films f WHERE f.date = :date"),
    @NamedQuery(name = "Films.findByDescription", query = "SELECT f FROM Films f WHERE f.description = :description"),
    @NamedQuery(name = "Films.findByFichier", query = "SELECT f FROM Films f WHERE f.fichier = :fichier"),
    @NamedQuery(name = "Films.findByIdFilm", query = "SELECT f FROM Films f WHERE f.idFilm = :idFilm"),
    @NamedQuery(name = "Films.findByNom", query = "SELECT f FROM Films f WHERE f.nom = :nom")})
public class Films implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 10000)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "fichier")
    private String fichier;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFilm")
    private Integer idFilm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nom")
    private String nom;
    @JoinColumn(name = "categorie", referencedColumnName = "idCategorie")
    @ManyToOne(optional = false)
    private Categories categorie;

    public Films() {
    }

    public Films(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public Films(Integer idFilm, Date date, String fichier, String nom) {
        this.idFilm = idFilm;
        this.date = date;
        this.fichier = fichier;
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFilm != null ? idFilm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Films)) {
            return false;
        }
        Films other = (Films) object;
        if ((this.idFilm == null && other.idFilm != null) || (this.idFilm != null && !this.idFilm.equals(other.idFilm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Films[ idFilm=" + idFilm + " ]";
    }
    
}
