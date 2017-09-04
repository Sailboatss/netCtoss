package com.lanou.bean;


import java.sql.Timestamp;

/**
 * Created by dllo on 2017/8/30.
 */
public class Cost {

    private Integer id;
    private String name;
    private Integer duration;
    private Double baseCost;
    private Double unitCost;
    private String status;
    private String descr;
    private Timestamp creaTime;
    private Timestamp starTime;
    private String costType;


    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", baseCost=" + baseCost +
                ", unitCost=" + unitCost +
                ", status='" + status + '\'' +
                ", descr='" + descr + '\'' +
                ", creaTime=" + creaTime +
                ", starTime=" + starTime +
                ", costType='" + costType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(Double baseCost) {
        this.baseCost = baseCost;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Timestamp getCreaTime() {
        return creaTime;
    }

    public void setCreaTime(Timestamp creaTime) {
        this.creaTime = creaTime;
    }

    public Timestamp getStarTime() {
        return starTime;
    }

    public void setStarTime(Timestamp starTime) {
        this.starTime = starTime;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }
}
