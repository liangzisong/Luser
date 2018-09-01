package com.Luser.user.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -873030022505458807L;
	private Integer pk_id;
	private Integer fk_id;
	private String user_account;
	private String user_name;
	private String user_password;
	private Date hiredate;
	private String phone;
	private String position;
	private Integer sex;
	private Date birthday;
	private Integer marital_status;
	private String identity_card;
	public Integer getPk_id() {
		return pk_id;
	}
	public void setPk_id(Integer pk_id) {
		this.pk_id = pk_id;
	}
	public Integer getFk_id() {
		return fk_id;
	}
	public void setFk_id(Integer fk_id) {
		this.fk_id = fk_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(Integer marital_status) {
		this.marital_status = marital_status;
	}
	public String getIdentity_card() {
		return identity_card;
	}
	public void setIdentity_card(String identity_card) {
		this.identity_card = identity_card;
	}
	@Override
	public String toString() {
		return "User [pk_id=" + pk_id + ", fk_id=" + fk_id + ", user_account=" + user_account + ", user_name="
				+ user_name + ", user_password=" + user_password + ", hiredate=" + hiredate + ", phone=" + phone
				+ ", position=" + position + ", sex=" + sex + ", birthday=" + birthday + ", marital_status="
				+ marital_status + ", identity_card=" + identity_card + "]";
	}
	
}
