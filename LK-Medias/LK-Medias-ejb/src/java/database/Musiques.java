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
@Table(name = "musiques", catalog = "tpear", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musiques.findAll", query = "SELECT m FROM Musiques m"),
    @NamedQuery(name = "Musiques.findByIdMusique", query = "SELECT m FROM Musiques m WHERE m.idMusique = :idMusique"),
    @NamedQuery(name = "Musiques.findByTitre", query = "SELECT m FROM Musiques m WHERE m.titre = :titre"),
    @NamedQuery(name = "Musiques.findByAlbum", query = "SELECT m FROM Musiques m WHERE m.album = :album"),
    @NamedQuery(name = "Musiques.findByDate", query = "SELECT m FROM Musiques m WHERE m.date = :date"),
    @NamedQuery(name = "Musiques.findByFichier", query = "SELECT m FROM Musiques m WHERE m.fichier = :fichier"),
    @NamedQuery(name = "Musiques.findByGroupe", query = "SELECT m FROM Musiques m WHERE m.groupe = :groupe")})
public class Musiques implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMusique")
    private Integer idMusique;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "album")
    private String album;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "fichier")
    private String fichier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "groupe")
    private String groupe;
    @JoinColumn(name = "genre", referencedColumnName = "idGenre")
    @ManyToOne(optional = false)
    private Genre genre;

    public Musiques() {
    }

    public Musiques(Integer idMusique) {
        this.idMusique = idMusique;
    }

    public Musiques(Integer idMusique, String titre, String album, Date date, String fichier, String groupe) {
        this.idMusique = idMusique;
        this.titre = titre;
        this.album = album;
        this.date = date;
        this.fichier = fichier;
        this.groupe = groupe;
    }

    public Integer getIdMusique() {
        return idMusique;
    }

    public void setIdMusique(Integer idMusique) {
        this.idMusique = idMusique;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMusique != null ? idMusique.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musiques)) {
            return false;
        }
        Musiques other = (Musiques) object;
        if ((this.idMusique == null && other.idMusique != null) || (this.idMusique != null && !this.idMusique.equals(other.idMusique))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Musiques[ idMusique=" + idMusique + " ]";
    }
    
}
