/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.Qsmart.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author Ashok
 */
@Entity
@Table(name = "tbl_service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblService.findAll", query = "SELECT t FROM TblService t")
    , @NamedQuery(name = "TblService.findByServiceId", query = "SELECT t FROM TblService t WHERE t.serviceId = :serviceId")
    , @NamedQuery(name = "TblService.findByServiceNameEn", query = "SELECT t FROM TblService t WHERE t.serviceNameEn = :serviceNameEn")
    , @NamedQuery(name = "TblService.findByServiceNameAr", query = "SELECT t FROM TblService t WHERE t.serviceNameAr = :serviceNameAr")
    , @NamedQuery(name = "TblService.findByServicePrefix", query = "SELECT t FROM TblService t WHERE t.servicePrefix = :servicePrefix")
    , @NamedQuery(name = "TblService.findByBeginSeq", query = "SELECT t FROM TblService t WHERE t.beginSeq = :beginSeq")
    , @NamedQuery(name = "TblService.findByEndSeq", query = "SELECT t FROM TblService t WHERE t.endSeq = :endSeq")
    , @NamedQuery(name = "TblService.findByBranchId", query = "SELECT t FROM TblService t WHERE t.branchId = :branchId")
    , @NamedQuery(name = "TblService.findByCreatedBy", query = "SELECT t FROM TblService t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TblService.findByCreatedOn", query = "SELECT t FROM TblService t WHERE t.createdOn = :createdOn")
    , @NamedQuery(name = "TblService.findByUpdatedBy", query = "SELECT t FROM TblService t WHERE t.updatedBy = :updatedBy")
    , @NamedQuery(name = "TblService.findByUpdatedOn", query = "SELECT t FROM TblService t WHERE t.updatedOn = :updatedOn")})
public class TblService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private Integer serviceId;
    @Size(max = 45)
    @Column(name = "service_name_en")
    private String serviceNameEn;
    @Size(max = 45)
    @Column(name = "service_name_ar")
    private String serviceNameAr;
    @Size(max = 45)
    @Column(name = "service_prefix")
    private String servicePrefix;
    @Column(name = "begin_seq")
    private Integer beginSeq;
    @Column(name = "end_seq")
    private Integer endSeq;
    @Column(name = "branch_id")
    private Integer branchId;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public TblService() {
    }

    public TblService(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceNameEn() {
        return serviceNameEn;
    }

    public void setServiceNameEn(String serviceNameEn) {
        this.serviceNameEn = serviceNameEn;
    }

    public String getServiceNameAr() {
        return serviceNameAr;
    }

    public void setServiceNameAr(String serviceNameAr) {
        this.serviceNameAr = serviceNameAr;
    }

    public String getServicePrefix() {
        return servicePrefix;
    }

    public void setServicePrefix(String servicePrefix) {
        this.servicePrefix = servicePrefix;
    }

    public Integer getBeginSeq() {
        return beginSeq;
    }

    public void setBeginSeq(Integer beginSeq) {
        this.beginSeq = beginSeq;
    }

    public Integer getEndSeq() {
        return endSeq;
    }

    public void setEndSeq(Integer endSeq) {
        this.endSeq = endSeq;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
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
        hash += (serviceId != null ? serviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblService)) {
            return false;
        }
        TblService other = (TblService) object;
        if ((this.serviceId == null && other.serviceId != null) || (this.serviceId != null && !this.serviceId.equals(other.serviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vm.Qsmart.model.TblService[ serviceId=" + serviceId + " ]";
    }
    
}
