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

/**
 *
 * @author Ashok
 */
@Entity
@Table(name = "tbl_branch")
public class TblBranch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "branch_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branchId;
    @Size(max = 45)
    @Column(name = "branch_name_en")
    private String branchNameEn;
    @Size(max = 45)
    @Column(name = "branch_name_ar")
    private String branchNameAr;
    @Column(name = "location_id")
    private Integer locationId;
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

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchNameEn() {
        return branchNameEn;
    }

    public void setBranchNameEn(String branchNameEn) {
        this.branchNameEn = branchNameEn;
    }

    public String getBranchNameAr() {
        return branchNameAr;
    }

    public void setBranchNameAr(String branchNameAr) {
        this.branchNameAr = branchNameAr;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
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
    public String toString() {
        return "TblBranch{" + "branchId=" + branchId + ", branchNameEn=" + branchNameEn + ", branchNameAr=" + branchNameAr + ", locationId=" + locationId + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + '}';
    }

    
    
}
