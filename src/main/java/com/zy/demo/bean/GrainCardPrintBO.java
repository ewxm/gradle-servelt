package com.zy.demo.bean;

/**
 * 粮油卡打印视图
 */
public class GrainCardPrintBO {
    private String personName; //姓名 hzb02
    private String idCard; //身份证号 hzb02

    private String archivesNo; //档案编号 hab01
    private String jwRegion; //所属居委 hab01
    private String bizNo; //业务类型 hab01
    private String regionId; //所属居委 hab01
    private String eventId; //基础事件id hab01


    private String objectType; //对象类别 hzb17

    private String projectNo; //救助项目 //hzb04

    private String personId; //救助对象编号 hzb04

    private String objectTypeId; //对象类别编号

    private String treatmentStartMonth; //待遇开始年月 hzb04

    private String treatmentEndMonth; //待遇结束年月 hzb04

    private String jzTreatmentSummaryId; //救助待遇汇总编号

    private String grainCardShop; //粮油供应商店

    private String jwRegionId; //居委代码

    @Override
    public String toString() {
        return "GrainCardPrintBO{" +
                "personName='" + personName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", archivesNo='" + archivesNo + '\'' +
                ", jwRegion='" + jwRegion + '\'' +
                ", bizNo='" + bizNo + '\'' +
                ", regionId='" + regionId + '\'' +
                ", eventId='" + eventId + '\'' +
                ", objectType='" + objectType + '\'' +
                ", projectNo='" + projectNo + '\'' +
                ", personId='" + personId + '\'' +
                ", objectTypeId='" + objectTypeId + '\'' +
                ", treatmentStartMonth='" + treatmentStartMonth + '\'' +
                ", treatmentEndMonth='" + treatmentEndMonth + '\'' +
                ", jzTreatmentSummaryId='" + jzTreatmentSummaryId + '\'' +
                ", grainCardShop='" + grainCardShop + '\'' +
                ", jwRegionId='" + jwRegionId + '\'' +
                '}';
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getArchivesNo() {
        return archivesNo;
    }

    public void setArchivesNo(String archivesNo) {
        this.archivesNo = archivesNo;
    }

    public String getJwRegion() {
        return jwRegion;
    }

    public void setJwRegion(String jwRegion) {
        this.jwRegion = jwRegion;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(String objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public String getTreatmentStartMonth() {
        return treatmentStartMonth;
    }

    public void setTreatmentStartMonth(String treatmentStartMonth) {
        this.treatmentStartMonth = treatmentStartMonth;
    }

    public String getTreatmentEndMonth() {
        return treatmentEndMonth;
    }

    public void setTreatmentEndMonth(String treatmentEndMonth) {
        this.treatmentEndMonth = treatmentEndMonth;
    }

    public String getJzTreatmentSummaryId() {
        return jzTreatmentSummaryId;
    }

    public void setJzTreatmentSummaryId(String jzTreatmentSummaryId) {
        this.jzTreatmentSummaryId = jzTreatmentSummaryId;
    }

    public String getGrainCardShop() {
        return grainCardShop;
    }

    public void setGrainCardShop(String grainCardShop) {
        this.grainCardShop = grainCardShop;
    }

    public String getJwRegionId() {
        return jwRegionId;
    }

    public void setJwRegionId(String jwRegionId) {
        this.jwRegionId = jwRegionId;
    }
}
