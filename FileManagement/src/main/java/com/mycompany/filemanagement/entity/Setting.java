/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author root
 */
@Entity
@Table(name="setting")
public class Setting {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="maxfilesize")
    private double maxFileSize;
    @Column(name="itemperpage")
    private int itemPerPage;
    @Column(name="mimetypeallowed")
    private String mimeTypeAllowed;
    @Column(name="lastupdatedtime")
    private Date lastUpdateTime;

    public Setting() {
    }

    public Setting(double maxFileSize, int itemPerPage, String mimeTypeAllowed, Date lastUpdateTime) {
        this.maxFileSize = maxFileSize;
        this.itemPerPage = itemPerPage;
        this.mimeTypeAllowed = mimeTypeAllowed;
        this.lastUpdateTime = lastUpdateTime;
    }

    public Setting(int id, double maxFileSize, int itemPerPage, String mimeTypeAllowed, Date lastUpdateTime) {
        this.id = id;
        this.maxFileSize = maxFileSize;
        this.itemPerPage = itemPerPage;
        this.mimeTypeAllowed = mimeTypeAllowed;
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getId() {
        return id;
    }

    public double getMaxFileSize() {
        return maxFileSize;
    }

    public int getItemPerPage() {
        return itemPerPage;
    }

    public String getMimeTypeAllowed() {
        return mimeTypeAllowed;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaxFileSize(double maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public void setItemPerPage(int itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public void setMimeTypeAllowed(String mimeTypeAllowed) {
        this.mimeTypeAllowed = mimeTypeAllowed;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
