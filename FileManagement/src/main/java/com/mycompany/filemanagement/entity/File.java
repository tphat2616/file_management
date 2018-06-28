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
@Table(name="file")
public class File {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="path")
    private String path;
    @Column(name="createddatetime ")
    private Date createdDate;
    @Column(name="filesize")
    private double fileSize;
    @Column(name="mime ")
    private String mime;
    @Column(name="numberofdownload")
    private int numOfDownload;
    @Column(name="version")
    private int version;
    @Column(name="status")
    private boolean status;
    @Column(name="versionlds")
    private String versionlds;
   

    public File(int id, String name, String path, Date createdDate, double fileSize, String mime, int numOfDownload, int version, boolean status, String versionlds) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.createdDate = createdDate;
        this.fileSize = fileSize;
        this.mime = mime;
        this.numOfDownload = numOfDownload;
        this.version = version;
        this.status = status;
        this.versionlds = versionlds;
    }

    public File() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getMime() {
        return mime;
    }

    public int getNumOfDownload() {
        return numOfDownload;
    }

    public int getVersion() {
        return version;
    }

    public boolean isStatus() {
        return status;
    }

    public String getVersionlds() {
        return versionlds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public void setNumOfDownload(int numOfDownload) {
        this.numOfDownload = numOfDownload;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setVersionlds(String versionlds) {
        this.versionlds = versionlds;
    }
}
