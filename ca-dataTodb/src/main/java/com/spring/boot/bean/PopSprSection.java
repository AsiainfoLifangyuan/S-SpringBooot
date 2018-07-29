package com.spring.boot.bean;

import java.util.Date;

public class PopSprSection {

    private Integer id;

    private String sectionNo;

    private String baseSprName;

    private String backupSprName;

    private String issftp;

    private String isbase;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getBaseSprName() {
        return baseSprName;
    }

    public void setBaseSprName(String baseSprName) {
        this.baseSprName = baseSprName;
    }

    public String getBackupSprName() {
        return backupSprName;
    }

    public void setBackupSprName(String backupSprName) {
        this.backupSprName = backupSprName;
    }

    public String getIssftp() {
        return issftp;
    }

    public void setIssftp(String issftp) {
        this.issftp = issftp;
    }

    public String getIsbase() {
        return isbase;
    }

    public void setIsbase(String isbase) {
        this.isbase = isbase;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
