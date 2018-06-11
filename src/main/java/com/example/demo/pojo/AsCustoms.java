package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * 代理商客户表
 */
@Entity(name="as_customs")
public class AsCustoms {
    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public void setCustomType(int customType) {
        this.customType = customType;
    }

    public void setCustomTypeName(String customTypeName) {
        this.customTypeName = customTypeName;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public void setCustomStatus(int customStatus) {
        this.customStatus = customStatus;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public void setRegDatetime(Date regDatetime) {
        this.regDatetime = regDatetime;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    @Id
    @GeneratedValue
    private int id;//编号
    @Column(name="agentId")
    private int agentId;
    @Column(name="agentName")
    private String agentName;
    @Column(name="customName")
    private String customName;
    @Column(name="customType")
    private int customType;
    @Column(name="customTypeName")
    private String customTypeName;
    @Column(name="siteUrl")
    private String siteUrl;
    @Column(name="customStatus")
    private int customStatus;
    @Column(name="bossName")
    private String bossName;
    @Column(name="cardType")
    private int cardType;
    @Column(name="cardTypeName")
    private String cardTypeName;
    @Column(name="cardNum")
    private String cardNum;
    @Column(name="cardTypeName")
    private String companyTel;
    @Column(name="companyFax")
    private String companyFax;
    @Column(name="regDatetime")
    private Date regDatetime;
    @Column(name="country")
    private String country;
    @Column(name="province")
    private String province;
    @Column(name="city")
    private String city;
    @Column(name="area")
    private String area;

    public int getId() {
        return id;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getCustomName() {
        return customName;
    }

    public int getCustomType() {
        return customType;
    }

    public String getCustomTypeName() {
        return customTypeName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public int getCustomStatus() {
        return customStatus;
    }

    public String getBossName() {
        return bossName;
    }

    public int getCardType() {
        return cardType;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public Date getRegDatetime() {
        return regDatetime;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getMemo() {
        return memo;
    }

    public String getAgentCode() {
        return agentCode;
    }

    @Column(name="companyAddress")
    private String companyAddress;
    @Column(name="memo")
    private String memo;
    @Column(name="agentCode")
    private String agentCode;

}
