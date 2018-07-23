package com.ww.model;

public class Pay {
    private Integer id;

    private String payEmnumber;

    private String payEmname;

    private String payMonth;

    private Integer payBasemoney;

    private Integer payOvertime;

    private Integer payAge;

    private Float payCheck;

    private Float payAbsent;

    private Float paySafety;

    private Integer pay;
    public Integer getPay() {
		return pay;
	}

	public void setPay(Integer pay) {
		this.pay = pay;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayEmnumber() {
        return payEmnumber;
    }

    public void setPayEmnumber(String payEmnumber) {
        this.payEmnumber = payEmnumber == null ? null : payEmnumber.trim();
    }

    public String getPayEmname() {
        return payEmname;
    }

    public void setPayEmname(String payEmname) {
        this.payEmname = payEmname == null ? null : payEmname.trim();
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth == null ? null : payMonth.trim();
    }

    public Integer getPayBasemoney() {
        return payBasemoney;
    }

    public void setPayBasemoney(Integer payBasemoney) {
        this.payBasemoney = payBasemoney;
    }

    public Integer getPayOvertime() {
        return payOvertime;
    }

    public void setPayOvertime(Integer payOvertime) {
        this.payOvertime = payOvertime;
    }

    public Integer getPayAge() {
        return payAge;
    }

    public void setPayAge(Integer payAge) {
        this.payAge = payAge;
    }

    public Float getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(Float payCheck) {
        this.payCheck = payCheck;
    }

    public Float getPayAbsent() {
        return payAbsent;
    }

    public void setPayAbsent(Float payAbsent) {
        this.payAbsent = payAbsent;
    }

    public Float getPaySafety() {
        return paySafety;
    }

    public void setPaySafety(Float paySafety) {
        this.paySafety = paySafety;
    }
}