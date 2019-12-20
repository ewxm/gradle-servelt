package com.zy.demo.bean;

/**
 * 打印前要渲染的数据单元
 */
public class RenderCell {

    /**
     * 年
     */
    private int year;
    /**
     * 月份
     */
    private int month;
    /**
     * 14位编码
     */
    private String archivesNo;

    /**
     * 8位编码
     */
    private String otherNo;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getArchivesNo() {
        return archivesNo;
    }

    public void setArchivesNo(String archivesNo) {
        this.archivesNo = archivesNo;
    }

    public String getOtherNo() {
        return otherNo;
    }

    public void setOtherNo(String otherNo) {
        this.otherNo = otherNo;
    }

    @Override
    public String toString() {
        return "RenderData{" +
                "year=" + year +
                ", month=" + month +
                ", archivesNo='" + archivesNo + '\'' +
                ", otherNo='" + otherNo + '\'' +
                '}';
    }
}
