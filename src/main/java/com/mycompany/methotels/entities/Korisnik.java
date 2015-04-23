/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Fedor
 */
@Entity
@Table(name = "korisnik")
@NamedQueries({
    @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k")})
public class Korisnik implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KORISNIKID")
    private Integer korisnikid;
    @Column(name = "IME")
    private String ime;
    @Column(name = "PREZIME")
    private String prezime;
    @Column(name = "TELEFON")
    private Integer telefon;
    @OneToMany(mappedBy = "korisnikid")
    private List<Soba> sobaList;

    public Korisnik() {
    }

    public Korisnik(Integer korisnikid) {
        this.korisnikid = korisnikid;
    }

    public Integer getKorisnikid() {
        return korisnikid;
    }

    public void setKorisnikid(Integer korisnikid) {
        this.korisnikid = korisnikid;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public List<Soba> getSobaList() {
        return sobaList;
    }

    public void setSobaList(List<Soba> sobaList) {
        this.sobaList = sobaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (korisnikid != null ? korisnikid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnik)) {
            return false;
        }
        Korisnik other = (Korisnik) object;
        if ((this.korisnikid == null && other.korisnikid != null) || (this.korisnikid != null && !this.korisnikid.equals(other.korisnikid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.methotels.entities.Korisnik[ korisnikid=" + korisnikid + " ]";
    }
    
}
