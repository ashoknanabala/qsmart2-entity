/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.Qsmart.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ashok
 */
@Entity
@Table(name = "tbl_location")
@XmlRootElement
public class TblLocation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "loc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locId;
    @Size(max = 45)
    @Column(name = "loc_name_en")
    private String locNameEn;
    @Size(max = 45)
    @Column(name = "loc_name_ar")
    private String locNameAr;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public TblLocation() {
    }

    public TblLocation(Integer locId) {
        this.locId = locId;
    }

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public String getLocNameEn() {
        return locNameEn;
    }

    public void setLocNameEn(String locNameEn) {
        this.locNameEn = locNameEn;
    }

    public String getLocNameAr() {
        return locNameAr;
    }

    public void setLocNameAr(String locNameAr) {
        this.locNameAr = locNameAr;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblLocation)) {
            return false;
        }
        TblLocation other = (TblLocation) object;
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vm.Qsmart.model.TblLocation[ locId=" + locId + " ]";
    }
    
}
