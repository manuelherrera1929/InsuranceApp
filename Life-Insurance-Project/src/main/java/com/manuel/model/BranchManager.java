package com.manuel.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class BranchManager {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int manager_id;
	
	private String name;
	private String father_name;
	private int age;
	private char sex;
	private Date date;
	private String qualification;
	private String address;
	private String branch_state;
	private String branch_cities;
	private String branch_address;
	private String password;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Branch.class)
	@JoinColumn(name="branch_id")
	private Set<Branch> Branch = new HashSet<>();
	
	public BranchManager(int manager_id, String name, String father_name, int age, char sex, Date date,
			String qualification, String address, String branch_state, String branch_cities, String branch_address,
			String password) {
		super();
		this.manager_id = manager_id;
		this.name = name;
		this.father_name = father_name;
		this.age = age;
		this.sex = sex;
		this.date = date;
		this.qualification = qualification;
		this.address = address;
		this.branch_state = branch_state;
		this.branch_cities = branch_cities;
		this.branch_address = branch_address;
		this.password = password;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getBranch_state() {
		return branch_state;
	}

	public void setBranch_state(String branch_state) {
		this.branch_state = branch_state;
	}

	public String getBranch_cities() {
		return branch_cities;
	}

	public void setBranch_cities(String branch_cities) {
		this.branch_cities = branch_cities;
	}

	public String getBranch_address() {
		return branch_address;
	}

	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
