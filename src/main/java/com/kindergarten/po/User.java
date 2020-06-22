package com.kindergarten.po;

import javax.persistence.Id;
import java.util.Date;

public class User {

    @Id
    private Integer id;
    private String name;
    private String sex;
    private String password;
    private String nation;
    private String cardNum;
    private String cardZPic;
    private String cardFPic;
    private String address;
    private String hksyPic;
    private String hkhzPic;
    private String hketbryPic;
    private String etyfjzz;
    private String fczPic;
    private String jzbs;
    private String etbs;
    private String fName;
    private String mName;
    private Integer fAge;
    private Integer mAge;
    private String hyqk;
    private String mTel;
    private String fTel;
    private String fWork;
    private String mWork;
    private Date regtime;
    private String gmy;
    private String type;
    private Date bmtime;
    private String status;
    private String kName;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardZPic() {
        return cardZPic;
    }

    public void setCardZPic(String cardZPic) {
        this.cardZPic = cardZPic;
    }

    public String getCardFPic() {
        return cardFPic;
    }

    public void setCardFPic(String cardFPic) {
        this.cardFPic = cardFPic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHksyPic() {
        return hksyPic;
    }

    public void setHksyPic(String hksyPic) {
        this.hksyPic = hksyPic;
    }

    public String getHkhzPic() {
        return hkhzPic;
    }

    public void setHkhzPic(String hkhzPic) {
        this.hkhzPic = hkhzPic;
    }

    public String getHketbryPic() {
        return hketbryPic;
    }

    public void setHketbryPic(String hketbryPic) {
        this.hketbryPic = hketbryPic;
    }

    public String getEtyfjzz() {
        return etyfjzz;
    }

    public void setEtyfjzz(String etyfjzz) {
        this.etyfjzz = etyfjzz;
    }

    public String getFczPic() {
        return fczPic;
    }

    public void setFczPic(String fczPic) {
        this.fczPic = fczPic;
    }

    public String getJzbs() {
        return jzbs;
    }

    public void setJzbs(String jzbs) {
        this.jzbs = jzbs;
    }

    public String getEtbs() {
        return etbs;
    }

    public void setEtbs(String etbs) {
        this.etbs = etbs;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Integer getfAge() {
        return fAge;
    }

    public void setfAge(Integer fAge) {
        this.fAge = fAge;
    }

    public Integer getmAge() {
        return mAge;
    }

    public void setmAge(Integer mAge) {
        this.mAge = mAge;
    }

    public String getHyqk() {
        return hyqk;
    }

    public void setHyqk(String hyqk) {
        this.hyqk = hyqk;
    }

    public String getmTel() {
        return mTel;
    }

    public void setmTel(String mTel) {
        this.mTel = mTel;
    }

    public String getfTel() {
        return fTel;
    }

    public void setfTel(String fTel) {
        this.fTel = fTel;
    }

    public String getfWork() {
        return fWork;
    }

    public void setfWork(String fWork) {
        this.fWork = fWork;
    }

    public String getmWork() {
        return mWork;
    }

    public void setmWork(String mWork) {
        this.mWork = mWork;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getGmy() {
        return gmy;
    }

    public void setGmy(String gmy) {
        this.gmy = gmy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBmtime() {
        return bmtime;
    }

    public void setBmtime(Date bmtime) {
        this.bmtime = bmtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\n' +
                ", sex='" + sex + '\n' +
                ", password='" + password + '\n' +
                ", nation='" + nation + '\n' +
                ", cardNum='" + cardNum + '\n' +
                ", cardZPic='" + cardZPic + '\n' +
                ", cardFPic='" + cardFPic + '\n' +
                ", address='" + address + '\n' +
                ", hksyPic='" + hksyPic + '\n' +
                ", hkhzPic='" + hkhzPic + '\n' +
                ", hketbryPic='" + hketbryPic + '\n' +
                ", etyfjzz='" + etyfjzz + '\n' +
                ", fczPic='" + fczPic + '\n' +
                ", jzbs='" + jzbs + '\n' +
                ", etbs='" + etbs + '\n' +
                ", fName='" + fName + '\n' +
                ", mName='" + mName + '\n' +
                ", fAge=" + fAge +
                ", mAge=" + mAge +
                ", hyqk='" + hyqk + '\n' +
                ", mTel='" + mTel + '\n' +
                ", fTel='" + fTel + '\n' +
                ", fWork='" + fWork + '\n' +
                ", mWork='" + mWork + '\n' +
                ", regtime=" + regtime +
                ", gmy='" + gmy + '\n' +
                ", type='" + type + '\n' +
                ", bmtime=" + bmtime +
                ", status='" + status + '\n' +
                ", kName='" + kName + '\n' +
                '}';
    }
}
