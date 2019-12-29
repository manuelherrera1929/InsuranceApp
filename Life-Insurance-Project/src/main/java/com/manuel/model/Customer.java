package com.manuel.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cust_id;
	
	private String cust_name;
	private String father_name;
	private int age;
	private char sex;
	private Date date;
	private String qualification;
	private String address;
	private String occupation;
	private String password;
	private String email;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=CustomerPolicyRegistration.class)
	@JoinColumn(name="cust_policy_id")
	private Set<CustomerPolicyRegistration> CustomerPolicyRegistration = new HashSet<>();
	
	@OneToMany(cascade=CascadeType.ALL, targetEntity=Branch.class)
	@JoinColumn(name="branch_id")
	private Set<Branch> Branch = new HashSet<>();
	
	public Customer(int cust_id, String cust_name, String father_name, int age, char sex, Date date,
			String qualification, String address, int branch_id, String occupation, String password, String email) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.father_name = father_name;
		this.age = age;
		this.sex = sex;
		this.date = date;
		this.qualification = qualification;
		this.address = address;
		this.occupation = occupation;
		this.password = password;
		this.email = email;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
