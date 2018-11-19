package com.java.pojo;
// Generated 2018-11-19 15:53:12 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Lodger generated by hbm2java
 */
public class Lodger implements java.io.Serializable {

	private int id;
	private String lodgingInfoId;
	private String certificate;
	private String certificateNo;
	private String lodgerName;
	private String sex;
	private String isRegister;
	private String phone;
	private String note;
	private Date createDate;

	public Lodger() {
	}

	public Lodger(int id) {
		this.id = id;
	}

	public Lodger(int id, String lodgingInfoId, String certificate, String certificateNo, String lodgerName, String sex,
			String isRegister, String phone, String note, Date createDate) {
		this.id = id;
		this.lodgingInfoId = lodgingInfoId;
		this.certificate = certificate;
		this.certificateNo = certificateNo;
		this.lodgerName = lodgerName;
		this.sex = sex;
		this.isRegister = isRegister;
		this.phone = phone;
		this.note = note;
		this.createDate = createDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLodgingInfoId() {
		return this.lodgingInfoId;
	}

	public void setLodgingInfoId(String lodgingInfoId) {
		this.lodgingInfoId = lodgingInfoId;
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getLodgerName() {
		return this.lodgerName;
	}

	public void setLodgerName(String lodgerName) {
		this.lodgerName = lodgerName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIsRegister() {
		return this.isRegister;
	}

	public void setIsRegister(String isRegister) {
		this.isRegister = isRegister;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
